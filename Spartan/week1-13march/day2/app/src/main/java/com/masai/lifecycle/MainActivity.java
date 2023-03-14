package com.masai.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnLaunchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnLaunchButton = findViewById(R.id.btnLaunchSecondActivity);
        Log.d("TAG","oncreate");
        mBtnLaunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","ondestroy");
    }
}