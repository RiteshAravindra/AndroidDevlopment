package com.masai.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("TAG","create B");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","onstart B");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","on resume B");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","onpause B");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","onstop B");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","ondestroy B");
    }
}