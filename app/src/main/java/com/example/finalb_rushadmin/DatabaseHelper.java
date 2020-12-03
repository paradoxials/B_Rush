package com.example.finalb_rushadmin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static String DATABASE_NAME = "B-rush.db";
    private static int DB_VERSION = 1;

    //list of tables in B-rush database
    private static String TABLE_PERSON = "Person";
    private static String TABLE_DRIVER = "Driver";
    private static String TABLE_USER = "User";

    //list of common columns for all table
    private static String COLUMN_ID = "ID";
    private static String COLUMN_ADDRESS = "Address";
    private static String COLUMN_FK_KEY = "PersonID";

    //column list of Person table
    private static String COLUMN_FNAME = "FirstName";
    private static String COLUMN_MNAME = "MiddleName";
    private static String COLUMN_LNAME = "LastName";
    private static String COLUMN_BDAY = "Birthday";
    private static String COLUMN_CONTACT_NUM = "Contact_Number";

    //column list of User Table
    private static String COLUMN_EMAIL = "Username";
    private static String COLUMN_PASSWORD = "Password";

    //Strings to create the tables
    private static String CREATE_TABLE_PERSON ="create table "+TABLE_PERSON+ " (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
            "FirstName TEXT, MiddleName TEXT, LastName TEXT, Address TEXT, Birthday NUMERIC, Contact_Number TEXT)";
    private static String CREATE_TABLE_DRIVER = "create table "+TABLE_DRIVER+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, PersonID INTEGER)";
    private static String CREATE_TABLE_USER = "create table "+TABLE_USER+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, Username TEXT, Password TEXT, PersonID INTEGER)";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_PERSON);
        db.execSQL(CREATE_TABLE_DRIVER);
        db.execSQL(CREATE_TABLE_USER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_PERSON);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_DRIVER);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_USER);

        onCreate(db);
    }
}
