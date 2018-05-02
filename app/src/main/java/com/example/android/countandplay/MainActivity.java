package com.example.android.countandplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTheQuiz(View view) {
        /**
         * Figure out the player name and save it for the next activity
         */
        EditText nameEditText = findViewById(R.id.name);
        String playerName = nameEditText.getText().toString();

        Intent intent = new Intent(MainActivity.this, QuizActivity.class);
        intent.putExtra("Player_NAME", playerName);

        startActivity(intent);
    }

}



