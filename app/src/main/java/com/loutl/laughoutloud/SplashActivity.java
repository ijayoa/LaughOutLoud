package com.loutl.laughoutloud;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.graphics.Typeface;
import android.widget.TextView;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        // Font path
//        String fontPath = "fonts/Roboto-Light.ttf";
//
//        // text view label
//        TextView txtcname = (TextView) findViewById(R.id.cname);
//
//        // Loading Font Face
//        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
//
//        // Applying font
//        txtcname.setTypeface(tf);

        // Font path2
        String fontPath2 = "fonts/Raleway-Italic.ttf";

        // text view label
        TextView txtsubtext = (TextView) findViewById(R.id.subtext);

        // Loading Font Face
        Typeface tf2 = Typeface.createFromAsset(getAssets(), fontPath2);

        // Applying font
        txtsubtext.setTypeface(tf2);

        int myTimer = 2000;
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish(); // close this activity
            }
        }, myTimer);
    }

}
