package cn.lovexiaov.weather.presentation.main.daily;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import cn.lovexiaov.weather.R;
import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import java.util.List;

/**
 * Created by lovexiaov on 09-13 0013.
 * Copyright reserved.
 */

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.ViewHolder> {

  private final List<WeatherInfo.DailyForecastBean> dailyForecasts;
  private Context context;

  public DailyAdapter(Context context, List<WeatherInfo.DailyForecastBean> dailyForecastList) {
    this.context = context;
    this.dailyForecasts = dailyForecastList;
  }

  @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    //View itemView = View.inflate(context, R.layout.item_daily, null);
    View itemView =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily, parent, false);
    return new ViewHolder(itemView);
  }

  @Override public void onBindViewHolder(ViewHolder holder, int position) {
    WeatherInfo.DailyForecastBean daily = dailyForecasts.get(position);
    holder.fillViews(daily.date, daily.cond.txtD, daily.tmp.max);
  }

  @Override public int getItemCount() {
    return dailyForecasts.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.daily_date) TextView date;
    @BindView(R.id.daily_condition) TextView condition;
    @BindView(R.id.daily_temp) TextView temp;

    public ViewHolder(View itemView) {
      super(itemView);

      ButterKnife.bind(this, itemView);
    }

    public void fillViews(String date, String condition, String temp) {
      this.date.setText(date);
      this.condition.setText(condition);
      this.temp.setText(temp);
    }
  }
}
