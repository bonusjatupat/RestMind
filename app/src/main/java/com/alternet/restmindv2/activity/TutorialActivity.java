package com.alternet.restmindv2.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alternet.restmindv2.R;
import com.alternet.restmindv2.fragment.TutorialFragment;

public class TutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.contentContainerTutorialActivity, TutorialFragment.newInstance())
                .commit();
    }
}
