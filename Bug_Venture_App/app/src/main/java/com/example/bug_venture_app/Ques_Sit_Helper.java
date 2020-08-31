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
    private static final String DB_NAME = "QuizSit.db";
    private static final int DB_VERSION = 3;
    private static final String TABLE_NAME = "Quiz_Questions";
    private static final String UID = "_UID";
    private static final String QUESTION = "QUESTION";
    private static final String ANSWER = "ANSWER";

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " +  ANSWER + " VARCHAR(255));";
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

        arraylist.add(new QuizQuestionSit("Who is Larry Pressler ?", "Politician"));

        arraylist.add(new QuizQuestionSit("Michael Jackson is a distinguished person in the field of ?", "Pop Music"));

        arraylist.add(new QuizQuestionSit("The first Indian to swim across English channel was ?",  "Mihir Sen"));

        arraylist.add(new QuizQuestionSit("Who was the first Indian to make a movie?", "Dhundiraj Govind Phalke"));

        arraylist.add(new QuizQuestionSit("Who is known as the ' Saint of the gutters ?", "Mother Teresa"));

        arraylist.add(new QuizQuestionSit("Who invented the famous formula E=mc^2", "Albert Einstein"));

        arraylist.add(new QuizQuestionSit("Who is elected as president of us 2016", "Donald Trump"));

        arraylist.add(new QuizQuestionSit("Who was the founder of company Microsoft","Bill Gates"));

        arraylist.add(new QuizQuestionSit("Who was the founder of company Apple ?", "Steve Jobs"));

        arraylist.add(new QuizQuestionSit("Who was the founder of company Google ?", "Larry Page"));

        arraylist.add(new QuizQuestionSit("Who is know as god of cricket ?","Sachin Tendulkar"));

        arraylist.add(new QuizQuestionSit("who has won ballon d'or of 2015 ?","Lionel Messi"));

        arraylist.add(new QuizQuestionSit("who has won ballon d'or of 2014 ?", "Cristiano Ronaldo"));

        arraylist.add(new QuizQuestionSit("the Founder of the most famous gaming platform steam is ?", "Gabe Newell"));

        arraylist.add(new QuizQuestionSit("UN's International day of friendship is observed every year on which date?", "30 July"));

        this.addAllQuestions(arraylist);
    }

    private void addAllQuestions(ArrayList<QuizQuestionSit> allQuestions) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            for(QuizQuestionSit question : allQuestions) {
                values.put(QUESTION, question.getQuestion());
                values.put(ANSWER, question.getAnswer());
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
        String column[] = {UID, QUESTION, ANSWER};
        Cursor cursor = db.query(TABLE_NAME, column, null, null, null, null, null);

        while (cursor.moveToNext()) {
            QuizQuestionSit question = new QuizQuestionSit();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setAnswer(cursor.getString(2));
            questionList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionList;
    }
}
