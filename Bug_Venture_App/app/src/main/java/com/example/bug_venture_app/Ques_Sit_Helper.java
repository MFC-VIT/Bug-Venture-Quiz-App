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
        arraylist.add(new QuizQuestionSit("One day Pooja receives a  package which contains a shoe of Rhea, a photo of the her with Rhea and an envelope which says a to kill a woman in order to get Rhea back. She turns to her friend from the army Binod Rajput and calls him to get to her for an extreme situation of life and death. When Binod arrives at her place he asks Pooja what he can help her with while pooja emphasis to commit the murder with her."));


        //3
        arraylist.add(new QuizQuestionSit("Right before the injection was to be injected, husband notices one of the bodyguards approaching the wife, because he was recording the victim.\n" +
                "\n" +
                "As Mahesh Verma, what will you choose?\n"));
        //4
        arraylist.add(new QuizQuestionSit("There is still no lead from the detective and the deadline has passed.\n" +
                "There is another parcel received from the angry kidnapper with blood soaked clothes of the child and a warning which says that the next task is due tomorrow and if it is not accomplished then the next parcel will have the child’s corpse.\n" +
                "The detective suggests that for this task, instead of committing the crime for real, you can talk to the target and convince him to help them by being a part of a play where he acts to be killed by the couple for the video. But the detective also warns that there might be eyes following you and there is a very high risk\n"));

        //5
        arraylist.add(new QuizQuestionSit("Binod decides to talk to Pooja’s husband Mahesh, their relatives and their neighbours. Upon talking he gets to know from Mahesh that Pooja and he do not have any child and she has a mental problem. After talking to rest people, he gets the same response, to which pooja says that her husband paid off other people so that he could get a divorce from her."));
        //6
        arraylist.add(new QuizQuestionSit("Binod sees Pooja’s miserable condition when he visits her. Pooja is in a lot of grief without her daughter. Pooja tells Binod that nobody including her family, husband or police is helping her to get her daughter back. She tells Binod that she always had his back in the days of college and now she desperately wants him to have her’s. On the envelope received in the parcel is written a name of a woman named Ankita Gupta and her address. According to years of experience of Binod in serving army, Binod thinks of 2 ways of committing the crime. Either he can use a gun or a lethal injection which he asks pooja to arrange from Mahesh’s hospital."));

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
        arraylist.add(new QuizQuestionSit("Binod decides to investigate further and go to the police station. The police mentions that Pooja has already been here 5-6 times in past 2 months and have already told her not to bother them with the fake complaints any more. The police also denies existence of the child. Desperate Pooja claims that Mahesh paid the police also asks Binod to commit the crime once again. "));
        //12
        arraylist.add(new QuizQuestionSit("Mahesh tells Binod that his wife  Pooja is suffering from Schizophrenia in which she imagines her hypothetical daughter Rhea. He also tells Binod that this was not the first time she was imagining her hypothetical daughter. She is being diagnosed for this from past 1.5 years and had several such attacks. Binod gets the same answers while talking to their family, friends and neighbours. Pooja upon confrontation again claims that Mahesh has paid off everyone so that he can get an easy divorce. But... the next day another parcel comes to Pooja in which there is a blood soaked t-shirt of a girl, which she claims to be of Rhea and a warning note which says if you fail to kill the woman in 3 days then she might not see her daughter again. She again insists Binod to help save her daughter."));
        //13
        arraylist.add(new QuizQuestionSit("When Binod asks Pooja to arrange a lethal injection from Mahesh’s Hospital, Pooja tells him that there will be a risk in arranging a lethal injection as she could be caught in the camera while stealing it, or his husband’s name might come in the hospital’s records. And such injections are not available at local chemists, so she leaves Binod no choice but to use a gun. Now after deciding to choose gun as the murder weapon Binod thinks that he might need a companion in comminting the crime. He thinks that he can take Pooja’s help but that can put Pooja in danger as she is already disturbed and is not experienced in this type of works and can jeopardise the whole mission but Pooja keeps on insisting to help Binod in the crime."));
        //14
        arraylist.add(new QuizQuestionSit("Now after deciding to choose gun as the murder weapon Binod thinks that he might need a companion in committing the crime. He thinks that he can take Pooja’s help but that can put Pooja in danger as she is already disturbed and is not experienced in this type of works and can jeopardise the whole mission but Pooja keeps on insisting to help Binod in the crime."));

        //15
        arraylist.add(new QuizQuestionSit("Parents talk to the victim for orchestrating his fake death, and the crime goes as planned, victim fakes his death and Mrs.Verma successfully records the entire scene. They drop the recording in a trash can nearby as per the kidnapper’s instructions. The detective stays at the crime scene and notices the person who turns up to receive the tape does not have a hand. He asks the Mr. Verma to show his entire patient records as he doubts there is some medical history between him and the kidnapper. But releasing the records can end his career and he can lose his medical license as well as face a sentence for releasing confidential patient records. As Mr.Verma what will you choose?\n"));
        //16
        arraylist.add(new QuizQuestionSit("Parents complete the crime as per the instructions of the kidnapper and leave the video tapes in the dustbin. This time detective stays at the crime scene to observe the man who comes to pick up the tapes. He notices that the man who comes to receive the tapes does not have a hand. He asks the Mr. Verma to show his entire patient records as he doubts there is some medical history between him and the kidnapper. But releasing the records can end his career and he can lose his medical license as well as face a sentence for releasing confidential patient records.\n"));
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
        arraylist.add(new QuizQuestionSit("Binod decides to go to the Rhea’s school to investigate and gain more knowledge about her. After talking to the school principal and the principal claims there is no kid named Rhea Verma, and Binod decides to show Rhea’s pic to principal but she gives him the same response. Disappointed, Binod makes his way out. On his way out, a school teacher who overheard his conversation tells him that the kid in the pic isn’t Rhea verma but she is Rhea Gupta who is actually present in her class today, which leaves Binod in a confusion."));
        //24
        arraylist.add(new QuizQuestionSit("Seeing that the police is of no great help, Binod help Pooja plot the murder. Binod decide to procure a gun to kill the person mentioned in the parcel. Guns are traceable through bullets and unregistered weapons can lead one to prison."));
        //25
        arraylist.add(new QuizQuestionSit("Binod decides to go to the Rhea’s school to investigate and gain more knowledge about her. After talking to the school principal and the principal claims there is no kid named Rhea Verma, and Binod decides to show Rhea’s pic to principal but she gives him the same response. Disappointed, Binod makes his way out. On his way out, a school teacher who overheard his conversation tells him that the kid in the pic isn’t Rhea verma but she is Rhea Gupta who is actually present in her class today, which leaves Binod in a confusion."));
        //26
        arraylist.add(new QuizQuestionSit("Question"));
        //27
        arraylist.add(new QuizQuestionSit("Binod decide to procure a gun to kill the person mentioned in the parcel. Guns are traceable through bullets and unregistered weapons can lead one to prison."));
        //28
        arraylist.add(new QuizQuestionSit("When Binod decides to take Pooja with her to complete the mission, the very next day Pooja gets another parcel which says that Binod has to go to crime scene alone, if Pooja’s identity gets exposed at the crime scene she might not be able to see Rhea again. Therefore Pooja denies to go on mission and requests Binod to go alone. After deciding to go to mission alone, Binod decides to procure a gun to kill the person mentioned in the parcel. Guns are traceable through bullets and unregistered weapons can lead one to prison."));
        //29
        arraylist.add(new QuizQuestionSit("Binod decide to procure a gun to kill the person mentioned in the parcel. Guns are traceable through bullets and unregistered weapons can lead one to prison."));
        //30
        arraylist.add(new QuizQuestionSit("When Binod decides to take Pooja with her to complete the mission, the very next day Pooja gets another parcel which says that Binod has to go to crime scene alone, if Pooja’s identity gets exposed at the crime scene she might not be able to see Rhea again. Therefore Pooja denies to go on mission and requests Binod to go alone. After deciding to go to mission alone, Binod decides to procure a gun to kill the person mentioned in the parcel. Guns are traceable through bullets and unregistered weapons can lead one to prison."));
        //31
        arraylist.add(new QuizQuestionSit("Upon receiving records from the father, Detective Pradyuman notices a similarity between kidnapper and Ria’s grandfather in law. Mr. Pradyuman advices to arrange a fake funeral so that the kidnapper reacts to it somehow. Meanwhile the kidnapper sends another parcel.\n"));
        //32
        arraylist.add(new QuizQuestionSit("Mr. Pradyuman advices to arrange the fake funeral so that the kidnapper reacts to it somehow. \n" + "Meanwhile the kidnapper sends another parcel.\n"));
        //33
        arraylist.add(new QuizQuestionSit("Upon receiving records from the father, Detective Pradyuman notices a similarity between kidnapper and Rhea’s maternal Grandfather (NanaJi). Mr. Pradyuman advices to arrange a fake funeral so that the kidnapper reacts to it somehow which might give the detective some leads. Meanwhile the kidnapper sends another parcel."));
        //34
        arraylist.add(new QuizQuestionSit("Mr. Pradyuman advices to arrange the fake funeral so that the kidnapper reacts to it somehow. \n" + "Meanwhile the kidnapper sends another parcel.\n"));
        //35
        arraylist.add(new QuizQuestionSit("Parcel contains Two envelopes with following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n" +
                "There is a note which says that you can only choose to open anyone of the envelopes. If the instructions are not followed carefully then one of your family member will have to face the consequences consequences.\n"));
        //36
        arraylist.add(new QuizQuestionSit("Once the funeral is over, Another parcel is found at the doorstep of their house but this time there's a bomb attached to it connected with a sensor, which can only be defused if the person opens any one of the envelopes inside the parcel within 30 secs and if they tried to open both or none then the bomb will detonate.\n" +
                "The two envelopes have the following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n"));
        //37
        arraylist.add(new QuizQuestionSit("Parcel contains Two envelopes with following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n" +
                "There is a note which says that you can only choose to open anyone of the envelopes. If the instructions are not followed carefully then one of your family member will have to face the consequences consequences.\n"));
        //38
        arraylist.add(new QuizQuestionSit("Once the funeral is over, Another parcel is found at the doorstep of their house but this time there's a bomb attached to it connected with a sensor, which can only be defused if the person opens any one of the envelopes inside the parcel within 30 secs and if they tried to open both or none then the bomb will detonate.\n" +
                "The two envelopes have the following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n"));
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
        arraylist.add(new QuizQuestionSit("After requesting for Rhea’s record for a serious investigation and showing them his id, the school records of the child mentions a different woman as the kid’s mother not Pooja. The mother’s actual name is Ankita Gupta and Binod recall her as the same woman whose name was on the envelope which came to pooja to murder. Binod call her and ask her if she knows Pooja. She reveals that Pooja Verma was her good friend but an year back when Ankita left Rhea with Pooja to babysit her, she locked Rhea with herself in a room for 1 day and didn’t open up. Mahesh managed to break the door and barge in the house so she didn’t have to file a police complaint. After that incident she cut all the ties with Pooja."));
        //48
        arraylist.add(new QuizQuestionSit("Binod meet the kid after school and she introduces herself as Rhea Gupta. Binod show the photo Binod got in the parcel to the kid and the kid suddenly gets very scared and starts crying. "));
        //49
        arraylist.add(new QuizQuestionSit("Binod reaches Target’s place, and abduct her while she was entering her building. Binod takes her to the terrace and shoot her. And leave the body back at the terrace. While leaving the building Binod notices a girl and a man entering target’s house. Looking closely at the girl’s face recognises her as Rhea. After doing a research on the girl and the man, Binod finds out that The girl is Rhea Gupta not Rhea Verma who was with her father at the time of shooting and the target was none other than her mother Ankita Gupta."));
        //50
        arraylist.add(new QuizQuestionSit("Binod reaches Target’s place, and abduct her while she was entering her building. Binod takes her to the terrace and shoot her. And leave the body back at the terrace. While leaving the building Binod notices a girl and a man entering target’s house. Looking closely at the girl’s face recognises her as Rhea. After doing a research on the girl and the man, Binod finds out that The girl is Rhea Gupta not Rhea Verma who was with her father at the time of shooting and the target was none other than her mother Ankita Gupta."));
        //51
        arraylist.add(new QuizQuestionSit("After requesting for Rhea’s record for a serious investigation and showing them his id, the school records of the child mentions a different woman as the kid’s mother not Pooja. The mother’s actual name is Ankita Gupta and Binod recall her as the same woman whose name was on the envelope which came to pooja to murder. Binod call her and ask her if she knows Pooja. She reveals that Pooja Verma was her good friend but an year back when Ankita left Rhea with Pooja to babysit her, she locked Rhea with herself in a room for 1 day and didn’t open up. Mahesh managed to break the door and barge in the house so she didn’t have to file a police complaint. After that incident she cut all the ties with Pooja. "));
        //52
        arraylist.add(new QuizQuestionSit("Binod meet the kid after school and she introduces herself as Rhea Gupta. Binod show the photo Binod got in the parcel to the kid and the kid suddenly gets very scared and starts crying."));
        //53
        arraylist.add(new QuizQuestionSit("Question"));
        //54
        arraylist.add(new QuizQuestionSit("Question"));
        //55
        arraylist.add(new QuizQuestionSit("Binod reaches Target’s place, and abduct her while she was entering her building. Binod takes her to the terrace and shoot her. And leave the body back at the terrace. While leaving the building Binod notices a girl and a man entering target’s house. Looking closely at the girl’s face recognises her as Rhea. After doing a research on the girl and the man, Binod finds out that The girl is Rhea Gupta not Rhea Verma who was with her father at the time of shooting and the target was none other than her mother Ankita Gupta."));
        //56
        arraylist.add(new QuizQuestionSit("Binod reaches Target’s place, and abduct her while she was entering her building. Binod takes her to the terrace and shoot her. And leave the body back at the terrace. While leaving the building Binod notices a girl and a man entering target’s house. Looking closely at the girl’s face recognises her as Rhea. After doing a research on the girl and the man, Binod finds out that The girl is Rhea Gupta not Rhea Verma who was with her father at the time of shooting and the target was none other than her mother Ankita Gupta."));
        //57
        arraylist.add(new QuizQuestionSit("Binod reaches Target’s place, and abduct her while she was entering her building. Binod takes her to the terrace and shoot her. And leave the body back at the terrace. While leaving the building Binod notices a girl and a man entering target’s house. Looking closely at the girl’s face recognises her as Rhea. After doing a research on the girl and the man, Binod finds out that The girl is Rhea Gupta not Rhea Verma who was with her father at the time of shooting and the target was none other than her mother Ankita Gupta."));
        //58
        arraylist.add(new QuizQuestionSit("Binod reaches Target’s place, and abduct her while she was entering her building. Binod takes her to the terrace and shoot her. And leave the body back at the terrace. While leaving the building Binod notices a girl and a man entering target’s house. Looking closely at the girl’s face recognises her as Rhea. After doing a research on the girl and the man, Binod finds out that The girl is Rhea Gupta not Rhea Verma who was with her father at the time of shooting and the target was none other than her mother Ankita Gupta."));
        //59
        arraylist.add(new QuizQuestionSit("Binod reaches Target’s place, and abduct her while she was entering her building. Binod takes her to the terrace and shoot her. And leave the body back at the terrace. While leaving the building Binod notices a girl and a man entering target’s house. Looking closely at the girl’s face recognises her as Rhea. After doing a research on the girl and the man, Binod finds out that The girl is Rhea Gupta not Rhea Verma who was with her father at the time of shooting and the target was none other than her mother Ankita Gupta."));
        //60
        arraylist.add(new QuizQuestionSit("Binod reaches Target’s place, and abduct her while she was entering her building. Binod takes her to the terrace and shoot her. And leave the body back at the terrace. While leaving the building Binod notices a girl and a man entering target’s house. Looking closely at the girl’s face recognises her as Rhea. After doing a research on the girl and the man, Binod finds out that The girl is Rhea Gupta not Rhea Verma who was with her father at the time of shooting and the target was none other than her mother Ankita Gupta."));
        //61
        arraylist.add(new QuizQuestionSit("Binod reaches Target’s place, and abduct her while she was entering her building. Binod takes her to the terrace and shoot her. And leave the body back at the terrace. While leaving the building Binod notices a girl and a man entering target’s house. Looking closely at the girl’s face recognises her as Rhea. After doing a research on the girl and the man, Binod finds out that The girl is Rhea Gupta not Rhea Verma who was with her father at the time of shooting and the target was none other than her mother Ankita Gupta."));
        //62
        arraylist.add(new QuizQuestionSit("Binod reaches Target’s place, and abduct her while she was entering her building. Binod takes her to the terrace and shoot her. And leave the body back at the terrace. While leaving the building Binod notices a girl and a man entering target’s house. Looking closely at the girl’s face recognises her as Rhea. After doing a research on the girl and the man, Binod finds out that The girl is Rhea Gupta not Rhea Verma who was with her father at the time of shooting and the target was none other than her mother Ankita Gupta."));//32
        //63
        arraylist.add(new QuizQuestionSit("Commit the final crime!\n" +
                "\n" +
                "You can either save the father or the kid.\n"));
        //64
        arraylist.add(new QuizQuestionSit("As Mr. Pradyuman had doubts on Rhea’s maternal grandfather (NanaJi) being the kidnapper so he follows him thinking that by the news of fake funeral he will commit any suspicious move. But while following the detective notices that Rhea’s NanaJi meets a stranger and gives him a bunch of keys.\n"));
        //65
        arraylist.add(new QuizQuestionSit("Commit the final crime!\n" +
                "\n" +
                "You can either save the father or the kid.\n"));
        //66
        arraylist.add(new QuizQuestionSit("Once the funeral is over, Another parcel is found at the doorstep of their house but this time there's a bomb attached to it connected with a sensor, which can only be defused if the person opens any one of the envelopes inside the parcel within 30 secs and if they tried to open both or none then the bomb will detonate.\n" +
                "The two envelopes have the following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n"));

        //67
        arraylist.add(new QuizQuestionSit("Commit the final crime!\n" +
                "\n" +
                "You can either save the father or the kid.\n"));
        //68
        arraylist.add(new QuizQuestionSit("Once the funeral is over, Another parcel is found at the doorstep of their house but this time there's a bomb attached to it connected with a sensor, which can only be defused if the person opens any one of the envelopes inside the parcel within 30 secs and if they tried to open both or none then the bomb will detonate.\n" +
                "The two envelopes have the following notes on them: \n" +
                "1. Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "2. Do not commit any crime, but if you choose to do so there will be hard consequences.\n"));
        //69
        arraylist.add(new QuizQuestionSit("Commit the final crime!\n" +
                "\n" +
                "You can either save the father or the kid.\n"));
        //70
        arraylist.add(new QuizQuestionSit("Once the funeral is over, Another parcel is found at the doorstep of their house but this time there's a bomb attached to it connected with a sensor, which can only be defused if the person opens any one of the envelopes inside the parcel within 30 secs and if they tried to open both or none then the bomb will detonate.\n" +
                "The two envelopes have the following notes on them\n" +
                "Commit the final crime but if you choose to do so you cannot back out at any cost\n" +
                "Do not commit any crime, but if you choose to do so there will be hard consequences.\n"));
        //71
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other. "));
        //72
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
        //73
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other. "));
        //74
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
        //75
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other. "));
        //76
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
        //77
        arraylist.add(new QuizQuestionSit("As the part of your final crime, you have to choose between your daughter Rhea or your husband Mr. Verma. Choosing any of the one will mean that you have to kill the other. "));
        //78
        arraylist.add(new QuizQuestionSit("Choosing not to commit any crime doesn’t mean you are going to have an happy ending. But there’s still a chance to save one of your family member. It’s your call who will you choose? Remember that the other one has to die in order to save the one you chose."));
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
        arraylist.add(new QuizQuestionSit("Binod confront Pooja about everything and upon hearing, she becomes unstable. She defends herself and accuses Ankita of lying to him. She asks the him to kill the woman. Seeing that Pooja is so adamant on killing Ankita, Binod begin to doubt Pooja’s mental state."));
        //96
        arraylist.add(new QuizQuestionSit("Binod meet the kid after school and she introduces herself as Rhea Gupta. Binod shows the photo Pooja got in the parcel to the kid and the kid suddenly gets very scared and starts crying. The kid tells Binod the same incident that Ankita told Binod yesterday. Binod become sure that Pooja is not the real mother and has been lying to Binod this whole time."));
        //97
        arraylist.add(new QuizQuestionSit("Seeing the kid cry on seeing the photo of Pooja, Binod start growing suspicious of Pooja."));
        //98
        arraylist.add(new QuizQuestionSit("While Binod are questioning the kid, Binod sees a lady furiously rushing towards them who was there to pick Rhea up from school. She claims to be Ankita, the mother of Rhea."));
        //99
        arraylist.add(new QuizQuestionSit("Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable."));
        //100
        arraylist.add(new QuizQuestionSit("After confronting Rhea, Binod comes to know the truth. Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable."));
        //101
        arraylist.add(new QuizQuestionSit("Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable."));
        //102
        arraylist.add(new QuizQuestionSit("After confronting Rhea, Binod comes to know the truth. Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable."));
        //103
        arraylist.add(new QuizQuestionSit("Binod confront Pooja about everything and upon hearing, she becomes unstable. She defends herself and accuses Ankita of lying to him. She asks the him to kill the woman. Seeing that Pooja is so adamant on killing Ankita, Binod begin to doubt Pooja’s mental state."));
        //104
        arraylist.add(new QuizQuestionSit("Binod meet the kid after school and she introduces herself as Rhea Gupta. Binod shows the photo Pooja got in the parcel to the kid and the kid suddenly gets very scared and starts crying. The kid tells Binod the same incident that Ankita told Binod yesterday. Binod become sure that Pooja is not the real mother and has been lying to Binod this whole time."));
        //105
        arraylist.add(new QuizQuestionSit("Seeing the kid cry on seeing the photo of Pooja, Binod start growing suspicious of Pooja."));
        //106
        arraylist.add(new QuizQuestionSit("While Binod are questioning the kid, Binod sees a lady furiously rushing towards them who was there to pick Rhea up from school. She claims to be Ankita, the mother of Rhea."));
        //107
        arraylist.add(new QuizQuestionSit("Question"));
        //108
        arraylist.add(new QuizQuestionSit("Question"));
        //109
        arraylist.add(new QuizQuestionSit("Question"));
        //110
        arraylist.add(new QuizQuestionSit("Question"));
        //111
        arraylist.add(new QuizQuestionSit("Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //112
        arraylist.add(new QuizQuestionSit("After confronting Rhea, Binod comes to know the truth. Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //113
        arraylist.add(new QuizQuestionSit("Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //114
        arraylist.add(new QuizQuestionSit("After confronting Rhea, Binod comes to know the truth. Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //115
        arraylist.add(new QuizQuestionSit("Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //116
        arraylist.add(new QuizQuestionSit("After confronting Rhea, Binod comes to know the truth. Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //117
        arraylist.add(new QuizQuestionSit("Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //118
        arraylist.add(new QuizQuestionSit("After confronting Rhea, Binod comes to know the truth. Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //119
        arraylist.add(new QuizQuestionSit("Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //120
        arraylist.add(new QuizQuestionSit("After confronting Rhea, Binod comes to know the truth. Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //121
        arraylist.add(new QuizQuestionSit("Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //122
        arraylist.add(new QuizQuestionSit("After confronting Rhea, Binod comes to know the truth. Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //123
        arraylist.add(new QuizQuestionSit("Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //124
        arraylist.add(new QuizQuestionSit("After confronting Rhea, Binod comes to know the truth. Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //125
        arraylist.add(new QuizQuestionSit("Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //126
        arraylist.add(new QuizQuestionSit("After confronting Rhea, Binod comes to know the truth. Upon reaching Pooja, Binod tells her that Rhea is not the child of Pooja but it is of Ankita and Pooja manipulated Binod to kill an innocent woman and kidnap Rhea. Pooja claims that Rhea is her child and Ankita was illegally keeping Rhea with her. After this, Binod concludes that Pooja is mentally unstable and she was the kidnapper who sent fake parcel to herself and she plays safe by not coming to the crime scene.."));
        //127
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined"));
        //128
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
        //129
        arraylist.add(new QuizQuestionSit("The stranger leads detective Pradyuman to a warehouse where Rhea was kept. Detective interrogate the stranger, save rhea and Exposes NanaJi."));
        //130
        arraylist.add(new QuizQuestionSit("Nanaji had to go back to the funeral, so he leads Mr Pradyuman back to the funeral, meanwhile the stranger completes his job by killing Rhea."));
        //131
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined"));
        //132
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
        //133
        arraylist.add(new QuizQuestionSit("In the final crime you had to kill Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined"));
        //134
        arraylist.add(new QuizQuestionSit("As a consequence of not choosing to commit any crime, they receive Rhea’s dead body next day. The kidnapper’s identity remains undefined "));
        //135
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined"));
        //136
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
        //137
        arraylist.add(new QuizQuestionSit("In the final crime you had to kill Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined"));
        //138
        arraylist.add(new QuizQuestionSit("As a consequence of not choosing to commit any crime, they receive Rhea’s dead body next day. The kidnapper’s identity remains undefined "));
        //139
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined"));
        //140
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
        //141
        arraylist.add(new QuizQuestionSit("In the final crime you had to kill Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined"));
        //142
        arraylist.add(new QuizQuestionSit("As a consequence of not choosing to commit any crime, they receive Rhea’s dead body next day. The kidnapper’s identity remains undefined "));
//143
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//144
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
//145
        arraylist.add(new QuizQuestionSit("You chose to save your husband and however you could not save everyone. The kidnapper’s identity remains undefined "));
//146
        arraylist.add(new QuizQuestionSit("You chose to save your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined "));
//147
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//148
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
//149
        arraylist.add(new QuizQuestionSit("You chose to save your husband and however you could not save everyone. The kidnapper’s identity remains undefined "));
//150
        arraylist.add(new QuizQuestionSit("You chose to save your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined "));
//151
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//152
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
//153
        arraylist.add(new QuizQuestionSit("You chose to save your husband and however you could not save everyone. The kidnapper’s identity remains undefined "));
//154
        arraylist.add(new QuizQuestionSit("You chose to save your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined "));
//155
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//156
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
//157
        arraylist.add(new QuizQuestionSit("You chose to save your husband and however you could not save everyone. The kidnapper’s identity remains undefined "));
//158
        arraylist.add(new QuizQuestionSit("You chose to save your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined "));
//159
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//160
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
//161
        arraylist.add(new QuizQuestionSit("You chose to save your husband and however you could not save everyone. The kidnapper’s identity remains undefined "));
//162
        arraylist.add(new QuizQuestionSit("You chose to save your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined "));
//163
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//164
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
//165
        arraylist.add(new QuizQuestionSit("You chose to save your husband and however you could not save everyone. The kidnapper’s identity remains undefined "));
//166
        arraylist.add(new QuizQuestionSit("You chose to save your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined "));
//167
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//168
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
        //169
        arraylist.add(new QuizQuestionSit("You chose to save your husband and however you could not save everyone. The kidnapper’s identity remains undefined "));
        //170
        arraylist.add(new QuizQuestionSit("You chose to save your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined "));
        //171
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
        //172
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
        //173
        arraylist.add(new QuizQuestionSit("You chose to save your husband and however you could not save everyone. The kidnapper’s identity remains undefined "));
        //174
        arraylist.add(new QuizQuestionSit("You chose to save your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined "));
        //175
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
        //176
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
        //177
        arraylist.add(new QuizQuestionSit("You chose to save Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
        //178
        arraylist.add(new QuizQuestionSit("You chose to save Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined\n"));
        //179
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
        //180
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
        //181
        arraylist.add(new QuizQuestionSit("You chose to save Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//182
        arraylist.add(new QuizQuestionSit("You chose to save Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//183
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//184
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
//185
        arraylist.add(new QuizQuestionSit("You chose to save Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//186
        arraylist.add(new QuizQuestionSit("You chose to save Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//187
        arraylist.add(new QuizQuestionSit("You killed Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//188
        arraylist.add(new QuizQuestionSit("You killed Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined \n"));
//189
        arraylist.add(new QuizQuestionSit("You chose to save Mr.Verma for the sake of your beloved daughter however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//190
        arraylist.add(new QuizQuestionSit("You chose to save Rhea for the sake of your husband  however you could not save everyone. The kidnapper’s identity remains undefined\n"));
//191
        arraylist.add(new QuizQuestionSit("The people form the mental institution come and take away Pooja. Everyone is safe and Binod returns."));
//192
        arraylist.add(new QuizQuestionSit("This enrages and triggers Pooja even more. She becomes so unstable that she hits Binod’s head with a flower vase, thereby killing Binod."));
//193
        arraylist.add(new QuizQuestionSit("Binod confront Pooja about this and she becomes unstable. She defends herself and accuses Ankita of lying to Binod. Binod try to explain to her that Rhea is not her daughter. This enrages Pooja even more and she attacks Binod. She hits Binod on Binod head with a vase, thereby killing Binod."));
//194
        arraylist.add(new QuizQuestionSit("Binod along with police go to Pooja’s house. When Binod reaches her house, Binod see that Pooja has fled."));
//195
        arraylist.add(new QuizQuestionSit("Binod reach Pooja’s house and find that she is not home. Next day Binod are contacted by the police saying that Rhea Gupta is missing and he was the last person spotted with her. Since Rhea wasn’t kidnapped and Pooja was missing, Binod doubts the mental health of Pooja and thinks Pooja has probably abducted her after he left Rhea at school and the whole plan of murdering was Pooja’s plot."));
//196
        arraylist.add(new QuizQuestionSit("Binod reach Pooja’s house and find that she is not home. Next day Binod are contacted by the police saying that Rhea Gupta is missing and he was the last person spotted with her. Since Rhea wasn’t kidnapped and Pooja was missing, Binod doubts the mental health of Pooja and thinks Pooja has probably abducted her after he left Rhea at school and the whole plan of murdering was Pooja’s plot."));
//197
        arraylist.add(new QuizQuestionSit("Binod recalls that Ankita was the woman whose name was on the envelope in the parcel and gets to know she was an old friend of pooja. Binod confronts pooja about today’s happenings and how everything points to the fact that she is lying and is not the real mother of Rhea. Seeing that there is no escape now, Pooja proceeds to kill Binod."));
//198
        arraylist.add(new QuizQuestionSit("Binod recalls that Ankita was the woman whose name was on the envelope in the parcel and gets to know she was an old friend of pooja. Binod confronts pooja about today’s happenings and how everything points to the fact that she is lying and is not the real mother of Rhea. Seeing that there is no escape now, Pooja proceeds to kill Binod."));
//199
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
//200
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
//201
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
//202
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
//203
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
//204
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
//205
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
    //206
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
        //207
        arraylist.add(new QuizQuestionSit("Binod tells Rhea that he has to tell police because Pooja has tried to fake a crime and planned to kill an innocent woman. When Binod calls police Pooja panics, and hits him with a flower vase on the head which leads to Binod’s death."));
      //208
        arraylist.add(new QuizQuestionSit("This enrages and triggers Pooja even more. She becomes so unstable that she hits Binod’s head with a flower vase, thereby killing Binod."));
      //209
        arraylist.add(new QuizQuestionSit("Binod confront Pooja about this and she becomes unstable. She defends herself and accuses Ankita of lying to Binod. Binod try to explain to her that Rhea is not her daughter. This enrages Pooja even more and she attacks Binod. She hits Binod on Binod head with a vase, thereby killing Binod."));
      //210
        arraylist.add(new QuizQuestionSit("Binod along with police go to Pooja’s house. When Binod reaches her house, Binod see that Pooja has fled."));
      //211
        arraylist.add(new QuizQuestionSit("Binod reach Pooja’s house and find that she is not home. Next day Binod are contacted by the police saying that Rhea Gupta is missing and he was the last person spotted with her. Since Rhea wasn’t kidnapped and Pooja was missing, Binod doubts the mental health of Pooja and thinks Pooja has probably abducted her after he left Rhea at school and the whole plan of murdering was Pooja’s plot."));
      //212
        arraylist.add(new QuizQuestionSit("Binod reach Pooja’s house and find that she is not home. Next day Binod are contacted by the police saying that Rhea Gupta is missing and he was the last person spotted with her. Since Rhea wasn’t kidnapped and Pooja was missing, Binod doubts the mental health of Pooja and thinks Pooja has probably abducted her after he left Rhea at school and the whole plan of murdering was Pooja’s plot."));
        //213
        arraylist.add(new QuizQuestionSit("Binod recalls that Ankita was the woman whose name was on the envelope in the parcel and gets to know she was an old friend of pooja. Binod confronts pooja about today’s happenings and how everything points to the fact that she is lying and is not the real mother of Rhea. Seeing that there is no escape now, Pooja proceeds to kill Binod."));
//214
        arraylist.add(new QuizQuestionSit("Binod recalls that Ankita was the woman whose name was on the envelope in the parcel and gets to know she was an old friend of pooja. Binod confronts pooja about today’s happenings and how everything points to the fact that she is lying and is not the real mother of Rhea. Seeing that there is no escape now, Pooja proceeds to kill Binod."));
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
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
//224
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
//225
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
//226
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
//227
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
//228
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
//229
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
//230
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
//231
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
//232
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
//233
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
//234
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
//235
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
//236
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
//237
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
//238
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
//239
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
     //240
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
        //241
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
        //242
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
        //243
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
        //244
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
        //245
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
        //246
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
        //247
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
        //248
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
        //249
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
        //250
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
        //251
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
        //252
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
        //253
        arraylist.add(new QuizQuestionSit("Binod goes to police and pleads guilty for his crime and gets Pooja arrested. Both gets jailed for 20 years."));
        //254
        arraylist.add(new QuizQuestionSit("Binod lives the rest of his life in guilt of killing and innocent woman and a mother to a small child."));
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
