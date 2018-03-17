package com.example.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Start Survey button is clicked.
     */
    public void startSurvey(View view) {
        Intent startNewActivity = new Intent(this, Main2Activity.class);
        startActivity(startNewActivity);
    }
}
