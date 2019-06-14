package com.alternet.restmindv2.fragment.TutorialPage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.alternet.restmindv2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Page1 extends Fragment {

    ImageView imageView;
    Button btn;

    public Page1() {
        // Required empty public constructor
    }

    public static Page1 newInstance() {
        
        Bundle args = new Bundle();
        
        Page1 fragment = new Page1();
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
        View rootView = inflater.inflate(R.layout.fragment_tutorial_page1, container, false);
        initInstance(rootView, savedInstanceState);
        return rootView;
    }

    private void initInstance(View rootView, Bundle savedInstanceState) {
        imageView = rootView.findViewById(R.id.tutorialResImagePage1);
        btn = rootView.findViewById(R.id.btnTest);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(AnimationUtils.loadAnimation(getContext(),R.anim.anim_up_from_bottom));
            }
        });
        imageView.startAnimation(AnimationUtils.loadAnimation(getContext(),R.anim.anim_up_from_bottom));
    }

}
