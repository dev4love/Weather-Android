package cn.lovexiaov.weather.presentation.main.daily;

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
import java.util.List;

/**
 * Created by lovexiaov on 09-13 0013.
 * Copyright reserved.
 */

public class DailyFragment extends BaseFragment {

  //@BindView(R.id.rv_daily)RecyclerView recyclerView;

  private static List<WeatherInfo.DailyForecastBean> dailyForecasts;
  private static String mTitle;

  public static DailyFragment newInstance(List<WeatherInfo.DailyForecastBean> dailyForecastList,
      String title) {
    dailyForecasts = dailyForecastList;
    mTitle = title;
    return new DailyFragment();
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_daily, container, false);
    //ButterKnife.bind(this, view);
    return view;
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.rv_daily);
    recyclerView.addItemDecoration(
        new RecycleViewDivider(getContext(), LinearLayoutManager.HORIZONTAL));
    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

    recyclerView.setAdapter(new DailyAdapter(getContext(), dailyForecasts));
  }

  @Override public String getTitle() {
    return mTitle;
  }
}
