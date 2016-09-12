package cn.lovexiaov.weather;

import android.app.Application;
import com.orhanobut.logger.Logger;

/**
 * Created by Administrator on 09-12 0012.
 */

public class App extends Application {
  @Override public void onCreate() {
    super.onCreate();
    Logger.init("Weather");
  }
}
