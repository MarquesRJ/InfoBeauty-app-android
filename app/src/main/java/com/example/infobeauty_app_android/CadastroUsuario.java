package com.example.infobeauty_app_android;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class CadastroUsuario extends AppCompatActivity{

    private EditText editEmail_Tela_CadastroUsuario;
    private EditText editCep_Tela_CadastroUsuario;
    private EditText editSenha_Tela_CadastroUsuario;
    private EditText editConfirme_Sua_Senha_Tela_CadastroUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        editEmail_Tela_CadastroUsuario               = (EditText)findViewById(R.id.editEmail_Tela_CadastroUsuario);
        editCep_Tela_CadastroUsuario                 = (EditText)findViewById(R.id.editCep_Tela_CadastroUsuario);
        editSenha_Tela_CadastroUsuario               = (EditText)findViewById(R.id.editSenha_Tela_CadastroUsuario);
        editConfirme_Sua_Senha_Tela_CadastroUsuario  = (EditText)findViewById(R.id.editConfirme_Sua_Senha_Tela_CadastroUsuario);

   }





}
