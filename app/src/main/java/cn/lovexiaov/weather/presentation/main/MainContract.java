package cn.lovexiaov.weather.presentation.main;

import cn.lovexiaov.weather.presentation.base.MvpPresenter;
import cn.lovexiaov.weather.presentation.base.MvpView;

/**
 * Created by Administrator on 09-09 0009.
 */

public class MainContract {
  public interface View extends MvpView {
    void showWeather();

    void showHourlyTrends();

    void show15DayTrends();

    void showError();

    void showLoading();

    void hideLoading();
  }

  public interface Presenter extends MvpPresenter<View> {
    void requestWeather();

    void checkHourlyTrends();

    void check15DayTrends();
  }
}
