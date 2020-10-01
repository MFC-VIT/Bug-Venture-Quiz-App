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
    private static final String DB_NAME = "OP_ST9.db";
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
        //0
        arrayList.add(new SitOpt("option1", "option2"));
        //1
        arrayList.add(new SitOpt("Commit Crime", "Trust the \nDetective \nand Wait"));
        //2
        arrayList.add(new SitOpt("Not Commit Crime", "Commit Crime"));
//3
        arrayList.add(new SitOpt("Abort the \nMission and \nsave your wife", "Complete the \nmission"));
//4
        arrayList.add(new SitOpt("Take the Detective's \nsuggestion", "Commit the \ncrime for real"));
//5
        arrayList.add(new SitOpt("Believe Mother", "Believe Father \nand neighbors"));
//6
        arrayList.add(new SitOpt("Use lethal \ninjection", "use a gun"));
        //7
        arrayList.add(new SitOpt("Take Detective's\nsuggestion", "commit the\ncrime for\nreal"));
        //8
        arrayList.add(new SitOpt("Give all \nthe records", "Refuse to \ngive records"));
        //9
        arrayList.add(new SitOpt("Give all \nthe records", "Refuse to \ngive records"));
        //10
        arrayList.add(new SitOpt("Give all \nthe records", "Refuse to \ngive records"));
        //11
        arrayList.add(new SitOpt("continue \ninvestigating", "stop investigating \nand choose murder"));
        //12
        arrayList.add(new SitOpt("investigate rhea's \nwhereabouts", "Help Pooja, \nCommit Crime"));
        //13
        arrayList.add(new SitOpt("Complete mission \nalone", "Take Pooja \nAlong"));
        //14
        arrayList.add(new SitOpt("Complete mission \nalone", "Take Pooja \nAlong"));
        //15
        arrayList.add(new SitOpt("Give all \nthe records", "Refuse to \ngive records"));
        //16
        arrayList.add(new SitOpt("Give all \nthe records", "Refuse to \ngive records"));
        //17
        arrayList.add(new SitOpt("Open the\nkidnapper's\nparcel", "Ignore parcel\nand arrange\nfuneral"));
        //18
        arrayList.add(new SitOpt("Open the\nkidnapper's\nparcel", "Ignore parcel\nand arrange\nfuneral"));
        //19
        arrayList.add(new SitOpt("Open the\nkidnapper's\nparcel", "Ignore parcel\nand arrange\nfuneral"));
        //20
        arrayList.add(new SitOpt("Open the\nkidnapper's\nparcel", "Ignore parcel\nand arrange\nfuneral"));
        //21
        arrayList.add(new SitOpt("Open the\nkidnapper's\nparcel", "Ignore parcel\nand arrange\nfuneral"));
        //22
        arrayList.add(new SitOpt("Open the\nkidnapper's\nparcel", "Ignore parcel\nand arrange\nfuneral"));
        //23
        arrayList.add(new SitOpt("Ask for Kid's \nRecords", "Wait for kid \nafter school"));
        //24
        arrayList.add(new SitOpt("choose unregistered \ngun", "choose army \ngun"));
        //25
        arrayList.add(new SitOpt("Ask for Kid's \nRecords", "Wait for kid \nafter school"));
        //26
        arrayList.add(new SitOpt("choose unregistered \ngun", "choose army \ngun"));
        //27
        arrayList.add(new SitOpt("choose unregistered \ngun", "choose army \ngun"));
        //28
        arrayList.add(new SitOpt("choose unregistered \ngun", "choose army \ngun"));
        //29
        arrayList.add(new SitOpt("choose unregistered \ngun", "choose army \ngun"));
        //30
        arrayList.add(new SitOpt("choose unregistered \ngun", "choose army \ngun"));
        //31
        arrayList.add(new SitOpt("Open the\nkidnapper's\nparcel", "Ignore parcel\nand arrange\nfuneral"));
        //32
        arrayList.add(new SitOpt("Open the\nkidnapper's\nparcel", "Ignore parcel\nand arrange\nfuneral"));
        //33
        arrayList.add(new SitOpt("Open the\nkidnapper's\nparcel", "Ignore parcel\nand arrange\nfuneral"));
        //34
        arrayList.add(new SitOpt("Open the\nkidnapper's\nparcel", "Ignore parcel\nand arrange\nfuneral"));
        //35
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //36
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //37
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //38
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //39
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //40
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //41
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //42
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //43
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //44
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //45
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //46
        arrayList.add(new SitOpt("Commit final\ncrime", "Do not\ncommit crime"));
        //47
        arrayList.add(new SitOpt("Confront \nPooja", "Try to talk to\nkid after\nschool next day"));
        //48
        arrayList.add(new SitOpt("Leave Kid", "Keep Questioning\nKid"));
        //49
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //50
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //51
        arrayList.add(new SitOpt("Confront \nPooja", "Try to talk to\nkid after\nschool next day"));
        //52
        arrayList.add(new SitOpt("Leave Kid", "Keep Questioning\nKid"));
        //53
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //54
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //55
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //56
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //57
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //58
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //59
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //60
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //61
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //62
        arrayList.add(new SitOpt("Confront Pooja\nabout Rhea", "Confront Rhea"));
        //63
        arrayList.add(new SitOpt("Save\nMr.Verma", "Save Rhea"));
        //64
        arrayList.add(new SitOpt("Follow\nStranger", "Follow\nNanaji"));
        //65
        arrayList.add(new SitOpt("Save\nMr.Verma", "Save Rhea"));
        //66
        arrayList.add(new SitOpt("Save\nMr.Verma", "Save Rhea"));
        //67
        arrayList.add(new SitOpt("Save\nMr.Verma", "Save Rhea"));
        //68
        arrayList.add(new SitOpt("Save\nMr.Verma", "Save Rhea"));
        //69
        arrayList.add(new SitOpt("Save\nMr.Verma", "Save Rhea"));
        //70
        arrayList.add(new SitOpt("Save\nMr.Verma", "Save Rhea"));
        //71
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //72
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //73
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //74
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //75
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //76
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //77
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //78
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //79
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //80
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //81
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //82
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //83
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //84
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //85
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //86
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //87
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //88
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //89
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //90
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //91
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //92
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //93
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //94
        arrayList.add(new SitOpt("Kill\nMr.Verma", "Kill Rhea"));
        //95
        arrayList.add(new SitOpt("call psychiatric\nhospital to\ntake Pooja", "Try to explain \nPooja that Rhea is \nnot her daughter"));
        //96
        arrayList.add(new SitOpt("Confront Pooja", "Report Pooja\nto the\npolice"));
        //97
        arrayList.add(new SitOpt("Maybe she\nhad a\nbad encounter\nwith Pooja\nin past", "Maybe she\nknew Pooja\n and missed\nher"));
        //98
        arrayList.add(new SitOpt("Binod confronts\nAnkita about\nPooja", "Binod Panics\nand leave"));
        //99
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //100
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //101
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //102
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //103
        arrayList.add(new SitOpt("Turn Pooja\nto police", "Try to\nexplain to\nPooja that\nRhea is\nnot her\ndaughter"));
        //104
        arrayList.add(new SitOpt("Confront Pooja", "Report Pooja\nto the\npublic"));
        //105
        arrayList.add(new SitOpt("Maybe she\nhad a\nbad encounter\nwith Pooja\nin past", "Maybe she\nknew Pooja\n and missed\nher"));
        //106
        arrayList.add(new SitOpt("Binod confronts\nAnkita about\nPooja", "Binod Panics\nand leave"));
        //107
        arrayList.add(new SitOpt("Surrender yourself \nto Police", "Leave town \nand run away."));
        //108
        arrayList.add(new SitOpt("Surrender yourself \nto Police", "Leave town \nand run away."));
        //109
        arrayList.add(new SitOpt("Surrender yourself \nto Police", "Leave town \nand run away."));
        //110
        arrayList.add(new SitOpt("Surrender yourself \nto Police", "Leave town \nand run away."));
        //111
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //112
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //113
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //114
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //115
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //116
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //117
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //118
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //119
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //120
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //121
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //122
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //123
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //124
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //125
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));
        //126
        arrayList.add(new SitOpt("Surrender yourself\nto police", "Leave town\nand run\naway"));





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