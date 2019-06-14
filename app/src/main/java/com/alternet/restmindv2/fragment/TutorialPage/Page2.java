package com.alternet.restmindv2.fragment.TutorialPage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.alternet.restmindv2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Page2 extends Fragment {

    private boolean fragmentFocus = false;

    public Page2() {
        // Required empty public constructor
    }

    public static Page2 newInstance() {
        
        Bundle args = new Bundle();
        
        Page2 fragment = new Page2();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init(savedInstanceState);
    }

    private void init(Bundle savedInstanceState) {
        setUserVisibleHint(fragmentFocus);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tutorial_page2, container, false);
        initInstance(rootView, savedInstanceState);
        return rootView;
    }

    private void initInstance(View rootView, Bundle savedInstanceState) {
    }

   @Override
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);
        if (menuVisible && !fragmentFocus){

            fragmentFocus = true;
        }
    }
}
