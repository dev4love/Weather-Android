package cn.lovexiaov.weather.presentation.main.hourly;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import cn.lovexiaov.weather.R;
import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import cn.lovexiaov.weather.presentation.base.BaseFragment;
import cn.lovexiaov.weather.presentation.main.RecycleViewDivider;
import cn.lovexiaov.weather.presentation.main.daily.DailyAdapter;
import java.util.List;

/**
 * Created by lovexiaov on 09-13 0013.
 * Copyright reserved.
 */

public class HourlyFragment extends BaseFragment {

  @BindView(R.id.rv_hourly) RecyclerView recyclerView;

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
    View hourlyView = inflater.inflate(R.layout.fragment_hourly, container, false);
    ButterKnife.bind(this, hourlyView);
    return hourlyView;
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    //RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.rv_hourly);
    recyclerView.addItemDecoration(
        new RecycleViewDivider(getContext(), LinearLayoutManager.HORIZONTAL));
    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

    recyclerView.setAdapter(new HourlyAdapter(getContext(), hourlys));
  }

  @Override public String getTitle() {
    return mTitle;
  }
}
