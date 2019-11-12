package com.alo.liberdadeanimal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
  Developed by João Zanetti on 12/10/2016.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {


    public final String[] TITLES= {"Início", "Buscar Empresa", "Info"};

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position){
        return TITLES[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FirstFragment.newInstance(1);
            case 1:
                return SecondFragment.newInstance(2);
            case 2:
                return FourthFragment.newInstance(4);
        }
        return null;
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }
}
