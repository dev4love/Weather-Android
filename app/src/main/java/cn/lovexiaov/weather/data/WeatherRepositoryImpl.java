package cn.lovexiaov.weather.data;

import cn.lovexiaov.weather.data.remote.RequestService;
import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import rx.Observable;

/**
 * Created by Administrator on 09-12 0012.
 */

public class WeatherRepositoryImpl implements WeatherRepository {
  private RequestService requestService;

  public WeatherRepositoryImpl(RequestService requestService) {
    this.requestService = requestService;
  }

  @Override public Observable<WeatherInfo> requestWeather(String city) {
    return requestService.requestWeather(city);
  }
}
