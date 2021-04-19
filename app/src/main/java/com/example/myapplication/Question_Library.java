package com.example.myapplication;

public class Question_Library {

    private  String mQuestiuon [] =  {
            "What is Android?",
            "Who can customize Android OS?",
            "What programming language is Android used?",
            "What is the core architecture of Android?",
            "What libraries does Android have?",
    };

    private  String mTitle [] = {
            "Question 1",
            "Question 2",
            "Question 3",
            "Question 4",
            "Question 5",
    };


    private String mchoices [][] = {
        {"A. Network Operating System", "B. Mobile Operating System", "C. Batch Operating System"},
        {"A. No one", "B. Anyone", "C. Other"},
        {"A. Java", "B. C++", "C. All above"},
        {"A. Linux Kernel", "B. Windows", "C. Unix"},
        {"A. C", "B. C++", "C. All above"}
};


    private  String mCorrectAnswer[]  = {"B. Mobile Operating System", "B. Anyone", "C. All above", "A. Linux Kernel", "C. All above"};


    public  String getQuestion(int a) {
        String question = mQuestiuon[a];
        return question;
    }

    public  String getTitle(int a) {
        String title = mTitle[a];
        return title;
    }

    public  String getChoice1(int a) {
        String choice0 = mchoices[a][0];
        return choice0;
    }

    public  String getChoice2(int a ) {
        String choice1 = mchoices[a][1];
        return choice1;
    }
    public  String getChoice3(int a) {
        String choice2 = mchoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return  answer;
    }


}
