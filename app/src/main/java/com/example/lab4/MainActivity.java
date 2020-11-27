package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.imageView);
        animationDrawable=(AnimationDrawable) imageView.getBackground();
        animationDrawable.setOneShot(false);
    }
    public void onClick(View view){
        Button button=(Button)view;
        if(animationDrawable.isRunning()){
            button.setText("Старт");
            animationDrawable.stop();
        }
        else{
            button.setText("Стоп");
            animationDrawable.start();
        }
    }
}