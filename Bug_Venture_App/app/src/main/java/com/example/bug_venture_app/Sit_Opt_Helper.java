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
    private static final String DB_NAME = "OP_ST1131.db";
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
        arrayList.add(new SitOpt("Commit Crime", "Trust the Detective and Wait"));
        //2
        arrayList.add(new SitOpt("Not Commit Crime", "Commit Crime"));
//3
        arrayList.add(new SitOpt("Abort the Mission and save your wife", "Complete the mission"));
//4
        arrayList.add(new SitOpt("Take the Detective's suggestion", "Commit the crime for real"));
//5
        arrayList.add(new SitOpt("Believe Mother", "Believe Father and neighbors"));
//6
        arrayList.add(new SitOpt("Use lethal injection", "use a gun"));
        //7
        arrayList.add(new SitOpt("Take Detective's suggestion", "commit the crime for real"));
        //8
        arrayList.add(new SitOpt("Give all the records", "Refuse to give records"));
        //9
        arrayList.add(new SitOpt("Give all the records", "Refuse to give records"));
        //10
        arrayList.add(new SitOpt("Give all the records", "Refuse to give records"));
        //11
        arrayList.add(new SitOpt("continue investigating", "stop investigating and choose murder"));
        //12
        arrayList.add(new SitOpt("investigate rhea's whereabouts", "Help Pooja, Commit Crime"));
        //13
        arrayList.add(new SitOpt("Complete mission alone", "Take Pooja Along"));
        //14
        arrayList.add(new SitOpt("Complete mission alone", "Take Pooja Along"));
        //15
        arrayList.add(new SitOpt("Give all the records", "Refuse to give records"));
        //16
        arrayList.add(new SitOpt("Give all the records", "Refuse to give records"));
        //17
        arrayList.add(new SitOpt("Open the kidnapper's parcel", "Ignore parcel and arrange funeral"));
        //18
        arrayList.add(new SitOpt("Open the kidnapper's parcel", "Ignore parcel and arrange funeral"));
        //19
        arrayList.add(new SitOpt("Open the kidnapper's parcel", "Ignore parcel and arrange funeral"));
        //20
        arrayList.add(new SitOpt("Open the kidnapper's parcel", "Ignore parcel and arrange funeral"));
        //21
        arrayList.add(new SitOpt("Open the kidnapper's parcel", "Ignore parcel and arrange funeral"));
        //22
        arrayList.add(new SitOpt("Open the kidnapper's parcel", "Ignore parcel and arrange funeral"));
        //23
        arrayList.add(new SitOpt("Ask for Kid's Records", "Wait for kid after school"));
        //24
        arrayList.add(new SitOpt("choose unregistered gun", "choose army gun"));
        //25
        arrayList.add(new SitOpt("Ask for Kid's Records", "Wait for kid after school"));
        //26
        arrayList.add(new SitOpt("choose unregistered gun", "choose army gun"));
        //27
        arrayList.add(new SitOpt("choose unregistered gun", "choose army gun"));
        //28
        arrayList.add(new SitOpt("choose unregistered gun", "choose army gun"));
        //29
        arrayList.add(new SitOpt("choose unregistered gun", "choose army gun"));
        //30
        arrayList.add(new SitOpt("choose unregistered gun", "choose army gun"));
        //31
        arrayList.add(new SitOpt("Open the kidnapper's parcel", "Ignore parcel and arrange funeral"));
        //32
        arrayList.add(new SitOpt("Open the kidnapper's parcel", "Ignore parcel and arrange funeral"));
        //33
        arrayList.add(new SitOpt("Open the kidnapper's parcel", "Ignore parcel and arrange funeral"));
        //34
        arrayList.add(new SitOpt("Open the kidnapper's parcel", "Ignore parcel and arrange funeral"));
        //35
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //36
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //37
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //38
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //39
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //40
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //41
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //42
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //43
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //44
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //45
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //46
        arrayList.add(new SitOpt("Commit final crime", "Do not commit crime"));
        //47
        arrayList.add(new SitOpt("Confront Pooja", "Try to talk to kid after school next day"));
        //48
        arrayList.add(new SitOpt("Leave Kid", "Keep Questioning Kid"));
        //49
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //50
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //51
        arrayList.add(new SitOpt("Confront Pooja", "Try to talk to kid after school next day"));
        //52
        arrayList.add(new SitOpt("Leave Kid", "Keep Questioning Kid"));
        //53
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //54
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //55
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //56
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //57
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //58
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //59
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //60
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //61
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //62
        arrayList.add(new SitOpt("Confront Pooja about Rhea", "Confront Rhea"));
        //63
        arrayList.add(new SitOpt("Save Mr.Verma", "Save Rhea"));
        //64
        arrayList.add(new SitOpt("Follow Stranger", "Follow Nanaji"));
        //65
        arrayList.add(new SitOpt("Save Mr.Verma", "Save Rhea"));
        //66
        arrayList.add(new SitOpt("Save Mr.Verma", "Save Rhea"));
        //67
        arrayList.add(new SitOpt("Save Mr.Verma", "Save Rhea"));
        //68
        arrayList.add(new SitOpt("Save Mr.Verma", "Save Rhea"));
        //69
        arrayList.add(new SitOpt("Save Mr.Verma", "Save Rhea"));
        //70
        arrayList.add(new SitOpt("Save Mr.Verma", "Save Rhea"));
        //71
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //72
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //73
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //74
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //75
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //76
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //77
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //78
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //79
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //80
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //81
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //82
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //83
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //84
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //85
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //86
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //87
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //88
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //89
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //90
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //91
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //92
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //93
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //94
        arrayList.add(new SitOpt("Kill Mr.Verma", "Kill Rhea"));
        //95
        arrayList.add(new SitOpt("Call Psychiatric hospital to take Pooja", "Try to explain Pooja that Rhea is not her daughter"));
        //96
        arrayList.add(new SitOpt("Confront Pooja", "Report Pooja to the police"));
        //97
        arrayList.add(new SitOpt("Maybe she had a bad encounter with Pooja in past", "Maybe she knew Pooja and missed her"));
        //98
        arrayList.add(new SitOpt("Binod confronts Ankita about Pooja", "Binod Panics and leave"));
        //99
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //100
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //101
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //102
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //103
        arrayList.add(new SitOpt("Turn Pooja to police", "Try to explain to Pooja that Rhea is not her daughter"));
        //104
        arrayList.add(new SitOpt("Confront Pooja", "Report Pooja to the public"));
        //105
        arrayList.add(new SitOpt("Maybe she had a bad encounter with Pooja in past", "Maybe she knew Pooja and missed her"));
        //106
        arrayList.add(new SitOpt("Binod confronts Ankita about Pooja", "Binod Panics and leave"));
        //107
        arrayList.add(new SitOpt("Surrender yourself to Police", "Leave town and run away."));
        //108
        arrayList.add(new SitOpt("Surrender yourself to Police", "Leave town and run away."));
        //109
        arrayList.add(new SitOpt("Surrender yourself to Police", "Leave town and run away."));
        //110
        arrayList.add(new SitOpt("Surrender yourself to Police", "Leave town and run away."));
        //111
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //112
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //113
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //114
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //115
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //116
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //117
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //118
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //119
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //120
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //121
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //122
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //123
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //124
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //125
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));
        //126
        arrayList.add(new SitOpt("Surrender yourself to police", "Leave town and run away"));





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