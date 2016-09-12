package cn.lovexiaov.weather.data;

import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import cn.lovexiaov.weather.model.Weather;
import rx.Observable;

/**
 * Created by Administrator on 09-12 0012.
 */

public interface WeatherRepository {

  Observable<WeatherInfo> requestWeather(String city);
}
