package com.example.infobeauty_app_android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMainActivity();
            }
        }, 300);
    }

    private void mostrarMainActivity() {
        Intent intent = new Intent(
                Splashscreen.this,MainActivity.class
        );
        startActivity(intent);
        finish();
    }
}
