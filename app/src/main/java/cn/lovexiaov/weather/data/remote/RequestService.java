package cn.lovexiaov.weather.data.remote;

import cn.lovexiaov.weather.data.remote.model.WeatherInfo;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 09-12 0012.
 */

public interface RequestService {

  @GET("https://api.heweather.com/x3/weather?key=cae3f47c06634545ab1b7437f52ad85f")
  Observable<WeatherInfo> requestWeather(@Query("city") String city);
}
