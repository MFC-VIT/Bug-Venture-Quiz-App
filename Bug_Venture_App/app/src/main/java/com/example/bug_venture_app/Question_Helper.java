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
    private static final String DB_NAME = "Quiz12.db";
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

        arraylist.add(new QuizQuestion("Galileo was an Italian astronomer who developed?", "Telescope", "Airoplane", "Electricity", "Train", "Telescope"));

        arraylist.add(new QuizQuestion("Who is the father of Geometry ?", "Aristotle", "Euclid", "Pythagoras", "Kepler", "Euclid"));

        arraylist.add(new QuizQuestion("Who was known as Iron man of India ?", "Govind Ballabh Pant", "Jawaharlal Nehru", "Subhash Chandra Bose", "Sardar Vallabhbhai Patel", "Sardar Vallabhbhai Patel"));

        arraylist.add(new QuizQuestion("The Indian to beat the computers in mathematical wizardry is", "Ramanujam", "Rina Panigrahi", "Raja Ramanna", "Shakunthala Devi", "Shakunthala Devi"));

        arraylist.add(new QuizQuestion("Who is Larry Pressler ?", "Politician", "Painter", "Actor", "Tennis player", "Politician"));

        arraylist.add(new QuizQuestion("Michael Jackson is a distinguished person in the field of ?", "Pop Music", "Jounalism", "Sports", "Acting", "Pop Music"));

        arraylist.add(new QuizQuestion("The first Indian to swim across English channel was ?", "V. Merchant", "P. K. Banerji", "Mihir Sen", "Arati Saha", "Mihir Sen"));

        arraylist.add(new QuizQuestion("Who was the first Indian to make a movie?", "Dhundiraj Govind Phalke", " Asha Bhonsle", " Ardeshir Irani", "V. Shantaram", "Dhundiraj Govind Phalke"));

        arraylist.add(new QuizQuestion("Who is known as the ' Saint of the gutters ?", "B.R.Ambedkar", "Mother Teresa", "Mahatma Gandhi", "Baba Amte", "Mother Teresa"));

        arraylist.add(new QuizQuestion("Who invented the famous formula E=mc^2", "Albert Einstein", "Galilio", "Stephen Hawking", "Bill Gates", "Albert Einstein"));

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
