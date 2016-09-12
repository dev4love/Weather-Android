package cn.lovexiaov.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.lovexiaov.weather.data.Injection;
import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import cn.lovexiaov.weather.presentation.main.WeatherContract;
import cn.lovexiaov.weather.presentation.main.WeatherPresenter;
import com.orhanobut.logger.Logger;

public class WeatherActivity extends AppCompatActivity implements WeatherContract.View {

  WeatherPresenter presenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_weather);
    ButterKnife.bind(this);

    presenter = new WeatherPresenter(Injection.provideWeatherRepo());
    presenter.attachView(this);
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    presenter.detachView();
  }

  @OnClick(R.id.btn_request_weather) public void onRequestWeather(View v) {
    presenter.requestWeather("haidian");
  }

  @Override public void showWeather(WeatherInfo weatherInfo) {
    Logger.d(weatherInfo.toString());
  }

  @Override public void showHourlyTrends() {

  }

  @Override public void show15DayTrends() {

  }

  @Override public void showError(String message) {
    Logger.e(message);
  }

  @Override public void showLoading() {

  }

  @Override public void hideLoading() {

  }
}
