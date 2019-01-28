package com.example.gspl.music;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        music=MediaPlayer.create(MainActivity.this,R.raw.abc);

    }

    public void plays(View view) {
        music.start();
    }

    public void pauses(View view) {
        music.pause();
    }

    public void stops(View view) {
        music.stop();
    }
}
