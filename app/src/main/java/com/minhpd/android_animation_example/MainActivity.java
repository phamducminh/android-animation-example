package com.minhpd.android_animation_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    TextView txtMessage;
    Button btn;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessage = findViewById(R.id.text);
        btn = findViewById(R.id.btn);

        //loading Animation
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_blink);
//        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_bounce);
//        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_clockwise_rotation);
//        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_fade_in);
//        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_fade_out);
//        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_translation_x);
//        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_zoom_in);
//        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_zoom_out);

        //handling animation on button click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMessage.setVisibility(View.VISIBLE);
                // starting the animation
                txtMessage.startAnimation(anim);
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
