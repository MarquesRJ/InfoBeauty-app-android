package com.example.infobeauty_app_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //bottomNavigationView.backgroud = null;
        // bottomNavigationView.menu.getItem( index: 2).isEnabled = false;
    }


}