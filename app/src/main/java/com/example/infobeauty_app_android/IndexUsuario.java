package com.example.infobeauty_app_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.infobeauty_app_android.EntidadeUsuario.CadastroUsuario;

public class IndexUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_usuario);
    }
    public void telaCadastroUsuario(View view){

        Intent intent = new Intent(this, CadastroUsuario.class);
        startActivity(intent);
    }

    public void telaLoginUsuario(View view){

        Intent intent = new Intent(this, LoginUsuario.class);
        startActivity(intent);
    }
}
