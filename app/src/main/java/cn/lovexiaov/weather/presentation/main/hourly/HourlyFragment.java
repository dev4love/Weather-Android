package cn.lovexiaov.weather.presentation.main.hourly;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cn.lovexiaov.weather.R;
import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import cn.lovexiaov.weather.presentation.base.BaseFragment;
import java.util.List;

/**
 * Created by lovexiaov on 09-13 0013.
 * Copyright reserved.
 */

public class HourlyFragment extends BaseFragment {

  private static List<WeatherInfo.HourlyForecastBean> hourlys;
  private static String mTitle;

  public static HourlyFragment newInstance(List<WeatherInfo.HourlyForecastBean> hourlyForecasts,
      String title) {
    hourlys = hourlyForecasts;
    mTitle = title;
    return new HourlyFragment();
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_hourly, container, false);
    return view;
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
  }

  @Override public String getTitle() {
    return mTitle;
  }
}
