package com.apress.gerber.arboretumapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

/**
 * Created by anorryce on 1/14/2017.
 */
public class Splash extends Activity {
    public RelativeLayout rLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        rLayout = (RelativeLayout) findViewById(R.id.relativelayout);
/*
        ImageView loading = new ImageView(this);
        loading.setImageResource(R.drawable.ornamental_1353194_960_720);
        loading.setVisibility(View.VISIBLE);
        loading.setImageLevel(1);

        rLayout.addView(loading);*/
    }

}
