package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clockwise(View view){
        ImageView imageView=findViewById(R.id.image);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.myanimation);
        imageView.startAnimation(animation);
    }

    public void zoom(View view){
        ImageView imageView=findViewById(R.id.image);
        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        imageView.startAnimation(animation1);
    }

    public void fade(View view){
        ImageView imageView=findViewById(R.id.image);
        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        imageView.startAnimation(animation1);
    }

    public void blink(View view){
        ImageView imageView=findViewById(R.id.image);
        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        imageView.startAnimation(animation1);
    }

    public void move(View view){
        ImageView imageView=findViewById(R.id.image);
        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        imageView.startAnimation(animation1);
    }

    public void slide(View view){
        ImageView imageView=findViewById(R.id.image);
        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        imageView.startAnimation(animation1);
    }








}
