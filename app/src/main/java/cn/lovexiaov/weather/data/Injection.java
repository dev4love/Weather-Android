package cn.lovexiaov.weather.data;

import cn.lovexiaov.weather.data.remote.RequestService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Injection {

  private static final String BASE_URL = "https://api.heweather.com/x3/weather/";
  private static OkHttpClient okHttpClient;
  private static RequestService requestService;
  private static Retrofit retrofitInstance;

  public static WeatherRepository provideWeatherRepo() {
    return new WeatherRepositoryImpl(provideRequestService());
  }

  static RequestService provideRequestService() {
    if (requestService == null) {
      requestService = getRetrofitInstance().create(RequestService.class);
    }
    return requestService;
  }

  static OkHttpClient getOkHttpClient() {
    if (okHttpClient == null) {
      HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
      logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
      okHttpClient = new OkHttpClient.Builder().addInterceptor(logging).build();
    }

    return okHttpClient;
  }

  static Retrofit getRetrofitInstance() {
    if (retrofitInstance == null) {
      Retrofit.Builder retrofit = new Retrofit.Builder().client(Injection.getOkHttpClient())
          .baseUrl(BASE_URL)
          .addConverterFactory(GsonConverterFactory.create())
          .addCallAdapterFactory(RxJavaCallAdapterFactory.create());

      retrofitInstance = retrofit.build();
    }
    return retrofitInstance;
  }
}
