package com.example.android.countandplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    String myPlayerName;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        /**
         * Get the player name from previous activity
         */
        myPlayerName = getIntent().getStringExtra("Player_NAME");
    }

    /**
     * Count the score for every question
     *
     * @return total score
     */
    private int countTheScore() {

        /**
         * Question 1
         */

        RadioButton radioButtonQuestion1Answer1 = (RadioButton) findViewById(R.id.question1_answer1);
        RadioButton radioButtonQuestion1Answer2 = (RadioButton) findViewById(R.id.question1_answer2);
        RadioButton radioButtonQuestion1Answer3 = (RadioButton) findViewById(R.id.question1_answer3);
        if (radioButtonQuestion1Answer1.isChecked()) {
            score++;
            radioButtonQuestion1Answer1.setBackgroundColor(getResources().getColor(R.color.green));
        } else if (radioButtonQuestion1Answer2.isChecked()) {
            radioButtonQuestion1Answer2.setBackgroundColor(getResources().getColor(R.color.red));
        } else if (radioButtonQuestion1Answer3.isChecked()) {
            radioButtonQuestion1Answer3.setBackgroundColor(getResources().getColor(R.color.red));
        }



        /**
         * Question 2
         */
        RadioButton radioButtonQuestion2Answer1 = (RadioButton) findViewById(R.id.question2_answer1);
        RadioButton radioButtonQuestion2Answer2 = (RadioButton) findViewById(R.id.question2_answer2);
        RadioButton radioButtonQuestion2Answer3 = (RadioButton) findViewById(R.id.question2_answer3);
        if (radioButtonQuestion2Answer2.isChecked()) {
            score ++;
            radioButtonQuestion2Answer2.setBackgroundColor(getResources().getColor(R.color.green));
        }

        /**
         * Question 3
         */
        RadioButton radioButtonQuestion3Answer1 = (RadioButton) findViewById(R.id.question3_answer1);
        RadioButton radioButtonQuestion3Answer2 = (RadioButton) findViewById(R.id.question3_answer2);
        RadioButton radioButtonQuestion3Answer3 = (RadioButton) findViewById(R.id.question3_answer3);
        if (radioButtonQuestion3Answer1.isChecked()) {
            score ++;
            radioButtonQuestion3Answer1.setBackgroundColor(getResources().getColor(R.color.green));
        }

        /**
         * Question 4
         */
        EditText editTextAnswer = (EditText) findViewById(R.id.edit_text);
        if (editTextAnswer.getText().toString().equals(getString(R.string.correct_answer)) || editTextAnswer.getText().toString().equals(getString(R.string.correct_answer_2)) || editTextAnswer.getText().toString().equals(getString(R.string.correct_answer_3)) || editTextAnswer.getText().toString().equals(getString(R.string.correct_answer_4))) {
            score += 2;
        }

        /**
         * Question 5
         */
        RadioButton radioButtonQuestion5Answer1 = (RadioButton) findViewById(R.id.question5_answer1);
        RadioButton radioButtonQuestion5Answer2 = (RadioButton) findViewById(R.id.question5_answer2);
        RadioButton radioButtonQuestion5Answer3 = (RadioButton) findViewById(R.id.question5_answer3);
        if (radioButtonQuestion5Answer1.isChecked()) {
            score ++;
            radioButtonQuestion5Answer1.setBackgroundColor(getResources().getColor(R.color.green));
        }

        /**
         * Question 6
         */
        RadioButton radioButtonQuestion6Answer1 = (RadioButton) findViewById(R.id.question6_answer1);
        RadioButton radioButtonQuestion6Answer2 = (RadioButton) findViewById(R.id.question6_answer2);
        RadioButton radioButtonQuestion6Answer3 = (RadioButton) findViewById(R.id.question6_answer3);
        if (radioButtonQuestion6Answer2.isChecked()) {
            score ++;
            radioButtonQuestion6Answer2.setBackgroundColor(getResources().getColor(R.color.green));
        }

        /**
         * Question 7
         */
        RadioButton radioButtonQuestion7Answer1 = (RadioButton) findViewById(R.id.question7_answer1);
        RadioButton radioButtonQuestion7Answer2 = (RadioButton) findViewById(R.id.question7_answer2);
        RadioButton radioButtonQuestion7Answer3 = (RadioButton) findViewById(R.id.question7_answer3);
        if (radioButtonQuestion7Answer3.isChecked()) {
            score ++;
            radioButtonQuestion7Answer3.setBackgroundColor(getResources().getColor(R.color.green));
        }

        /**
         * Question 8
         */
        RadioButton radioButtonQuestion8Answer1 = (RadioButton) findViewById(R.id.question8_answer1);
        RadioButton radioButtonQuestion8Answer2 = (RadioButton) findViewById(R.id.question8_answer2);
        RadioButton radioButtonQuestion8Answer3 = (RadioButton) findViewById(R.id.question8_answer3);
        if (radioButtonQuestion8Answer1.isChecked()) {
            score ++;
            radioButtonQuestion8Answer1.setBackgroundColor(getResources().getColor(R.color.green));
        }

        /**
         * Question 9
         */
        RadioButton radioButtonQuestion9Answer1 = (RadioButton) findViewById(R.id.question9_answer1);
        RadioButton radioButtonQuestion9Answer2 = (RadioButton) findViewById(R.id.question9_answer2);
        RadioButton radioButtonQuestion9Answer3 = (RadioButton) findViewById(R.id.question9_answer3);
        if (radioButtonQuestion9Answer1.isChecked()) {
            score ++;
            radioButtonQuestion9Answer1.setBackgroundColor(getResources().getColor(R.color.green));
        }

        /**
         * Question 10
         */
        CheckBox checkBoxSentence1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkBoxSentence2 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox checkBoxSentence3 = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox checkBoxSentence4 = (CheckBox) findViewById(R.id.checkbox4);
        if (!checkBoxSentence1.isChecked() && checkBoxSentence2.isChecked() && checkBoxSentence3.isChecked() && !checkBoxSentence4.isChecked()) {
            score += 2;
            checkBoxSentence2.setBackgroundColor(getResources().getColor(R.color.green));
            checkBoxSentence3.setBackgroundColor(getResources().getColor(R.color.green));
        }
        return score;
    }

    /**
     * This method is called when check the answers button is clicked
     */
    public void checkTheAnswers(View view) {
        score = countTheScore();
        display(score);
    }

    /**
     * Display toast message with score
     *
     * @param score
     */
    private void display(int score) {

        if (score <= 5) {
            Toast.makeText(this, myPlayerName + "! " + getString(R.string.total_score) + " " + score + getString(R.string.you_need_practise), Toast.LENGTH_LONG).show();
        }
        if (score >= 6 && score <= 11) {
            Toast.makeText(this, myPlayerName + "! " + getString(R.string.total_score) + " " + score + getString(R.string.good_job), Toast.LENGTH_LONG).show();
        }
        if (score == 12) {
            Toast.makeText(this, myPlayerName + "! " + getString(R.string.total_score) + " " + score + getString(R.string.excellent), Toast.LENGTH_LONG).show();
        }

    }

}

