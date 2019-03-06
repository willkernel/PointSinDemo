package com.willkernel.animationdemo;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PointSinView pointSinView=findViewById(R.id.pointView);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.property_animator);
        set.setTarget(pointSinView);
        set.start();

    }
}
