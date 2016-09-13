package cn.lovexiaov.weather.presentation.main.daily;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cn.lovexiaov.weather.R;
import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import cn.lovexiaov.weather.presentation.main.RecycleViewDivider;
import java.util.List;

/**
 * Created by lovexiaov on 09-13 0013.
 * Copyright reserved.
 */

public class DailyFragment extends Fragment {

  private static List<WeatherInfo.DailyForecastBean> dailyForecasts;

  public static DailyFragment newInstance(List<WeatherInfo.DailyForecastBean> dailyForecastList) {
    dailyForecasts = dailyForecastList;
    return new DailyFragment();
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_daily, container, false);
    return view;
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    //ButterKnife.bind(getActivity());
    RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.rv_daily);
    recyclerView.addItemDecoration(
        new RecycleViewDivider(getContext(), LinearLayoutManager.HORIZONTAL));
    recyclerView.setLayoutManager(
        new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

    recyclerView.setAdapter(new DailyAdapter(getContext(), dailyForecasts));
  }
}
