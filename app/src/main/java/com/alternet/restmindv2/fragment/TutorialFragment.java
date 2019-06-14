package com.alternet.restmindv2.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alternet.restmindv2.R;
import com.alternet.restmindv2.manager.adapter.TutorialAdapter;

import me.relex.circleindicator.CircleIndicator;

public class TutorialFragment extends Fragment {

    private Context context;
    private ViewPager viewPagerTutorial;
    private CircleIndicator circleIndicatorTutorial;


    public TutorialFragment() {
    }

    public static TutorialFragment newInstance() {
        TutorialFragment fragment = new TutorialFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init(savedInstanceState);
    }

    private void init(Bundle savedInstanceState) {
        //TODO: init variable in fragment scope
        context = getContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tutorial, container, false);

        initInstance(rootView, savedInstanceState);

        return rootView;
    }

    private void initInstance(View rootView, Bundle savedInstanceState) {
        //TODO: init view variable here
        viewPagerTutorial = rootView.findViewById(R.id.viewPagerTutorial);
        circleIndicatorTutorial = rootView.findViewById(R.id.indicatorTutorial);

        viewPagerTutorial.setAdapter(new TutorialAdapter(getChildFragmentManager()));
        circleIndicatorTutorial.setViewPager(viewPagerTutorial);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }



}
