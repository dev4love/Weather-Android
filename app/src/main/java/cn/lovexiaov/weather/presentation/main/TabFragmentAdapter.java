package cn.lovexiaov.weather.presentation.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import cn.lovexiaov.weather.presentation.base.BaseFragment;
import java.util.List;

/**
 * Created by lovexiaov on 09-13 0013.
 * Copyright reserved.
 */

public class TabFragmentAdapter extends FragmentStatePagerAdapter {
  List<BaseFragment> fragments;

  public TabFragmentAdapter(FragmentManager fm, List<BaseFragment> fragments) {
    super(fm);
    this.fragments = fragments;
  }

  @Override public Fragment getItem(int position) {
    return fragments.get(position);
  }

  @Override public int getCount() {
    return fragments.size();
  }

  @Override public CharSequence getPageTitle(int position) {
    return fragments.get(position).getTitle();
  }
}
