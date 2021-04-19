package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class Q1 extends AppCompatActivity {

    private Question_Library questionLibrary = new Question_Library();
    private String answer;
    private int QuestionNum = 0;
    private int score = 0;
    private TextView question_title, question_detail;
    Button A1, A2, A3, sub;
    private boolean check = true, next = false, If_pressed = false;
    int p = 1;
    int p2 = 1;
    int G = 1;
    int count = 0;


    Boolean save1 = false, save2 = false, save3 = false, socrecheck = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView Name, progress;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        A1 = findViewById(R.id.BT_A1);
        A2 = findViewById(R.id.BT_A2);
        A3 = findViewById(R.id.BT_A3);
        sub = findViewById(R.id.BT_Sub);
        question_title = findViewById(R.id.question_title);
        question_detail = findViewById(R.id.question_detail);


        Name = findViewById(R.id.Name);
        progress = findViewById(R.id.progress);
        Name.setText(getIntent().getStringExtra("name"));
        ProgressBar progressBar;
        ProgressBar simpleProgressBar = findViewById(R.id.progressBar); // initiate the progress bar
        simpleProgressBar.setProgress(p);
        progress.setText("1/5");

        A1.setBackgroundColor(Color.WHITE);
        A2.setBackgroundColor(Color.WHITE);
        A3.setBackgroundColor(Color.WHITE);
        updateQuestion();
        sub.setText("Submit!");


        A1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                //   if (A1.getText() == answer) {

                //       if (check == true) {
                //          score = score + 1;
                //     }
                if (If_pressed == false) {
                    save1 = true;
                    save2 = false;
                    save3 = false;

                    A1.setBackgroundColor(Color.LTGRAY);
                    A2.setBackgroundColor(Color.WHITE);
                    A3.setBackgroundColor(Color.WHITE);
                }


//                    } else {
//                        check = false;
//
////                        A1.setBackgroundColor(Color.RED);
//                        if (A2.getText() == answer) {
//                            save2 = true;
////                            A2.setBackgroundColor(Color.GREEN);
//                        } else if (A3.getText() == answer) {
//                            save3 = true;
////                            A3.setBackgroundColor(Color.GREEN);
//                        }


            }
        });



        A2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                //     if (A2.getText() == answer) {

                //        if (check == true) {
                //           score = score + 1;
                //       }
                if (If_pressed == false) {
                    save2 = true;
                    save1 = false;
                    save3 = false;
                    A1.setBackgroundColor(Color.WHITE);
                    A2.setBackgroundColor(Color.LTGRAY);
                    A3.setBackgroundColor(Color.WHITE);
                }
                //  }

//                        A2.setBackgroundColor(Color.GREEN);

//                } else {
//                    check = false;
////                        A2.setBackgroundColor(Color.RED);
//                    if (A1.getText() == answer) {
//                        save1 = true;
////                            A1.setBackgroundColor(Color.GREEN);
//                    } else if (A3.getText() == answer) {
//                        save3 = true;
////                            A3.setBackgroundColor(Color.GREEN);
//                    }
//
//                }


//                A1.setBackgroundColor(Color.GREEN);
//                A2.setBackgroundColor(Color.RED);
//                A3.setBackgroundColor(Color.WHITE);

            }
        });
        A3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                // if (A3.getText() == answer) {
                if (If_pressed == false) {
                    save3 = true;
                    save2 = false;
                    save1 = false;
                    A1.setBackgroundColor(Color.WHITE);
                    A2.setBackgroundColor(Color.WHITE);
                    A3.setBackgroundColor(Color.LTGRAY);
                }

                //  if (check == true) {
                //        score = score + 1;
                //     }
            }
//                        A3.setBackgroundColor(Color.GREEN);


//                } else {
//                    check = false;
////                        A3.setBackgroundColor(Color.RED);
//                    if (A1.getText() == answer) {
//                        save1 = true;
////                            A1.setBackgroundColor(Color.GREEN);
//                    } else if (A2.getText() == answer) {
//                        save3 = true;
////                            A2.setBackgroundColor(Color.GREEN);
//                    }
//
//                }
//                A1.setBackgroundColor(Color.GREEN);
//                A2.setBackgroundColor(Color.WHITE);
//                A3.setBackgroundColor(Color.RED);

            //}
        });
        sub.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                G++;
                If_pressed = true;//already showed the answer so user can't pressed any button

                if (next == false) {
                    sub.setText("Next!");

                    if (save1 == true) {
                        if (A1.getText() == answer) {
                            A1.setBackgroundColor(Color.GREEN);
                            if (check == true && socrecheck == false) {
                                score = score + 1;
                                socrecheck = true;
                            }
                        } else {
                            check = false;
                            A1.setBackgroundColor(Color.RED);
                            if (A2.getText() == answer) {
                                A2.setBackgroundColor(Color.GREEN);
                            } else if (A3.getText() == answer) {
                                A3.setBackgroundColor(Color.GREEN);
                            }
                        }

                    }
                    if (save2 == true) {
                        if (A2.getText() == answer) {
                            if (check == true && socrecheck == false) {
                                score = score + 1;
                                socrecheck = true;
                            }
                            A2.setBackgroundColor(Color.GREEN);

                        } else {
                            check = false;
                            A2.setBackgroundColor(Color.RED);
                            if (A1.getText() == answer) {
                                A1.setBackgroundColor(Color.GREEN);
                            } else if (A3.getText() == answer) {
                                A3.setBackgroundColor(Color.GREEN);
                            }
                        }

                    }
                    if (save3 == true) {
                        if (A3.getText() == answer) {
                            if (check == true && socrecheck == false) {
                                score = score + 1;
                                socrecheck = true;
                            }
                            A3.setBackgroundColor(Color.GREEN);

                        } else {
                            check = false;
                            A3.setBackgroundColor(Color.RED);
                            if (A1.getText() == answer) {
                                A1.setBackgroundColor(Color.GREEN);
                            } else if (A2.getText() == answer) {
                                A2.setBackgroundColor(Color.GREEN);
                            }
                        }
                    }

                    if (count == 1) {
                        next = true;
                    }
                    count++;
                }

                if (next == true) {
                    progress.setText(p2 + "/5");
                    simpleProgressBar.setProgress(p);
                    sub.setText("Submit!");
                    updateQuestion();
                    next = false;
                    count = 0;
                    save1 = false;
                    save2 = false;
                    save3 = false;//refresh user choices

                }
                if(G == 9)
                {
                    sub.setText("Finish");
                }


                if (G == 10) {

                    Intent intent = new Intent();
                    intent.setClass(Q1.this, Feedback.class);
                    intent.putExtra("name", Name.getText().toString());
                    intent.putExtra("score", score);
                    startActivity(intent);
                    //finished all questions and push the score and user name

                }


            }
        });
    }


    private void updateQuestion() {
        //refresh questions and answers
        question_detail.setText(questionLibrary.getQuestion(QuestionNum));
        question_title.setText(questionLibrary.getTitle(QuestionNum));
        A1.setText(questionLibrary.getChoice1(QuestionNum));
        A2.setText(questionLibrary.getChoice2(QuestionNum));
        A3.setText(questionLibrary.getChoice3(QuestionNum));
        answer = questionLibrary.getCorrectAnswer(QuestionNum);
        A1.setBackgroundColor(Color.WHITE);
        A2.setBackgroundColor(Color.WHITE);
        A3.setBackgroundColor(Color.WHITE);
        socrecheck = false;
        check = true;
        If_pressed = false;
        p++;//progress bar increasing
        p2++;//progress counting
        QuestionNum++;


    }



}