package com.example.infobeauty_app_android.database;

public class ScriptDLL {

    public static String getCreateTableCliente(){
        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE (");
        sql.append("     ID         INTEGER       PRIMARY KEY AUTOINCREMENT NOT NULL, ");
        sql.append("     NOME_CL    VARCHAR (250) NOT NULL DEFAULT (''), ");
        sql.append("     SEXO       VARCHAR (20)  NOT NULL DEFAULT (''), ");
        sql.append("     ENDERECO   VARCHAR (250) NOT NULL DEFAULT (''), ");
        sql.append("     EMAIL      VARCHAR (250) NOT NULL DEFAULT (''), ");
        sql.append("     TELEFONE   VARCHAR (25)  NOT NULL DEFAULT (''), ");
        sql.append("     CEP        VARCHAR (10)  NOT NULL DEFAULT (''), ");
        sql.append("     SENHA      VARCHAR (50)  NOT NULL DEFAULT ('') ) ");

        return sql.toString();

    }
}
