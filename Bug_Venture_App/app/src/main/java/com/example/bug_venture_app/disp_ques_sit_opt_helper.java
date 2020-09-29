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
    private static final String DB_NAME = "SQz2.db";

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
        //0
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //1
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma, what will you choose?"));
        //2
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //3
        arrayList.add(new sit_abv_opt_ques("As Mahesh Verma, what will you choose?"));
        //4
        arrayList.add(new sit_abv_opt_ques("What would you do?"));
        //5
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //6
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //7
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //8
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //9
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma, what will you chose?"));
        //10
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma, what will you choose?"));
        //11
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //12
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //13
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //14
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //15
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //16
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //17
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //18
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //19
        arrayList.add(new sit_abv_opt_ques("As Mahesh Verma, what will you choose?"));
        //20
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //21
        arrayList.add(new sit_abv_opt_ques("As Mahesh Verma, what will you choose?"));
        //22
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //23
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //24
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //25
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //26
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //27
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //28
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //29
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //30
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //31
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //32
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //33
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //34
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //35
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //36
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //37
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //38
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //39
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //40
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //41
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //42
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //43
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //44
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //45
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //46
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //47
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //48
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //49
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //50
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //51
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //52
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //53
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //54
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //55
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //56
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //57
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //58
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //59
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //60
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //61
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //62
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //63
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //64
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //65
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //66
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //67
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //68
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //69
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //70
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //71
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //72
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //73
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //74
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //75
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //76
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //77
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //78
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //79
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //80
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //81
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //82
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //83
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //84
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //85
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //86
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //87
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //88
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //89
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //90
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //91
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //92
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //93
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //94
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //95
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //96
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //97
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //98
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //99
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //100
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //101
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //102
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //103
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //104
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //105
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //106
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //107
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //108
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //109
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //110
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //111
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //112
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //113
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //114
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //115
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //116
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //117
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //118
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //119
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //120
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //121
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //122
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //123
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //124
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //125
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //126
        arrayList.add(new sit_abv_opt_ques("disp_on_screen"));
        //127
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



















