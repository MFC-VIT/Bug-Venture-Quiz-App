package com.example.bug_venture_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class disp_ques_sit_opt_helper extends SQLiteOpenHelper {
    private Context context;
    private static final String DB_NAME = "SQz1.db";

    private static final int DB_VERSION = 3;
    private static final String TABLE_NAME = "TQ";
    private static final String UID = "_UID";
    private static final String DISPLAY = "DISPLAY";

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + DISPLAY + " VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    disp_ques_sit_opt_helper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);
    }

    void allQuestion(){
        ArrayList<sit_abv_opt_ques> arrayList = new ArrayList<>();

        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));

        this.addAllQuestions(arrayList);
    }

    private void addAllQuestions(ArrayList<sit_abv_opt_ques> allQuestions) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            for(sit_abv_opt_ques question : allQuestions) {
                values.put(DISPLAY, question.getDisplay());
                db.insert(TABLE_NAME, null, values);
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
            db.close();
        }
    }

    List<sit_abv_opt_ques> getAllOfTheQuestions() {
        List<sit_abv_opt_ques> questionList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String[] column = {UID, DISPLAY};
        Cursor cursor = db.query(TABLE_NAME, column, null, null, null, null, null);

        while (cursor.moveToNext()) {
            sit_abv_opt_ques question = new sit_abv_opt_ques();
            question.setId(cursor.getInt(0));
            question.setDisplay(cursor.getString(1));
            questionList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionList;
    }
}



















