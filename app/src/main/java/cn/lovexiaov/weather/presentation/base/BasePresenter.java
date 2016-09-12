package cn.lovexiaov.weather.presentation.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Administrator on 09-12 0012.
 */

public class BasePresenter<T extends MvpView> implements MvpPresenter<T> {

  private T view;

  private CompositeSubscription compositeSubscription = new CompositeSubscription();

  @Override public void attachView(T view) {
    this.view = view;
  }

  @Override public void detachView() {
    compositeSubscription.clear();
    view = null;
  }

  public T getView() {
    return view;
  }

  public void checkViewAttached() {
    if (!isViewAttached()) {
      throw new MvpViewNotAttachedException();
    }
  }

  protected void addSubscribtion(Subscription subscription) {
    compositeSubscription.add(subscription);
  }

  private boolean isViewAttached() {
    return view != null;
  }

  public static class MvpViewNotAttachedException extends RuntimeException {
    public MvpViewNotAttachedException() {
      super("Please call Presenter.attachView(MvpView) before requesting data to the Presenter.");
    }
  }
}
