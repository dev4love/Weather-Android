package cn.lovexiaov.weather.presentation.main.hourly;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public class HourlyAdapter extends RecyclerView.Adapter<HourlyAdapter.ViewHolder> {

  private final List<WeatherInfo.HourlyForecastBean> hourlyForecasts;
  private Context context;

  public HourlyAdapter(Context context, List<WeatherInfo.HourlyForecastBean> hourlyForecastList) {
    this.context = context;
    this.hourlyForecasts = hourlyForecastList;
  }

  @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    //View itemView = View.inflate(context, R.layout.item_daily, null);
    View itemView =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hourly, parent, false);
    return new ViewHolder(itemView);
  }

  @Override public void onBindViewHolder(ViewHolder holder, int position) {
    WeatherInfo.HourlyForecastBean daily = hourlyForecasts.get(position);
    holder.fillViews(daily.date, daily.tmp, daily.pop);
  }

  @Override public int getItemCount() {
    return hourlyForecasts.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.hourly_time) TextView time;
    @BindView(R.id.hourly_tmp) TextView tmp;
    @BindView(R.id.hourly_pop) TextView pop;

    public ViewHolder(View itemView) {
      super(itemView);

      ButterKnife.bind(this, itemView);
    }

    public void fillViews(String time, String tmp, String pop) {
      this.time.setText(time);
      this.tmp.setText(tmp);
      this.pop.setText(pop);
    }
  }
}
