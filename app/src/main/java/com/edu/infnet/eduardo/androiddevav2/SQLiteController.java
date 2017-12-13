package com.edu.infnet.eduardo.androiddevav2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

public class SQLiteController {
    private SQLiteDatabase db;
    private SQLiteHelper db_helper;

    public SQLiteController(Context context) {
        db_helper = new SQLiteHelper(context);
    }

    public long insert(HashMap<String, String> values){
        ContentValues v;
        long result;

        db = db_helper.getWritableDatabase();
        v = new ContentValues();
        for (String key : values.keySet()) {
            v.put(key, values.get(key));
        }

        result = db.insert(db_helper.TABLE, null, v);
        db.close();

        return result;
    }

//    public ArrayList select(String name){
//        Cursor cursor;
//        String[] campos =  {banco.ID,banco.TITULO};
//        db = banco.getReadableDatabase();
//        cursor = db.rawQuery("SELECT * FROM "+ SQLiteHelper.TABLE +
//                "WHERE "+ SQLiteHelper.NOME+" LIKE '%"+name+"%'" +
//                "ORDER BY "+ SQLiteHelper.NOME+" ASC", null);
//
//        ArrayList results = new ArrayList<HashMap>();
//        String[] columns = cursor.getColumnNames();
//        if(cursor != null){
//            while (cursor.moveToNext()) {
//                cursor.getColumnNames();
//            }
//        } else {
//            results = null;
//        }
//        db.close();
//        return results;
//    }
//    }
}