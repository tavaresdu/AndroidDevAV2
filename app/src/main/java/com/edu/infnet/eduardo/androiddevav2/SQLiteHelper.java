package com.edu.infnet.eduardo.androiddevav2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "curriculum.db";
    public static final String TABLE = "curriculum";
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String ENDERECO = "endereco";
    public static final String ESTADO = "estado";
    public static final String CIDADE = "cidade";
    public static final String TELEFONE = "telefone";
    public static final String EMAIL = "email";
    public static final String FORMACAO_INSTITUICAO = "formacao_instituicao";
    public static final String FORMACAO_INGRESSO = "formacao_ingresso";
    public static final String FORMACAO_TERMINO = "formacao_termino";
    public static final String EXP_EMPRESA = "exp_empresa";
    public static final String EXP_FUNCAO = "exp_funcao";
    public static final String EXP_PERIODO = "exp_periodo";
    public static final String CURSO_INTITUICAO = "curso_instituicao";
    public static final String CURSO_NOME = "curso_nome";
    public static final String PUB_NOME = "pub_nome";
    public static final String PUB_FONTE = "pub_fonte";
    public static final int VERSAO = 1;

    public SQLiteHelper(Context context) {
        super(context, DB_NAME, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS "+TABLE+"("
                + ID + " integer primary key autoincrement,"
                + NOME + " text,"
                + ENDERECO + " text,"
                + ESTADO + " text,"
                + CIDADE + " text,"
                + TELEFONE + " text,"
                + EMAIL + " text,"
                + FORMACAO_INSTITUICAO + " text,"
                + FORMACAO_INGRESSO + " text,"
                + FORMACAO_TERMINO + " text,"
                + EXP_EMPRESA + " text,"
                + EXP_FUNCAO + " text,"
                + EXP_PERIODO + " text,"
                + CURSO_INTITUICAO + " text,"
                + CURSO_NOME + " text,"
                + PUB_NOME + " text,"
                + PUB_FONTE + " text,"
                +")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }
}
