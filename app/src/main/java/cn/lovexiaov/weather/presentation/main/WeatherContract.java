package cn.lovexiaov.weather.presentation.main;

import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import cn.lovexiaov.weather.presentation.base.MvpPresenter;
import cn.lovexiaov.weather.presentation.base.MvpView;

/**
 * Created by Administrator on 09-09 0009.
 */

public class WeatherContract {
  public interface View extends MvpView {
    void showWeather(WeatherInfo weatherInfo);

    void showHourlyTrends();

    void show15DayTrends();

    void showError(String message);

    void showLoading();

    void hideLoading();
  }

  public interface Presenter extends MvpPresenter<View> {
    void requestWeather(String city);

    void checkHourlyTrends();

    void check15DayTrends();
  }
}
