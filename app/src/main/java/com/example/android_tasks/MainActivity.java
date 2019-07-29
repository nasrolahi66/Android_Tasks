package com.example.android_tasks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
//String tag="MyTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MYTAG","onCreate event");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYTAG","onStart event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYTAG","onResume event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYTAG","onPause event");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYTAG","onStop event");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYTAG","onDestroy event");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
         Log.d("MYTAG","onRestart event");


    }

}
