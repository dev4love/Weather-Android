package cn.lovexiaov.weather.presentation.main;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import cn.lovexiaov.weather.R;
import cn.lovexiaov.weather.data.Injection;
import cn.lovexiaov.weather.model.Weather;
import cn.lovexiaov.weather.presentation.base.BaseFragment;
import cn.lovexiaov.weather.presentation.main.daily.DailyFragment;
import cn.lovexiaov.weather.presentation.main.hourly.HourlyFragment;
import cn.lovexiaov.weather.presentation.utils.WeatherIcons;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.context.IconicsContextWrapper;
import com.orhanobut.logger.Logger;
import java.util.ArrayList;
import java.util.List;

public class WeatherActivity extends AppCompatActivity implements WeatherContract.View {

  private WeatherPresenter presenter;

  @BindView(R.id.iv_curr) ImageView currentIcon;
  @BindView(R.id.tv_curr) TextView currentCondition;
  @BindView(R.id.tv_info) TextView info;

  @BindView(R.id.tablayout) TabLayout tabLayout;
  List<String> tabs = new ArrayList<String>() {{
    add("小时预报");
    add("未来天气");
  }};

  @BindView(R.id.viewpager) ViewPager viewPager;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_weather);
    ButterKnife.bind(this);

    presenter = new WeatherPresenter(Injection.provideWeatherRepo());
    presenter.attachView(this);
    presenter.requestWeather("海淀");
  }

  @Override protected void attachBaseContext(Context newBase) {
    super.attachBaseContext(IconicsContextWrapper.wrap(newBase));
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    presenter.detachView();
  }

  @Override public void showWeather(final Weather weather) {
    currentIcon.setImageDrawable(
        new IconicsDrawable(this).icon(WeatherIcons.getWeatherIcon(weather.getNow().cond.code))
            .color(Color.GREEN));
    currentCondition.setText(weather.getNow().cond.txt);

    initViewPager(weather);
  }

  private void initViewPager(final Weather weather) {
    List<BaseFragment> fragments = new ArrayList<BaseFragment>() {{
      add(HourlyFragment.newInstance(weather.getHourlyForecast(), "小时预报"));
      add(DailyFragment.newInstance(weather.getDailyForecast(), "未来天气"));
    }};

    TabFragmentAdapter adapter =
        new TabFragmentAdapter(getSupportFragmentManager(), fragments);
    viewPager.setAdapter(adapter);
    tabLayout.setupWithViewPager(viewPager);
  }

  @Override public void showHourlyTrends() {

  }

  @Override public void showFutureDayTrends() {

  }

  @Override public void showError(String message) {
    info.setText(String.format("请求出错：%s", message));
    info.setVisibility(View.VISIBLE);
    Logger.e(message);
  }

  @Override public void showLoading() {
    info.setText("努力加载中...");
    info.setVisibility(View.VISIBLE);
  }

  @Override public void hideLoading() {
    info.setVisibility(View.INVISIBLE);
  }
}
