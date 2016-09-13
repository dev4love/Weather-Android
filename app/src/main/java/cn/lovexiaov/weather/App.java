package cn.lovexiaov.weather;

import android.app.Application;
import com.orhanobut.logger.Logger;

/**
 * Created by lovexiaov on 09-12 0012.
 * Copyright reserved.
 */

public class App extends Application {
  @Override public void onCreate() {
    super.onCreate();
    Logger.init("WeatherLogger");
  }
}
