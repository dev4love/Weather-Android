package cn.lovexiaov.weather.presentation.base;


/**
 * Created by Administrator on 09-09 0009.
 */

public interface MvpPresenter<V extends MvpView> {
  void attachView(V view);

  void detachView();
}
