package com.example.bug_venture_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CpuUsageInfo;

import java.util.ArrayList;
import java.util.List;

public class Sit_Opt_Helper extends SQLiteOpenHelper{
    private Context context;
    private static final String DB_NAME = "OP_ST3.db";
    private static final int DB_VERSION = 3;
    private static final String TABLE_NAME = "OPTION_SIT";
    private static final String UID = "_UID";
    private static final String OPTION1 = "OPTION1";
    private static final String OPTION2 = "OPTION2";

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + OPTION1 + " VARCHAR(255), " + OPTION2 + " VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    Sit_Opt_Helper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int j) {
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);
    }

    void allQuestion() {
        ArrayList<SitOpt> arrayList = new ArrayList<>();

        arrayList.add(new SitOpt("option1", "option2"));

        arrayList.add(new SitOpt("Commit Crime", "Trust Det. give time"));

        arrayList.add(new SitOpt("sol1", "sol2"));

        arrayList.add(new SitOpt("abort mission save wife", "complete mission by kidnapper"));

        arrayList.add(new SitOpt("Take Det's suggestion", "commit real crime"));

        arrayList.add(new SitOpt("sol2", "sol2"));

        arrayList.add(new SitOpt("sol3", "sol3"));
        arrayList.add(new SitOpt("Take Det's suggestion", "commit real crime"));
        arrayList.add(new SitOpt("ask Det. to wait near trash can & catch kidnapper?", "ask the Det. to wait near trash can & catch the kidnapper"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("Give all records", "refuse records to Det."));
        arrayList.add(new SitOpt("Give all records", "Give all records"));
        arrayList.add(new SitOpt("convince Det. to stay on case & solve it?", "let Det. go & solve case yourself?"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("Open kidnapper parcel, ignore Mr. Pradyuman", "Follow Det & leave parcel unopened"));
        arrayList.add(new SitOpt("Open kidnapper parcel, ignore Mr. Pradyuman", "Follow Det & leave parcel unopened"));
        arrayList.add(new SitOpt("Open kidnapper parcel, ignore Mr. Pradyuman", "Follow Det & leave parcel unopened"));
        arrayList.add(new SitOpt("Open kidnapper parcel, ignore Mr. Pradyuman", "Follow Det & leave parcel unopened"));
        arrayList.add(new SitOpt("Take Det. Suggestion?", "Commit Real Crime?"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("option1", "option2"));
        arrayList.add(new SitOpt("Save Mr. Verma", "Save Ria"));
        arrayList.add(new SitOpt("Save Mr. Verma", "Save Ria"));

        this.addAllQuestions(arrayList);
    }

    private void addAllQuestions(ArrayList<SitOpt> allQuestions) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            for(SitOpt question : allQuestions) {
                values.put(OPTION1, question.getOption1());
                values.put(OPTION2, question.getOption2());
                db.insert(TABLE_NAME, null, values);
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
            db.close();
        }
    }

    List<SitOpt> getAllOfTheQuestions() {
        List<SitOpt> questionList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String[] column = {UID, OPTION1, OPTION2};
        Cursor cursor = db.query(TABLE_NAME, column, null, null, null, null, null);

        while(cursor.moveToNext()) {
            SitOpt question = new SitOpt();
            question.setId(cursor.getInt(0));
            question.setOption1(cursor.getString(1));
            question.setOption2(cursor.getString(2));
            questionList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionList;
    }
}