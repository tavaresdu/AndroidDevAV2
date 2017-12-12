package com.edu.infnet.eduardo.androiddevav2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

public class SQLiteController {
    private SQLiteDatabase db;
    private SQliteHelper db_helper;

    public SQLiteController(Context context){
        db_helper = new SQliteHelper(context);
    }

    public String insert(HashMap<String, String> values){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.TITULO, titulo);
        valores.put(CriaBanco.AUTOR, autor);
        valores.put(CriaBanco.EDITORA, editora);

        resultado = db.insert(CriaBanco.TABELA, null, valores);
        db.close();

        if (resultado ==-1)
            return "Erro ao inserir registro";
        else
            return "Registro Inserido com sucesso”;

    }
}