package cn.lovexiaov.weather.model;

import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import java.util.List;

/**
 * Created by Administrator on 09-12 0012.
 */

public class Weather {
  private WeatherInfo.BasicBean basic;
  private WeatherInfo.AlarmsBean alarms;
  private List<WeatherInfo.DailyForecastBean> dailyForecast;
  private List<WeatherInfo.HourlyForecastBean> hourlyForecast;
  private WeatherInfo.NowBean now;

  public WeatherInfo.NowBean getNow() {
    return now;
  }

  public void setNow(WeatherInfo.NowBean now) {
    this.now = now;
  }

  public WeatherInfo.BasicBean getBasic() {
    return basic;
  }

  public void setBasic(WeatherInfo.BasicBean basic) {
    this.basic = basic;
  }

  public WeatherInfo.AlarmsBean getAlarms() {
    return alarms;
  }

  public void setAlarms(WeatherInfo.AlarmsBean alarms) {
    this.alarms = alarms;
  }

  public List<WeatherInfo.DailyForecastBean> getDailyForecast() {
    return dailyForecast;
  }

  public void setDailyForecast(List<WeatherInfo.DailyForecastBean> dailyForecast) {
    this.dailyForecast = dailyForecast;
  }

  public List<WeatherInfo.HourlyForecastBean> getHourlyForecast() {
    return hourlyForecast;
  }

  public void setHourlyForecast(List<WeatherInfo.HourlyForecastBean> hourlyForecast) {
    this.hourlyForecast = hourlyForecast;
  }
}
