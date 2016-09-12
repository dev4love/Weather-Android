package cn.lovexiaov.weather.presentation.main;

import cn.lovexiaov.weather.data.WeatherRepository;
import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import cn.lovexiaov.weather.presentation.base.BasePresenter;
import com.orhanobut.logger.Logger;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 09-12 0012.
 */

public class WeatherPresenter extends BasePresenter<WeatherContract.View>
    implements WeatherContract.Presenter {

  WeatherRepository repository;

  public WeatherPresenter(WeatherRepository repository) {
    this.repository = repository;
  }

  @Override public void requestWeather(String city) {
    checkViewAttached();
    getView().showLoading();
    addSubscribtion(repository.requestWeather(city)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Subscriber<WeatherInfo>() {
          @Override public void onCompleted() {

          }

          @Override public void onError(Throwable e) {
            getView().hideLoading();
            getView().showError(e.getMessage());
          }

          @Override public void onNext(WeatherInfo weatherInfo) {
            getView().hideLoading();
            getView().showWeather(weatherInfo);
          }
        })

    );
  }

  @Override public void checkHourlyTrends() {

  }

  @Override public void check15DayTrends() {

  }
}
