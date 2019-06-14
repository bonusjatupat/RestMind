package com.alternet.restmindv2.manager.controller.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.alternet.restmindv2.fragment.TutorialPage.Page1;
import com.alternet.restmindv2.fragment.TutorialPage.Page2;
import com.alternet.restmindv2.fragment.TutorialPage.Page3;
import com.alternet.restmindv2.fragment.TutorialPage.Page4;

public class TutorialAdapter extends FragmentPagerAdapter {

    public TutorialAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return Page1.newInstance();
            case 1: return Page2.newInstance();
            case 2: return Page3.newInstance();
            case 3: return Page4.newInstance();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
