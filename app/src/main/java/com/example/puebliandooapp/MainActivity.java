package com.example.puebliandooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio=MediaPlayer.create(this,R.raw.audio_intro);
        audio.start();

        TimerTask inicioApp = new TimerTask() {
            @Override
            public void run() {
                Intent newAtivity = new Intent(MainActivity.this, Home.class);
                startActivity(newAtivity);
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicioApp, 6000);



    }
}