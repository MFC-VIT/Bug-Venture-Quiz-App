package com.example.bug_venture_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class Question_Helper extends SQLiteOpenHelper{

    private Context context;
    private static final String DB_NAME = "Quiz13.db";
    private static final int DB_VERSION = 3;
    private static final String TABLE_NAME = "Quiz_Questions";
    private static final String UID = "_UID";
    private static final String QUESTION = "QUESTION";
    private static final String OPTA = "OPTA";
    private static final String OPTB = "OPTB";
    private static final String OPTC = "OPTC";
    private static final String OPTD = "OPTD";
    private static final String ANSWER = "ANSWER";

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " + OPTD + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    Question_Helper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
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
        ArrayList<QuizQuestion> arraylist = new ArrayList<>();

        arraylist.add(new QuizQuestion("Given two integers a and b, With the help of which expression can we find the minimum no. between a and b without using conditional statement.", "(a<b)*b + (b>a)*a", "(a>b)*b + (b>a)*a", "(a*b)*a +  (a<b)*b", "(a>a)*b + (b>a)*a", "(a>b)*b + (b>a)*a"));

        arraylist.add(new QuizQuestion("King decided to punish a minister and asked him to make a statement. The minister should make such a statement so that he would be alive. \nIf the statement is held true by the King, the minister will be hanged to death and if the statement is held false, the minister will be shot dead.", "I will not be shot dead.", "I will be shot dead.", "You will not hang me", "It was not my fault", "I will be shot dead"));

        arraylist.add(new QuizQuestion("In a t20 cricket match, considering no extras(no wides, no ‘no’ balls, etc.) and no overthrows. \nWhat is the maximum number of runs that a batsman can score in an ideal case?", "610", "720", "663", "640", "663"));

        arraylist.add(new QuizQuestion("Rakesh purchased a pair of socks of Rs 200 from Sanjay. He paid him through a 500 Rs Note. Realizing that he did not have change, Sanjay got change for that note from another person and paid Rs 300 to the Rakesh. \nAfter a few days, Rakesh realized that the note was fake, And this railed at Sanjay and took 500 Rs back from him. So in this whole process how much money did Sanjay lose in the end?", "300", "400", "0", "500", "500"));

        arraylist.add(new QuizQuestion("The average temperature of a week excluding Day1 is 30 and  the average temperature of week excluding Day2 is 20. The sum of temperatures of Day1 and Day2 is 90. Individual temperatures of the two days are:", "15, 45", "10, 40", "15, 75", "20, 30", "15, 75"));

        arraylist.add(new QuizQuestion("A scientist puts a virus in a petri dish at exactly 1pm. Every minute the virus divides into two and doubles in size. At exactly 2pm the petri dish is full. At what time was the dish half full?\n", "1:30pm", "1:29pm", "1:59pm", "1:46pm", "1:59pm"));

        arraylist.add(new QuizQuestion("Two boats, traveling at 5 km and 10 km per hour, head directly towards each other They begin at a distance of 20 km from each other How far apart are they one minute before they collide?", "500m", "650m", "250m", "330m", "250m"));

        arraylist.add(new QuizQuestion("Mohan and Paul sell some articles for Rs. 8000 each. Mohan calculates his profit percent on his CP and Parul calculates the profit percent wrongly on SP. What is the difference in the actual profit if both claims to have a profit of 60%?", "Rs 1800", "Rs 900", "Rs 1200", "Rs. 1000", "Rs 1800"));


        this.addAllQuestions(arraylist);
    }

    private void addAllQuestions(ArrayList<QuizQuestion> allQuestions) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            for(QuizQuestion question : allQuestions) {
                values.put(QUESTION, question.getQuestion());
                values.put(OPTA, question.getOptA());
                values.put(OPTB, question.getOptB());
                values.put(OPTC, question.getOptC());
                values.put(OPTD, question.getOptD());
                values.put(ANSWER, question.getAnswer());
                db.insert(TABLE_NAME, null, values);
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
            db.close();
        }
    }

    List<QuizQuestion> getAllOfTheQuestions() {

        List<QuizQuestion> questionList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String column[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER};
        Cursor cursor = db.query(TABLE_NAME, column, null, null, null, null, null);

        while (cursor.moveToNext()) {
            QuizQuestion question = new QuizQuestion();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setOptA(cursor.getString(2));
            question.setOptB(cursor.getString(3));
            question.setOptC(cursor.getString(4));
            question.setOptD(cursor.getString(5));
            question.setAnswer(cursor.getString(6));
            questionList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionList;
    }
}
