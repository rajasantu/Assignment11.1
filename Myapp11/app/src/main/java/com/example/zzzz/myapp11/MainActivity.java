package com.example.zzzz.myapp11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startAnim (View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.blinkanim);
        animation.setRepeatMode(Animation.REVERSE);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.startAnimation(animation);
    }
}
