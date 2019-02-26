package com.example.sengnupan.android_pj;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class DatabaseHandler extends SQLiteOpenHelper {
    public DatabaseHandler myhelper;
    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "dataManager";

    //  table name
    private static final String TABLE_NAME = "data";

    //  Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "Name";
    // private static final String KEY_IS_FAVOURITE= "IsFavourite";

    public DatabaseHandler(Context context) {
        super(context ,DATABASE_NAME, null, DATABASE_VERSION);

    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME+ " TEXT)";
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME );

        // Create tables again
        onCreate(db);
    }

    public boolean addData (String data){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, data);
        //values.put(KEY_IS_FAVOURITE, data.getIsFavoutire());

        // Inserting Row
        db.insert(TABLE_NAME, null, values);
        db.close(); // Closing database connection
        return true;
    }


    public Cursor getListContents(){

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        return data;

    }
}
