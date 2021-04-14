package com.example.infobeauty_app_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);
    }
    public void telaIndexUsuario(View view){

        Intent intent = new Intent(this, IndexUsuario.class);
        startActivity(intent);
    }

}