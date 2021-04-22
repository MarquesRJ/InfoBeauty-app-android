package com.example.infobeauty_app_android.EntidadeUsuario;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.infobeauty_app_android.R;

public class CadastroUsuario extends AppCompatActivity{

    EditText editEmail_Tela_CadastroUsuario, editCep_Tela_CadastroUsuario, editSenha_Tela_CadastroUsuario, editConfirme_Sua_Senha_Tela_CadastroUsuario;
    Button buttonCadastrarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        editEmail_Tela_CadastroUsuario = (EditText)findViewById(R.id.editEmail_Tela_CadastroUsuario);
        editCep_Tela_CadastroUsuario = (EditText)findViewById(R.id.editCep_Tela_CadastroUsuario);
        editSenha_Tela_CadastroUsuario = (EditText)findViewById(R.id.editSenha_Tela_CadastroUsuario);
        editConfirme_Sua_Senha_Tela_CadastroUsuario  = (EditText)findViewById(R.id.editConfirme_Sua_Senha_Tela_CadastroUsuario);
        buttonCadastrarUsuario = (Button) findViewById(R.id.Botao_Cadastrar_Tela_CadastroUsuario);

    }

}
