package com.zjc163.androidnotes.music;


import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zjc163.androidnotes.R;

public class MusicMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_main);
        if(Build.VERSION.SDK_INT>=21){
            getSupportActionBar().setElevation(0);
        }
    }


}
