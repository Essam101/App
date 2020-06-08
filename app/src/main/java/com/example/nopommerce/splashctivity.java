package com.example.nopommerce;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class splashctivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1500;
    Animation topAnim, bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        ImageView imageView = (ImageView) findViewById(R.id.images);
       // ImageView  onSplash = (ImageView) findViewById(R.id.onspp);
       // onSplash.setAnimation(topAnim);

        setContentView(R.layout.activity_splashctivity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent Homeintent = new Intent(splashctivity.this, MainActivity.class);
                startActivity(Homeintent);
            }
        }, SPLASH_TIME_OUT);
    }
}
