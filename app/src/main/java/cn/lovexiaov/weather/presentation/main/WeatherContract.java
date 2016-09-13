package cn.lovexiaov.weather.presentation.main;

import cn.lovexiaov.weather.model.Weather;
import cn.lovexiaov.weather.presentation.base.MvpPresenter;
import cn.lovexiaov.weather.presentation.base.MvpView;

/**
 * Created by lovexiaov on 09-09 0009.
 * Copyright reserved.
 */

public class WeatherContract {
  public interface View extends MvpView {
    void showWeather(Weather weatherInfo);

    void showHourlyTrends();

    void showFutureDayTrends();

    void showError(String message);

    void showLoading();

    void hideLoading();
  }

  public interface Presenter extends MvpPresenter<View> {
    void requestWeather(String city);

    void checkHourlyTrends();

    void checkDailyTrends();
  }
}
