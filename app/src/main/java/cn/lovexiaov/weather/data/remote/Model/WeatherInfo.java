package cn.lovexiaov.weather.data.remote.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by Administrator on 09-12 0012.
 */

public class WeatherInfo {

  /**
   * aqi : {"city":{"aqi":"48","co":"1","no2":"25","o3":"45","pm10":"?","pm25":"48","qlty":"优","so2":"2"}}
   * basic : {"city":"北京","cnty":"中国","id":"CN101010100","lat":"39.904000","lon":"116.391000","update":{"loc":"2016-09-12
   * 10:53","utc":"2016-09-12 02:53"}}
   * daily_forecast : [{"astro":{"sr":"05:52","ss":"18:28"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2016-09-12","hum":"39","pcpn":"0.0","pop":"19","pres":"1016","tmp":{"max":"27","min":"18"},"vis":"10","wind":{"deg":"184","dir":"无持续风向","sc":"微风","spd":"7"}},{"astro":{"sr":"05:53","ss":"18:26"},"cond":{"code_d":"101","code_n":"100","txt_d":"多云","txt_n":"晴"},"date":"2016-09-13","hum":"37","pcpn":"0.2","pop":"10","pres":"1016","tmp":{"max":"28","min":"19"},"vis":"10","wind":{"deg":"188","dir":"无持续风向","sc":"微风","spd":"1"}},{"astro":{"sr":"05:54","ss":"18:25"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2016-09-14","hum":"28","pcpn":"0.0","pop":"0","pres":"1015","tmp":{"max":"30","min":"20"},"vis":"10","wind":{"deg":"202","dir":"无持续风向","sc":"微风","spd":"3"}},{"astro":{"sr":"05:55","ss":"18:23"},"cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},"date":"2016-09-15","hum":"21","pcpn":"0.0","pop":"2","pres":"1012","tmp":{"max":"30","min":"20"},"vis":"10","wind":{"deg":"133","dir":"无持续风向","sc":"微风","spd":"6"}},{"astro":{"sr":"05:56","ss":"18:21"},"cond":{"code_d":"101","code_n":"300","txt_d":"多云","txt_n":"阵雨"},"date":"2016-09-16","hum":"20","pcpn":"0.1","pop":"25","pres":"1012","tmp":{"max":"30","min":"20"},"vis":"10","wind":{"deg":"58","dir":"无持续风向","sc":"微风","spd":"3"}},{"astro":{"sr":"05:57","ss":"18:20"},"cond":{"code_d":"300","code_n":"101","txt_d":"阵雨","txt_n":"多云"},"date":"2016-09-17","hum":"32","pcpn":"0.0","pop":"7","pres":"1018","tmp":{"max":"26","min":"19"},"vis":"10","wind":{"deg":"169","dir":"无持续风向","sc":"微风","spd":"3"}},{"astro":{"sr":"05:58","ss":"18:18"},"cond":{"code_d":"101","code_n":"104","txt_d":"多云","txt_n":"阴"},"date":"2016-09-18","hum":"38","pcpn":"0.0","pop":"14","pres":"1015","tmp":{"max":"25","min":"18"},"vis":"10","wind":{"deg":"201","dir":"无持续风向","sc":"微风","spd":"3"}}]
   * hourly_forecast : [{"date":"2016-09-12 13:00","hum":"41","pop":"1","pres":"1017","tmp":"29","wind":{"deg":"185","dir":"南风","sc":"微风","spd":"10"}},{"date":"2016-09-12
   * 16:00","hum":"41","pop":"0","pres":"1016","tmp":"30","wind":{"deg":"185","dir":"南风","sc":"微风","spd":"13"}},{"date":"2016-09-12
   * 19:00","hum":"55","pop":"0","pres":"1017","tmp":"28","wind":{"deg":"184","dir":"南风","sc":"微风","spd":"10"}},{"date":"2016-09-12
   * 22:00","hum":"68","pop":"6","pres":"1018","tmp":"26","wind":{"deg":"196","dir":"西南风","sc":"微风","spd":"8"}}]
   * now : {"cond":{"code":"101","txt":"多云"},"fl":"26","hum":"60","pcpn":"0","pres":"1018","tmp":"23","vis":"10","wind":{"deg":"340","dir":"北风","sc":"4-5","spd":"17"}}
   * status : ok
   * suggestion : {"comf":{"brf":"较舒适","txt":"白天天气晴好，您在这种天气条件下，会感觉早晚凉爽、舒适，午后偏热。"},"cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},"drsg":{"brf":"热","txt":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"},"flu":{"brf":"少发","txt":"各项气象条件适宜，无明显降温过程，发生感冒机率较低。"},"sport":{"brf":"较适宜","txt":"天气较好，户外运动请注意防晒。推荐您进行室内运动。"},"trav":{"brf":"适宜","txt":"天气较好，但丝毫不会影响您出行的心情。温度适宜又有微风相伴，适宜旅游。"},"uv":{"brf":"弱","txt":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"}}
   */
  @SerializedName("HeWeather data service 3.0") public List<DataBean> data;

  public static class DataBean {
    /**
     * city : {"aqi":"48","co":"1","no2":"25","o3":"45","pm10":"?","pm25":"48","qlty":"优","so2":"2"}
     */
    @SerializedName("aqi") public AqiBean aqi;
    /**
     * city : 北京
     * cnty : 中国
     * id : CN101010100
     * lat : 39.904000
     * lon : 116.391000
     * update : {"loc":"2016-09-12 10:53","utc":"2016-09-12 02:53"}
     */
    @SerializedName("basic") public BasicBean basic;
    /**
     * cond : {"code":"101","txt":"多云"}
     * fl : 26
     * hum : 60
     * pcpn : 0
     * pres : 1018
     * tmp : 23
     * vis : 10
     * wind : {"deg":"340","dir":"北风","sc":"4-5","spd":"17"}
     */
    @SerializedName("now") public NowBean now;
    @SerializedName("status") public String status;
    /**
     * comf : {"brf":"较舒适","txt":"白天天气晴好，您在这种天气条件下，会感觉早晚凉爽、舒适，午后偏热。"}
     * cw : {"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"}
     * drsg : {"brf":"热","txt":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"}
     * flu : {"brf":"少发","txt":"各项气象条件适宜，无明显降温过程，发生感冒机率较低。"}
     * sport : {"brf":"较适宜","txt":"天气较好，户外运动请注意防晒。推荐您进行室内运动。"}
     * trav : {"brf":"适宜","txt":"天气较好，但丝毫不会影响您出行的心情。温度适宜又有微风相伴，适宜旅游。"}
     * uv : {"brf":"弱","txt":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"}
     */
    @SerializedName("suggestion") public SuggestionBean suggestion;
    /**
     * astro : {"sr":"05:52","ss":"18:28"}
     * cond : {"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"}
     * date : 2016-09-12
     * hum : 39
     * pcpn : 0.0
     * pop : 19
     * pres : 1016
     * tmp : {"max":"27","min":"18"}
     * vis : 10
     * wind : {"deg":"184","dir":"无持续风向","sc":"微风","spd":"7"}
     */
    @SerializedName("daily_forecast") public List<DailyForecastBean> dailyForecast;
    /**
     * date : 2016-09-12 13:00
     * hum : 41
     * pop : 1
     * pres : 1017
     * tmp : 29
     * wind : {"deg":"185","dir":"南风","sc":"微风","spd":"10"}
     */

    @SerializedName("hourly_forecast") public List<HourlyForecastBean> hourlyForecast;

  }

  public static class AqiBean {
    /**
     * aqi : 48
     * co : 1
     * no2 : 25
     * o3 : 45
     * pm10 : ?
     * pm25 : 48
     * qlty : 优
     * so2 : 2
     */

    @SerializedName("city") public CityBean city;
  }

  public static class CityBean {
    @SerializedName("aqi") public String aqi;
    @SerializedName("co") public String co;
    @SerializedName("no2") public String no2;
    @SerializedName("o3") public String o3;
    @SerializedName("pm10") public String pm10;
    @SerializedName("pm25") public String pm25;
    @SerializedName("qlty") public String qlty;
    @SerializedName("so2") public String so2;
  }

  public static class BasicBean {
    @SerializedName("city") public String city;
    @SerializedName("cnty") public String cnty;
    @SerializedName("id") public String id;
    @SerializedName("lat") public String lat;
    @SerializedName("lon") public String lon;
    /**
     * loc : 2016-09-12 10:53
     * utc : 2016-09-12 02:53
     */

    @SerializedName("update") public UpdateBean update;
  }

  public static class UpdateBean {
    @SerializedName("loc") public String loc;
    @SerializedName("utc") public String utc;
  }

  public static class NowBean {
    /**
     * code : 101
     * txt : 多云
     */

    @SerializedName("cond") public CondBean cond;
    @SerializedName("fl") public String fl;
    @SerializedName("hum") public String hum;
    @SerializedName("pcpn") public String pcpn;
    @SerializedName("pres") public String pres;
    @SerializedName("tmp") public String tmp;
    @SerializedName("vis") public String vis;
    /**
     * deg : 340
     * dir : 北风
     * sc : 4-5
     * spd : 17
     */

    @SerializedName("wind") public WindBean wind;
  }

  public static class CondBean {
    @SerializedName("code") public String code;
    @SerializedName("txt") public String txt;
  }

  public static class WindBean {
    @SerializedName("deg") public String deg;
    @SerializedName("dir") public String dir;
    @SerializedName("sc") public String sc;
    @SerializedName("spd") public String spd;
  }

  public static class SuggestionBean {
    /**
     * brf : 较舒适
     * txt : 白天天气晴好，您在这种天气条件下，会感觉早晚凉爽、舒适，午后偏热。
     */

    @SerializedName("comf") public SuggestionIndexBean comf;
    /**
     * brf : 较适宜
     * txt : 较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。
     */

    @SerializedName("cw") public SuggestionIndexBean cw;
    /**
     * brf : 热
     * txt : 天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。
     */

    @SerializedName("drsg") public SuggestionIndexBean drsg;
    /**
     * brf : 少发
     * txt : 各项气象条件适宜，无明显降温过程，发生感冒机率较低。
     */

    @SerializedName("flu") public SuggestionIndexBean flu;
    /**
     * brf : 较适宜
     * txt : 天气较好，户外运动请注意防晒。推荐您进行室内运动。
     */

    @SerializedName("sport") public SuggestionIndexBean sport;
    /**
     * brf : 适宜
     * txt : 天气较好，但丝毫不会影响您出行的心情。温度适宜又有微风相伴，适宜旅游。
     */

    @SerializedName("trav") public SuggestionIndexBean trav;
    /**
     * brf : 弱
     * txt : 紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。
     */

    @SerializedName("uv") public SuggestionIndexBean uv;
  }

  public static class SuggestionIndexBean {
    @SerializedName("brf") public String brf;
    @SerializedName("txt") public String txt;
  }

  public static class DailyForecastBean {
    /**
     * sr : 05:52
     * ss : 18:28
     */

    @SerializedName("astro") public AstroBean astro;
    /**
     * code_d : 101
     * code_n : 101
     * txt_d : 多云
     * txt_n : 多云
     */

    @SerializedName("cond") public DailyCondBean cond;
    @SerializedName("date") public String date;
    @SerializedName("hum") public String hum;
    @SerializedName("pcpn") public String pcpn;
    @SerializedName("pop") public String pop;
    @SerializedName("pres") public String pres;
    /**
     * max : 27
     * min : 18
     */

    @SerializedName("tmp") public TmpBean tmp;
    @SerializedName("vis") public String vis;
    /**
     * deg : 184
     * dir : 无持续风向
     * sc : 微风
     * spd : 7
     */

    @SerializedName("wind") public WindBean wind;
  }

  public static class AstroBean {
    @SerializedName("sr") public String sr;
    @SerializedName("ss") public String ss;
  }

  public static class DailyCondBean {
    @SerializedName("code_d") public String codeD;
    @SerializedName("code_n") public String codeN;
    @SerializedName("txt_d") public String txtD;
    @SerializedName("txt_n") public String txtN;
  }

  public static class TmpBean {
    @SerializedName("max") public String max;
    @SerializedName("min") public String min;
  }

  public static class HourlyForecastBean {
    @SerializedName("date") public String date;
    @SerializedName("hum") public String hum;
    @SerializedName("pop") public String pop;
    @SerializedName("pres") public String pres;
    @SerializedName("tmp") public String tmp;
    /**
     * deg : 185
     * dir : 南风
     * sc : 微风
     * spd : 10
     */

    @SerializedName("wind") public WindBean wind;
  }

  @Override public String toString() {
    return "WeatherInfo{" +
        "data=" + data +
        '}';
  }
}
