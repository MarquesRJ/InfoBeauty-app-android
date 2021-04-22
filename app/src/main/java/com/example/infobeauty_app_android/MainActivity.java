package com.example.infobeauty_app_android;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import com.example.infobeauty_app_android.database.DadosOpenHelper;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    //private ConstraintLayout layoutMain;
    private SQLiteDatabase conexao;
    private DadosOpenHelper dadosOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void criarconexao(){

        try {

            dadosOpenHelper = new DadosOpenHelper(this);

            conexao = dadosOpenHelper.getWritableDatabase();

            //Snackbar.make():

        }catch (SQLException ex){


        }



    }
    public void telaIndexUsuario(View view){

        Intent intent = new Intent(this, IndexUsuario.class);
        startActivity(intent);
    }

    public void telaIndexEmpresa(View view){

        Intent intent = new Intent(this, IndexEmpresa.class);
        startActivity(intent);
    }
}