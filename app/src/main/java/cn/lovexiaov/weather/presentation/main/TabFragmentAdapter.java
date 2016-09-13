package cn.lovexiaov.weather.presentation.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.List;

/**
 * Created by lovexiaov on 09-13 0013.
 * Copyright reserved.
 */

public class TabFragmentAdapter extends FragmentStatePagerAdapter {
  List<Fragment> fragments;
  List<String> tabs;

  public TabFragmentAdapter(FragmentManager fm, List<Fragment> fragments, List<String> tabs) {
    super(fm);
    this.fragments = fragments;
    this.tabs = tabs;
  }

  @Override public Fragment getItem(int position) {
    return fragments.get(position);
  }

  @Override public int getCount() {
    return fragments.size();
  }

  @Override public CharSequence getPageTitle(int position) {
    return tabs.get(position);
  }
}
