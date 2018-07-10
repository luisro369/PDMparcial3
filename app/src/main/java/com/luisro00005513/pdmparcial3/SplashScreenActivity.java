package com.luisro00005513.pdmparcial3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splash_screen);

        title = findViewById(R.id.splash_textView_title);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.transition_splash);

        title.startAnimation(animation);

        Thread timer = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                }catch (InterruptedException interruptedException){
                    interruptedException.printStackTrace();
                }finally {
                    islogin();

                }
            }
        };
        timer.start();
    }

    public void islogin(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}
