package com.edu.infnet.eduardo.androiddevav2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQliteHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "curriculum.db";
    private static final String TABLE = "curriculum";
    private static final String ID = "id";
    private static final String NOME = "nome";
    private static final String ENDERECO = "endereco";
    private static final String ESTADO = "estado";
    private static final String CIDADE = "cidade";
    private static final String TELEFONE = "telefone";
    private static final String EMAIL = "email";
    private static final String FORMACAO_INSTITUICAO = "formacao_instituicao";
    private static final String FORMACAO_INGRESSO = "formacao_ingresso";
    private static final String FORMACAO_TERMINO = "formacao_termino";
    private static final String EXP_EMPRESA = "exp_empresa";
    private static final String EXP_FUNCAO = "exp_funcao";
    private static final String EXP_PERIODO = "exp_periodo";
    private static final String CURSO_INTITUICAO = "curso_instituicao";
    private static final String CURSO_NOME = "curso_nome";
    private static final String PUB_NOME = "pub_nome";
    private static final String PUB_FONTE = "pub_fonte";
    private static final int VERSAO = 1;

    public SQliteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
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
