package com.alternet.restmindv2.fragment.TutorialPage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alternet.restmindv2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Page4 extends Fragment {


    public Page4() {
        // Required empty public constructor
    }

    public static Page4 newInstance() {
        
        Bundle args = new Bundle();
        
        Page4 fragment = new Page4();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init(savedInstanceState);
    }

    private void init(Bundle savedInstanceState) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tutorial_page4, container, false);
        initInstance(rootView, savedInstanceState);
        return rootView;
    }

    private void initInstance(View rootView, Bundle savedInstanceState) {
    }

}
