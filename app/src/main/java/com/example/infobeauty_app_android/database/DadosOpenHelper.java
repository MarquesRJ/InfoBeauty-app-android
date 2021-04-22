package com.example.infobeauty_app_android.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DadosOpenHelper extends SQLiteOpenHelper {


    public DadosOpenHelper (Context context) {

        super(context, "Dados", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL( ScriptDLL.getCreateTableCliente() );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int OldVersion, int NewVersion) {

    }
}
