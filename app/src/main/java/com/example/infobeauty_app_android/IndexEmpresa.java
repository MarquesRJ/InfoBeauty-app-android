package com.example.infobeauty_app_android;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IndexEmpresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_empresa);
    }

    public void telaCadastroEmpresa(View v){

        Intent intent = new Intent(this, CadastroEmpresa.class);
        startActivity(intent);
    }

    public void telaLoginEmpresa(View v){

        Intent intent = new Intent(this, LoginEmpresa.class);
        startActivity(intent);
    }
}