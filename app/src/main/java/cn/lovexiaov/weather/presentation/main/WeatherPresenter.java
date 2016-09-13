package cn.lovexiaov.weather.presentation.main;

import cn.lovexiaov.weather.data.WeatherRepository;
import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import cn.lovexiaov.weather.model.Weather;
import cn.lovexiaov.weather.presentation.base.BasePresenter;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by lovexiaov on 09-12 0012.
 * Copyright reserved.
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
        .map(new Func1<WeatherInfo, Weather>() {
          @Override public Weather call(WeatherInfo weatherInfo) {
            WeatherInfo.DataBean dataBean = weatherInfo.data.get(0);

            Weather weather = new Weather();
            weather.setNow(dataBean.now);
            weather.setBasic(dataBean.basic);
            weather.setAlarms(dataBean.alarms);
            weather.setDailyForecast(dataBean.dailyForecast);
            weather.setHourlyForecast(dataBean.hourlyForecast);

            return weather;
          }
        })
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Subscriber<Weather>() {
          @Override public void onCompleted() {

          }

          @Override public void onError(Throwable e) {
            getView().hideLoading();
            getView().showError(e.getMessage());
          }

          @Override public void onNext(Weather weather) {
            getView().hideLoading();
            getView().showWeather(weather);
          }
        }));
  }

  @Override public void checkHourlyTrends() {

  }

  @Override public void checkDailyTrends() {

  }
}
