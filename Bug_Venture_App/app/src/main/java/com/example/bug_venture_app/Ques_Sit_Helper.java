package com.example.bug_venture_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class Ques_Sit_Helper extends SQLiteOpenHelper{

    private Context context;
    private static final String DB_NAME = "Sit_ues.db";
    private static final int DB_VERSION = 3;
    private static final String TABLE_NAME = "Quiz_Question";
    private static final String UID = "_UID";
    private static final String QUESTION = "QUESTION";

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    Ques_Sit_Helper(Context context) {
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
        ArrayList<QuizQuestionSit> arraylist = new ArrayList<>();

        arraylist.add(new QuizQuestionSit("Who is Larry Pressler ?"));

        arraylist.add(new QuizQuestionSit("Pop Music"));

        arraylist.add(new QuizQuestionSit("Stephen Hawking"));

        arraylist.add(new QuizQuestionSit("Dhundiraj Govind Phalke"));

        arraylist.add(new QuizQuestionSit("Mother Teresa"));

        arraylist.add(new QuizQuestionSit("Albert Einstein"));

        arraylist.add(new QuizQuestionSit("Donald Trump"));

        arraylist.add(new QuizQuestionSit("Bill Gates"));

        arraylist.add(new QuizQuestionSit("Steve Jobs"));

        arraylist.add(new QuizQuestionSit("Larry Page"));

        arraylist.add(new QuizQuestionSit("Sachin Tendulkar"));

        arraylist.add(new QuizQuestionSit("Lionel Messi"));

        arraylist.add(new QuizQuestionSit("Cristiano Ronaldo"));

        arraylist.add(new QuizQuestionSit("Gabe Newell"));

        arraylist.add(new QuizQuestionSit("30 July"));

        this.addAllQuestions(arraylist);
    }

    private void addAllQuestions(ArrayList<QuizQuestionSit> allQuestions) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            for(QuizQuestionSit question : allQuestions) {
                values.put(QUESTION, question.getQuestion());
                db.insert(TABLE_NAME, null, values);
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
            db.close();
        }
    }

    List<QuizQuestionSit> getAllOfTheQuestions() {
        List<QuizQuestionSit> questionList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String[] column = {UID, QUESTION};
        Cursor cursor = db.query(TABLE_NAME, column, null, null, null, null, null);

        while (cursor.moveToNext()) {
            QuizQuestionSit question = new QuizQuestionSit();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            questionList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionList;
    }
}
