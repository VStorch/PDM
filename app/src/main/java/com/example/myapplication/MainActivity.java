package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ciclo_vida", "Oncreate");
//        Log.w("", "");
//        Log.i("", "");
//        Log.wtf("", "");
        }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo_vida", "Onstart");
//        Log.w("", "");
//        Log.i("", "");
//        Log.wtf("", "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo_vida", "Onresume");
//        Log.w("", "");
//        Log.i("", "");
//        Log.wtf("", "");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo_vida", "Onpause");
//        Log.w("", "");
//        Log.i("", "");
//        Log.wtf("", "");
    }

    @Override
    protected void onStop() {
        super.onStop();
          Log.d("ciclo_vida", "Onstop");
//        Log.w("", "");
//        Log.i("", "");
//        Log.wtf("", "");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo_vida", "Ondestroy");
//        Log.w("", "");
//        Log.i("", "");
//        Log.wtf("", "");
    }
}