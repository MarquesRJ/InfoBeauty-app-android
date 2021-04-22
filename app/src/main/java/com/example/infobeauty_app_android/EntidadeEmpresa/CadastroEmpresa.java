package com.example.infobeauty_app_android.EntidadeEmpresa;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.infobeauty_app_android.R;

public class CadastroEmpresa extends AppCompatActivity {

    EditText edtEmail_CadastroEmpresa, edtCnpj_CadastroEmpresa, edtSenha_CadastroEmpresa, edtSenhaConfirmar_CadastroEmpresa;
    Button button_CadastarEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_empresa);

        edtEmail_CadastroEmpresa = (EditText) findViewById(R.id.editEmail_Tela_CadastroEmpresa);
        edtCnpj_CadastroEmpresa = (EditText) findViewById(R.id.editCnpj_Tela_CadastroEmpresa);
        edtSenha_CadastroEmpresa = (EditText) findViewById(R.id.editSenha_Tela_CadastroEmpresa);
        edtSenhaConfirmar_CadastroEmpresa = (EditText) findViewById(R.id.editSenhaConfirmar_Tela_CadastroEmpresa);
        button_CadastarEmpresa = (Button) findViewById(R.id.buttonCadastrar_Empresa);
    }
}