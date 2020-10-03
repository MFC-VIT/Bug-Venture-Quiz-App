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
    private static final String DB_NAME = "SQzm231.db";

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
        arrayList.add(new sit_abv_opt_ques("As Binod what will Binod choose?"));
        //3
        arrayList.add(new sit_abv_opt_ques("As Mahesh Verma, what will you choose?"));
        //4
        arrayList.add(new sit_abv_opt_ques("What would you do?"));
        //5
        arrayList.add(new sit_abv_opt_ques("As Binod what will Binod choose?"));
        //6
        arrayList.add(new sit_abv_opt_ques("What would you use to commit the crime?"));
        //7
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma what will you choose?"));
        //8
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma what will you choose?"));
        //9
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma, what will you chose?"));
        //10
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma, what will you choose?"));
        //11
        arrayList.add(new sit_abv_opt_ques("As Binod what will Binod choose?"));
        //12
        arrayList.add(new sit_abv_opt_ques("As Binod, what will you choose next?"));
        //13
        arrayList.add(new sit_abv_opt_ques("As binod what will you choose?"));
        //14
        arrayList.add(new sit_abv_opt_ques("As binod what will you choose?"));
        //15
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma what will you choose?\n"));
        //16
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma what will you choose?\n"));
        //17
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma, what will you choose?"));
        //18
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma, what will you choose?"));
        //19
        arrayList.add(new sit_abv_opt_ques("As Mahesh Verma, what will you choose?"));
        //20
        arrayList.add(new sit_abv_opt_ques("As Mahesh Verma, what will you choose?"));
        //21
        arrayList.add(new sit_abv_opt_ques("As Mahesh Verma, what will you choose?"));
        //22
        arrayList.add(new sit_abv_opt_ques("As Mahesh Verma, what will you choose?"));
        //23
        arrayList.add(new sit_abv_opt_ques("After listening to the teacher what will Binod do as Binod?"));
        //24
        arrayList.add(new sit_abv_opt_ques("As Binod what gun will you choose?"));
        //25
        arrayList.add(new sit_abv_opt_ques("After listening to the teacher what will Binod do as Binod?"));
        //26
        arrayList.add(new sit_abv_opt_ques("As Binod what gun will you choose?"));
        //27
        arrayList.add(new sit_abv_opt_ques("As Binod what gun will you choose?"));
        //28
        arrayList.add(new sit_abv_opt_ques("As Binod what gun will you choose?"));
        //29
        arrayList.add(new sit_abv_opt_ques("As Binod what gun will you choose?"));
        //30
        arrayList.add(new sit_abv_opt_ques("As Binod what gun will you choose?"));
        //31
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma what will you choose?\n"));
        //32
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma what will you choose?\n"));
        //33
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma what will you choose?\n"));
        //34
        arrayList.add(new sit_abv_opt_ques("As Mr.Verma what will you choose?\n"));
        //35
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //36
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //37
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //38
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //39
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //40
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //41
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //42
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //43
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //44
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //45
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //46
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose?"));
        //47
        arrayList.add(new sit_abv_opt_ques("As Binod what will Binod choose?"));
        //48
        arrayList.add(new sit_abv_opt_ques("As Binod what will Binod choose?"));
        //49
        arrayList.add(new sit_abv_opt_ques("As Binod what would you choose?"));
        //50
        arrayList.add(new sit_abv_opt_ques("As Binod what would you choose?"));
        //51
        arrayList.add(new sit_abv_opt_ques("As Binod what would you choose?"));
        //52
        arrayList.add(new sit_abv_opt_ques("As Binod what will Binod choose?"));
        //53
        arrayList.add(new sit_abv_opt_ques("As Binod what would you choose?"));
        //54
        arrayList.add(new sit_abv_opt_ques("As Binod what would you choose?"));
        //55
        arrayList.add(new sit_abv_opt_ques("As Binod, what would you do?"));
        //56
        arrayList.add(new sit_abv_opt_ques("As Binod, what would you do?"));
        //57
        arrayList.add(new sit_abv_opt_ques("As Binod, what would you do?"));
        //58
        arrayList.add(new sit_abv_opt_ques("As Binod, what would you do?"));
        //59
        arrayList.add(new sit_abv_opt_ques("As Binod, what would you do?"));
        //60
        arrayList.add(new sit_abv_opt_ques("As Binod, what would you do?"));
        //61
        arrayList.add(new sit_abv_opt_ques("As Binod, what would you do?"));
        //62
        arrayList.add(new sit_abv_opt_ques("As Binod, what would you do?"));
        //63
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma, what will you choose?\n"));
        //64
        arrayList.add(new sit_abv_opt_ques("As Mr.Pradyuman, what will you choose?\n"));
        //65
        arrayList.add(new sit_abv_opt_ques("As a Mrs. Verma what will you choose?"));
        //66
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose ?"));
        //67
        arrayList.add(new sit_abv_opt_ques("As a Mrs. Verma what will you choose?"));
        //68
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose ?"));
        //69
        arrayList.add(new sit_abv_opt_ques("As a Mrs. Verma what will you choose?"));
        //70
        arrayList.add(new sit_abv_opt_ques("Which envelope will you choose ?"));
        //71
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //72
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?\n"));
        //73
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //74
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?\n"));
        //75
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //76
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?\n"));
        //77
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //78
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?\n"));
        //79
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //80
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?"));
        //81
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //82
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?"));
        //83
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //84
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?"));
        //85
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //86
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?"));
        //87
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //88
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?"));
        //89
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //90
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?"));
        //91
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //92
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?"));
        //93
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you kill?"));
        //94
        arrayList.add(new sit_abv_opt_ques("As Mrs. Verma who will you save?"));
        //95
        arrayList.add(new sit_abv_opt_ques("As Binod what will Binod choose?"));
        //96
        arrayList.add(new sit_abv_opt_ques("As Binod what will Binod choose?"));
        //97
        arrayList.add(new sit_abv_opt_ques("As Binod what is the probable thought which comes to Binod mind?"));
        //98
        arrayList.add(new sit_abv_opt_ques("As Binod, what would you do?"));
        //99
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //100
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //101
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //102
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //103
        arrayList.add(new sit_abv_opt_ques("As Binod what would you choose?"));
        //104
        arrayList.add(new sit_abv_opt_ques("As Binod what would you do?"));
        //105
        arrayList.add(new sit_abv_opt_ques("As Binod what is the probable thought which comes to Binod's mind?"));
        //106
        arrayList.add(new sit_abv_opt_ques("As Binod, what would you do?"));
        //107
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //108
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //109
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //110
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //111
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //112
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //113
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //114
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //115
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //116
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //117
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //118
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //119
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //120
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //121
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //122
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //123
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //124
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //125
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
        //126
        arrayList.add(new sit_abv_opt_ques("As Binod what will you do next?"));
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


















