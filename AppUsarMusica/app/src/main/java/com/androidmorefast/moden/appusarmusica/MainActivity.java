package com.androidmorefast.moden.appusarmusica;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sonidoGato(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.gato);
        mp.start();
    }

    public void sonidoLeon(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.leon);
        mp.start();
    }
}