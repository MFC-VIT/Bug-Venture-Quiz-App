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
    private static final String DB_NAME = "Sit_questions1.db";
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
        //0
        arraylist.add(new QuizQuestionSit("Who is Larry Pressler ?"));


        //1
        arraylist.add(new QuizQuestionSit("Crime: Kill a person in a market who has bodyguards dressed as civilians with the help of a lethal injection. It must be recorded by the wife and the murder is to be done by the husband.\n" +
                "\n" +
                "Only 2 days are left and there is no lead from Detective Pradyuman.\n"));
        //2
        arraylist.add(new QuizQuestionSit("Pooja Verma receives a  package which contains her child's shoe and a photo of the her and the child. The kidnapper also gives the details of someone who has to be murdered in order to get the child back. No one is ready to help the mother so she turns to her friend from the army (you aka Binod Rajput).The mother asks you to commit the crime with her."));


        //3
        arraylist.add(new QuizQuestionSit("Right before the injection was to be injected, husband notices one of the bodyguards approaching the wife, because he was recording the victim.\n" +
                "\n" +
                "As Mahesh Verma, what will you choose?\n"));
        //4
        arraylist.add(new QuizQuestionSit("There is still no lead from the detective and the deadline has passed.\n" +
                "There is another parcel received from the angry kidnapper with blood soaked clothes of the child and a warning which says that the next task is due tomorrow and if it is not accomplished then the next parcel will have the child’s corpse.\n" +
                "The detective suggests that for this task, instead of committing the crime for real, you can talk to the target and convince him to help them by being a part of a play where he acts to be killed by the couple for the video. But the detective also warns that there might be eyes following you and there is a very high risk\n"));

        //5
        arraylist.add(new QuizQuestionSit("You talk to Pooja’s husband Mahesh and their neighbours who claim that they have no child and she is unable to bear one..The mother refutes the allegations."));
        //6
        arraylist.add(new QuizQuestionSit("You help Pooja plot the murder. You decide to make it look like an accident. Pooja rams her car into Ankita. However Ankita survives.\n"));




        //7
        arraylist.add(new QuizQuestionSit("When guards confront Mrs. Pooja Verma, she says that she was recording her husband and not the person and he is saved. They finally abort the mission and get home safely.\n" +
                "There is another parcel received from the angry kidnapper with blood soaked clothes of Ria and a warning which says that the next task is due tomorrow and if it is not accomplished then the next parcel will have Ria’s corpse in it.\n" +
                "\nDetective Pradyuman suggests that for this task, instead of committing the crime for real, you can talk to the target and convince him to help them by being a part of a play where he acts to be killed by the couple for the video. But the detective also warns that there might be eyes following you and there is a very high risk of being noticed by the kidnapper and he might kill Ria.\n" +
                "\n"));
        //8
        arraylist.add(new QuizQuestionSit("The bodyguards are distracted and the couple make a safe escape with the mission done.\n" +
                " Now the video tape is to be left in a trash can for the kidnapper. \n" + "Pradyuman stays near the trash can  and notices that the person who came to pick up the tapes did not have a left hand. He doubts that Mr. Verma being a hand surgeon might have a medical history with the kidnapper and asks him to show his entire patient records. But releasing the records can end his career and he can lose his medical license as well as face a sentence for releasing confidential patient records."));
        //9
        arraylist.add(new QuizQuestionSit("Parents talk to the victim for orchestrating his fake death, and the crime goes as planned. Victim fakes his death and Mrs.Verma successfully records the entire scene. They drop the recording in a trash can nearby as per the kidnapper’s instructions. Detective Pradyuman stays at the crime scene and notices that the person who came to pick up the tapes did not have a left hand. He doubts that Mr. Verma being a hand surgeon might have a medical history with the kidnapper and asks him to show his entire patient records. But releasing the records can end his career and he can lose his medical license as well as face a sentence for releasing confidential patient records."));
        //10
        arraylist.add(new QuizQuestionSit("Parents complete the crime as per the instructions of the kidnapper and leave the video tapes in the dustbin. This time detective stays at the crime scene to observe the man who comes to pick up the tapes. He notices that the man who comes to receive the tapes does not have a left hand. He asks the Mr. Verma to show his entire patient records as he doubts there is some medical history between him and the kidnapper as Mr. Verma is a specialised hand surgeon. But releasing the records can end his career and he can lose his medical license as well as face a sentence for releasing confidential patient records."));
        //11
        arraylist.add(new QuizQuestionSit("You decide to investigate further and go to the police station. The police mentions that Pooja has already been here 5-6 times in past 2 months and have already told her not to bother them with the fake complaints any more. The police also denies existence of the child. Desperate Pooja asks you to commit the crime once again."));
        //12
        arraylist.add(new QuizQuestionSit("Question"));
        //13
        arraylist.add(new QuizQuestionSit("Question"));
        //14
        arraylist.add(new QuizQuestionSit("Question"));

        //15
        arraylist.add(new QuizQuestionSit("Parents talk to the victim for orchestrating his fake death, and the crime goes as planned, victim fakes his death and Mrs.Verma successfully records the entire scene. They drop the recording in a trash can nearby as per the kidnapper’s instructions. The detective stays at the crime scene and notices the person who turns up to receive the tape does not have a hand. He asks the Mr. Verma to show his entire patient records as he doubts there is some medical history between him and the kidnapper. But releasing the records can end his career and he can lose his medical license as well as face a sentence for releasing confidential patient records. As Mr.Verma what will you choose?\n"));
        //16
        arraylist.add(new QuizQuestionSit("Parents complete the crime as per the instructions of the kidnapper and leave the video tapes in the dustbin. This time detective stays at the crime scene to observe the man who comes to pick up the tapes. He notices that the man who comes to receive the tapes does not have a hand. He asks the Mr. Verma to show his entire patient records as he doubts there is some medical history between him and the kidnapper. But releasing the records can end his career and he can lose his medical license as well as face a sentence for releasing confidential patient records. As Mr.Verma what will you choose?\n"));
        //17
        arraylist.add(new QuizQuestionSit("Upon receiving records from the father, Detective Pradyuman notices a similarity between kidnapper and Rhea’s maternal Grandfather (NanaJi). Mr. Pradyuman advices to arrange a fake funeral so that the kidnapper reacts to it somehow which might give the detective some leads. Meanwhile the kidnapper sends another parcel. "));
        //18
        arraylist.add(new QuizQuestionSit("Mr. Pradyuman advices to arrange the fake funeral so that the kidnapper reacts to it somehow. \n" +
                "Meanwhile the kidnapper sends another parcel.\n"));
        //19
        arraylist.add(new QuizQuestionSit("Upon receiving records from the father, Detective Pradyuman notices a similarity between kidnapper and Rhea’s maternal Grandfather (NanaJi). Mr. Pradyuman advices to arrange a fake funeral so that the kidnapper reacts to it somehow which might give the detective some leads. Meanwhile the kidnapper sends another parcel."));
        //20
        arraylist.add(new QuizQuestionSit("Mr. Pradyuman advices to arrange the fake funeral so that the kidnapper reacts to it somehow. \n Meanwhile the kidnapper sends another parcel."));
        //21
        arraylist.add(new QuizQuestionSit("Upon receiving records from the father, Detective Pradyuman notices a similarity between kidnapper and Rhea’s maternal Grandfather (NanaJi). Mr. Pradyuman advices to arrange a fake funeral so that the kidnapper reacts to it somehow which might give the detective some leads. Meanwhile the kidnapper sends another parcel."));
        //22
        arraylist.add(new QuizQuestionSit("Mr. Pradyuman advices to arrange the fake funeral so that the kidnapper reacts to it somehow. \n" +
                "Meanwhile the kidnapper sends another parcel.\n"));
        //23
        arraylist.add(new QuizQuestionSit("You go to the child’s school to investigate. You describe Rhea to the school principal and the principal claims there is no kid like that. Disappointed, you make your way out. On your way out, a school teacher who overheard your conversation tells you that there is another kid with the same description but her mother is not the one you claim."));
        //24
        arraylist.add(new QuizQuestionSit("Question"));
        //25
        arraylist.add(new QuizQuestionSit("Question"));
        //26
        arraylist.add(new QuizQuestionSit("Question"));
        //27
        arraylist.add(new QuizQuestionSit("Question"));
        //28
        arraylist.add(new QuizQuestionSit("Question"));
        //29
        arraylist.add(new QuizQuestionSit("Question"));
        //30
        arraylist.add(new QuizQuestionSit("Question"));//16
        //31
        arraylist.add(new QuizQuestionSit("Upon receiving records from the father, Detective Pradyuman notices a similarity between kidnapper and Ria’s grandfather in law. Mr. Pradyuman advices to arrange a fake funeral so that the kidnapper reacts to it somehow. Meanwhile the kidnapper sends another parcel. As Mr.Verma what will you choose?\n"));
        //32
        arraylist.add(new QuizQuestionSit("Mr. Pradyuman advices to arrange the fake funeral so that the kidnapper reacts to it somehow. \n" + "Meanwhile the kidnapper sends another parcel. As Mr.Verma what will you choose?\n"));
        //33
        arraylist.add(new QuizQuestionSit("Question"));
        //34
        arraylist.add(new QuizQuestionSit("Mr. Pradyuman advices to arrange the fake funeral so that the kidnapper reacts to it somehow. \n" + "Meanwhile the kidnapper sends another parcel. As Mr.Verma what will you choose?\n"));
        //35
        arraylist.add(new QuizQuestionSit("Parcel contains Two envelopes with following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n" +
                "There is a note which says that you can only choose to open anyone of the envelopes. If the instructions are not followed carefully then one of your family member will have to face the consequences consequences.\n"));
        //36
        arraylist.add(new QuizQuestionSit("Question"));
        //37
        arraylist.add(new QuizQuestionSit("Question"));
        //38
        arraylist.add(new QuizQuestionSit("Question"));
        //39
        arraylist.add(new QuizQuestionSit("Parcel contains Two envelopes with following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n" +
                "There is a note which says that you can only choose to open anyone of the envelopes. If the instructions are not followed carefully then one of your family member will have to face the consequences.\n"));
        //40
        arraylist.add(new QuizQuestionSit("Once the funeral is over, Another parcel is found at the doorstep of their house but this time there's a bomb attached to it connected with a sensor, which can only be defused if the person opens any one of the envelopes inside the parcel within 30 secs and if they tried to open both or none then the bomb will detonate.\n" +
                "The two envelopes have the following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n"));
        //41
        arraylist.add(new QuizQuestionSit("Parcel contains Two envelopes with following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n" +
                "There is a note which says that you can only choose to open anyone of the envelopes. If the instructions are not followed carefully then one of your family member will have to face the consequences.\n"));
        //42
        arraylist.add(new QuizQuestionSit("Once the funeral is over, Another parcel is found at the doorstep of their house but this time there's a bomb attached to it connected with a sensor, which can only be defused if the person opens any one of the envelopes inside the parcel within 30 secs and if they tried to open both or none then the bomb will detonate.\n" +
                "The two envelopes have the following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n"));
        //43
        arraylist.add(new QuizQuestionSit("Parcel contains Two envelopes with following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n" +
                "There is a note which says that you can only choose to open anyone of the envelopes. If the instructions are not followed carefully then one of your family member will have to face the consequences consequences.\n"));
        //44
        arraylist.add(new QuizQuestionSit("Once the funeral is over, Another parcel is found at the doorstep of their house but this time there's a bomb attached to it connected with a sensor, which can only be defused if the person opens any one of the envelopes inside the parcel within 30 secs and if they tried to open both or none then the bomb will detonate.\n" +
                "The two envelopes have the following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n"));
        //45
        arraylist.add(new QuizQuestionSit("Parcel contains Two envelopes with following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n" +
                "There is a note which says that you can only choose to open anyone of the envelopes. If the instructions are not followed carefully then one of your family member will have to face the consequences consequences.\n"));
        //46
        arraylist.add(new QuizQuestionSit("Once the funeral is over, Another parcel is found at the doorstep of their house but this time there's a bomb attached to it connected with a sensor, which can only be defused if the person opens any one of the envelopes inside the parcel within 30 secs and if they tried to open both or none then the bomb will detonate.\n" +
                "The two envelopes have the following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n"));
        //47
        arraylist.add(new QuizQuestionSit("Question"));
        //48
        arraylist.add(new QuizQuestionSit("You meet the kid after school and she introduces herself as Rhea Gupta. You show the photo you got in the parcel to the kid and the kid suddenly gets very scared and starts crying."));
        //49
        arraylist.add(new QuizQuestionSit("Question"));
        //50
        arraylist.add(new QuizQuestionSit("Question"));
        //51
        arraylist.add(new QuizQuestionSit("Question"));
        //52
        arraylist.add(new QuizQuestionSit("Question"));
        //53
        arraylist.add(new QuizQuestionSit("Question"));
        //54
        arraylist.add(new QuizQuestionSit("Question"));
        //55
        arraylist.add(new QuizQuestionSit("Question"));
        //56
        arraylist.add(new QuizQuestionSit("Question"));
        //57
        arraylist.add(new QuizQuestionSit("Question"));
        //58
        arraylist.add(new QuizQuestionSit("Question"));
        //59
        arraylist.add(new QuizQuestionSit("Question"));
        //60
        arraylist.add(new QuizQuestionSit("Question"));
        //61
        arraylist.add(new QuizQuestionSit("Question"));
        //62
        arraylist.add(new QuizQuestionSit("Question"));//32
        //63
        arraylist.add(new QuizQuestionSit("Commit the final crime!\n" +
                "\n" +
                "You can either save the father or the kid.As a Mrs. Verma what will you choose?\n"));
        //64
        arraylist.add(new QuizQuestionSit("As Mr. Pradyuman had doubts on Ria’s maternal grandfather being the kidnapper so he follows him thinking that by the news of fake funeral he will commit any suspicious move. But while following Ria’s grandfather notices that someone is following him and kills the detective. He gets very frustrated and gives Ria’s mother one final choice - Save Mr.Verma and Ria will be killed or Save Ria and father will have to die.\n" +
                "\n" +
                "As Mrs. Verma what will you choose?\n"));
        //65
        arraylist.add(new QuizQuestionSit("Commit the final crime!\n" +
                "\n" +
                "You can either save the father or the kid.As a Mrs. Verma what will you choose?\n"));
        //66
        arraylist.add(new QuizQuestionSit("As Mr. Pradyuman had doubts on Ria’s maternal grandfather being the kidnapper so he follows him thinking that by the news of fake funeral he will commit any suspicious move. But while following Ria’s grandfather notices that someone is following him and kills the detective. He gets very frustrated and gives Ria’s mother one final choice - Save Mr.Verma and Ria will be killed or Save Ria and father will have to die.\n" +
                "\n" +
                "As Mrs. Verma what will you choose?\n"));

        //67
        arraylist.add(new QuizQuestionSit("Question"));
        //68
        arraylist.add(new QuizQuestionSit("Question"));
        //69
        arraylist.add(new QuizQuestionSit("Question"));
        //70
        arraylist.add(new QuizQuestionSit("Question"));
        //71
        arraylist.add(new QuizQuestionSit("Question"));
        //72
        arraylist.add(new QuizQuestionSit("Question"));
        //73
        arraylist.add(new QuizQuestionSit("Question"));
        //74
        arraylist.add(new QuizQuestionSit("Question"));
        //75
        arraylist.add(new QuizQuestionSit("Question"));
        //76
        arraylist.add(new QuizQuestionSit("Question"));
        //77
        arraylist.add(new QuizQuestionSit("Question"));
        //78
        arraylist.add(new QuizQuestionSit("Question"));
        //79
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other. "));
        //80
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
        //81
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other. "));
        //82
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
        //83
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other. "));
        //84
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
        //85
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other. "));
        //86
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
        //87
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other."));
        //88
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
        //89
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other."));
        //90
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
        //91
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other."));
        //92
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
        //93
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other."));
        //94
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
        //95
        arraylist.add(new QuizQuestionSit("Question"));
        //96
        arraylist.add(new QuizQuestionSit("Question"));
        //97
        arraylist.add(new QuizQuestionSit("Question"));
        //98
        arraylist.add(new QuizQuestionSit("Question"));
        //99
        arraylist.add(new QuizQuestionSit("Question"));
        //100
        arraylist.add(new QuizQuestionSit("Question"));
        //101
        arraylist.add(new QuizQuestionSit("Question"));
        //102
        arraylist.add(new QuizQuestionSit("Question"));
        //103
        arraylist.add(new QuizQuestionSit("Question"));
        //104
        arraylist.add(new QuizQuestionSit("Question"));
        //105
        arraylist.add(new QuizQuestionSit("Question"));
        //106
        arraylist.add(new QuizQuestionSit("Question"));
        //107
        arraylist.add(new QuizQuestionSit("Question"));
        //108
        arraylist.add(new QuizQuestionSit("Question"));
        //109
        arraylist.add(new QuizQuestionSit("Question"));
        //110
        arraylist.add(new QuizQuestionSit("Question"));
        //111
        arraylist.add(new QuizQuestionSit("Question"));
        //112
        arraylist.add(new QuizQuestionSit("Question"));
        //113
        arraylist.add(new QuizQuestionSit("Question"));
        //114
        arraylist.add(new QuizQuestionSit("Question"));
        //115
        arraylist.add(new QuizQuestionSit("Question"));
        //116
        arraylist.add(new QuizQuestionSit("Question"));
        //117
        arraylist.add(new QuizQuestionSit("Question"));
        //118
        arraylist.add(new QuizQuestionSit("Question"));
        //119
        arraylist.add(new QuizQuestionSit("Question"));
        //120
        arraylist.add(new QuizQuestionSit("Question"));
        //121
        arraylist.add(new QuizQuestionSit("Question"));
        //122
        arraylist.add(new QuizQuestionSit("Question"));
        //123
        arraylist.add(new QuizQuestionSit("Question"));
        //124
        arraylist.add(new QuizQuestionSit("Question"));
        //125
        arraylist.add(new QuizQuestionSit("Question"));
        //126
        arraylist.add(new QuizQuestionSit("Question"));
        //127
        arraylist.add(new QuizQuestionSit("GAME OVER \n" + "You could not save everyone!!"));
        //128
        arraylist.add(new QuizQuestionSit("GAME OVER \n" + "You could not save everyone!!"));
        //129
        arraylist.add(new QuizQuestionSit("GAME OVER \n" + "You could not save everyone!!"));
        //130
        arraylist.add(new QuizQuestionSit("GAME OVER \n" + "You could not save everyone!!"));
        //131
        arraylist.add(new QuizQuestionSit("GAME OVER \n" + "You could not save everyone!!"));
        //132
        arraylist.add(new QuizQuestionSit("GAME OVER \n" + "You could not save everyone!!"));
        //133
        arraylist.add(new QuizQuestionSit("GAME OVER \n" + "You could not save everyone!!"));
        //134
        arraylist.add(new QuizQuestionSit("GAME OVER \n" + "You could not save everyone!!"));
        //135
        arraylist.add(new QuizQuestionSit("Question"));
        //136
        arraylist.add(new QuizQuestionSit("Question"));
        //137
        arraylist.add(new QuizQuestionSit("Question"));
        //138
        arraylist.add(new QuizQuestionSit("Question"));
        //139
        arraylist.add(new QuizQuestionSit("Question"));
        //140
        arraylist.add(new QuizQuestionSit("Question"));
        //141
        arraylist.add(new QuizQuestionSit("Question"));
        //142
        arraylist.add(new QuizQuestionSit("Question"));
//143
        arraylist.add(new QuizQuestionSit("Question"));
//144
        arraylist.add(new QuizQuestionSit("Question"));
//145
        arraylist.add(new QuizQuestionSit("Question"));
//146
        arraylist.add(new QuizQuestionSit("Question"));
//147
        arraylist.add(new QuizQuestionSit("Question"));
//148
        arraylist.add(new QuizQuestionSit("Question"));
//149
        arraylist.add(new QuizQuestionSit("Question"));
//150
        arraylist.add(new QuizQuestionSit("Question"));
//151
        arraylist.add(new QuizQuestionSit("Question"));
//152
        arraylist.add(new QuizQuestionSit("Question"));
//153
        arraylist.add(new QuizQuestionSit("Question"));
//154
        arraylist.add(new QuizQuestionSit("Question"));
//155
        arraylist.add(new QuizQuestionSit("Question"));
//156
        arraylist.add(new QuizQuestionSit("Question"));
//157
        arraylist.add(new QuizQuestionSit("Question"));
//158
        arraylist.add(new QuizQuestionSit("Question"));
//159
        arraylist.add(new QuizQuestionSit("Question"));
//160
        arraylist.add(new QuizQuestionSit("Question"));
//161
        arraylist.add(new QuizQuestionSit("Question"));
//162
        arraylist.add(new QuizQuestionSit("Question"));
//163
        arraylist.add(new QuizQuestionSit("Question"));
//164
        arraylist.add(new QuizQuestionSit("Question"));
//165
        arraylist.add(new QuizQuestionSit("Question"));
//166
        arraylist.add(new QuizQuestionSit("Question"));
//167
        arraylist.add(new QuizQuestionSit("Question"));
//168
        arraylist.add(new QuizQuestionSit("Question"));
        //169
        arraylist.add(new QuizQuestionSit("Question"));
        //170
        arraylist.add(new QuizQuestionSit("Question"));
        //171
        arraylist.add(new QuizQuestionSit("Question"));
        //172
        arraylist.add(new QuizQuestionSit("Question"));
        //173
        arraylist.add(new QuizQuestionSit("Question"));
        //174
        arraylist.add(new QuizQuestionSit("Question"));
        //175
        arraylist.add(new QuizQuestionSit("Question"));
        //176
        arraylist.add(new QuizQuestionSit("Question"));
        //177
        arraylist.add(new QuizQuestionSit("Question"));
        //178
        arraylist.add(new QuizQuestionSit("Question"));
        //179
        arraylist.add(new QuizQuestionSit("Question"));
        //180
        arraylist.add(new QuizQuestionSit("Question"));
        //181
        arraylist.add(new QuizQuestionSit("Question"));
//182
        arraylist.add(new QuizQuestionSit("Question"));
//183
        arraylist.add(new QuizQuestionSit("Question"));
//184
        arraylist.add(new QuizQuestionSit("Question"));
//185
        arraylist.add(new QuizQuestionSit("Question"));
//186
        arraylist.add(new QuizQuestionSit("Question"));
//187
        arraylist.add(new QuizQuestionSit("Question"));
//188
        arraylist.add(new QuizQuestionSit("Question"));
//189
        arraylist.add(new QuizQuestionSit("Question"));
//190
        arraylist.add(new QuizQuestionSit("Question"));
//191
        arraylist.add(new QuizQuestionSit("Question"));
//192
        arraylist.add(new QuizQuestionSit("Question"));
//193
        arraylist.add(new QuizQuestionSit("Question"));
//194
        arraylist.add(new QuizQuestionSit("Question"));
//195
        arraylist.add(new QuizQuestionSit("Question"));
//196
        arraylist.add(new QuizQuestionSit("Question"));
//197
        arraylist.add(new QuizQuestionSit("Question"));
//198
        arraylist.add(new QuizQuestionSit("Question"));
//199
        arraylist.add(new QuizQuestionSit("Question"));
//200
        arraylist.add(new QuizQuestionSit("Question"));
//201
        arraylist.add(new QuizQuestionSit("Question"));
//202
        arraylist.add(new QuizQuestionSit("Question"));
//203
        arraylist.add(new QuizQuestionSit("Question"));
//204
        arraylist.add(new QuizQuestionSit("Question"));
//205
        arraylist.add(new QuizQuestionSit("Question"));
    //206
        arraylist.add(new QuizQuestionSit("Question"));
        //207
        arraylist.add(new QuizQuestionSit("Question"));
      //208
        arraylist.add(new QuizQuestionSit("Question"));
      //209
        arraylist.add(new QuizQuestionSit("Question"));
      //210
        arraylist.add(new QuizQuestionSit("Question"));
      //211
        arraylist.add(new QuizQuestionSit("Question"));
      //212
        arraylist.add(new QuizQuestionSit("Question"));
        //213
        arraylist.add(new QuizQuestionSit("Question"));
//214
        arraylist.add(new QuizQuestionSit("Question"));
//215
        arraylist.add(new QuizQuestionSit("Question"));
//216
        arraylist.add(new QuizQuestionSit("Question"));
//217
        arraylist.add(new QuizQuestionSit("Question"));
//218
        arraylist.add(new QuizQuestionSit("Question"));
//219
        arraylist.add(new QuizQuestionSit("Question"));
//220
        arraylist.add(new QuizQuestionSit("Question"));
//221
        arraylist.add(new QuizQuestionSit("Question"));
//222
        arraylist.add(new QuizQuestionSit("Question"));
//223
        arraylist.add(new QuizQuestionSit("Question"));
//224
        arraylist.add(new QuizQuestionSit("Question"));
//225
        arraylist.add(new QuizQuestionSit("Question"));
//226
        arraylist.add(new QuizQuestionSit("Question"));
//227
        arraylist.add(new QuizQuestionSit("Question"));
//228
        arraylist.add(new QuizQuestionSit("Question"));
//229
        arraylist.add(new QuizQuestionSit("Question"));
//230
        arraylist.add(new QuizQuestionSit("Question"));
//231
        arraylist.add(new QuizQuestionSit("Question"));
//232
        arraylist.add(new QuizQuestionSit("Question"));
//233
        arraylist.add(new QuizQuestionSit("Question"));
//234
        arraylist.add(new QuizQuestionSit("Question"));
//235
        arraylist.add(new QuizQuestionSit("Question"));
//236
        arraylist.add(new QuizQuestionSit("Question"));
//237
        arraylist.add(new QuizQuestionSit("Question"));
//238
        arraylist.add(new QuizQuestionSit("Question"));
//239
        arraylist.add(new QuizQuestionSit("Question"));
     //240
        arraylist.add(new QuizQuestionSit("Question"));
        //241
        arraylist.add(new QuizQuestionSit("Question"));
        //242
        arraylist.add(new QuizQuestionSit("Question"));
        //243
        arraylist.add(new QuizQuestionSit("Question"));
        //244
        arraylist.add(new QuizQuestionSit("Question"));
        //245
        arraylist.add(new QuizQuestionSit("Question"));
        //246
        arraylist.add(new QuizQuestionSit("Question"));
        //247
        arraylist.add(new QuizQuestionSit("Question"));
        //248
        arraylist.add(new QuizQuestionSit("Question"));
        //249
        arraylist.add(new QuizQuestionSit("Question"));
        //250
        arraylist.add(new QuizQuestionSit("Question"));
        //251
        arraylist.add(new QuizQuestionSit("Question"));
        //252
        arraylist.add(new QuizQuestionSit("Question"));
        //253
        arraylist.add(new QuizQuestionSit("Question"));
        //254
        arraylist.add(new QuizQuestionSit("Question"));
        //255
        arraylist.add(new QuizQuestionSit("Question"));
        //256
        arraylist.add(new QuizQuestionSit("Question"));

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
