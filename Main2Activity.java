package com.example.android.quiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText textName;
    String name;

    int question1RadioButtonID;
    String question1SelectedText;

    int question2RadioButtonID;
    String question2SelectedText;

    int question3RadioButtonID;
    String question3SelectedText;

    EditText textQuestion4;
    String question4Input;

    EditText textQuestion5;
    String question5Input;

    int question6RadioButtonID;
    String question6SelectedText;

    String results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    /**
     * This method is called when the Review button is clicked.
     */
    public void reviewSurvey(View view) {
        textName = (EditText) findViewById(R.id.inputName);
        name = textName.getText().toString();

        question1Selection();
        question2Selection();
        question3Selection();
        question4Input();
        question5Input();
        question6Selection();

        results = "Your Name: " + name;
        results += "\nWhy did you take this course? " + question1SelectedText;
        results += "\nDid the course meet your expectations? " + question2SelectedText;
        results += "\nWould you recommend this course to others? " + question3SelectedText;
        results += "\nIf no, why not? " + question4Input;
        results += "\nHow could the course be improved. If at all? " + question5Input;
        results += "\nWhat is your gender? " + question6SelectedText;

        Intent startNewActivity = new Intent(this, Main3Activity.class);
        startNewActivity.putExtra("key", results);
        startActivity(startNewActivity);
    }


    private void question1Selection() {
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.question1RadioGroup);
        question1RadioButtonID = radioGroup1.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) radioGroup1.findViewById(question1RadioButtonID);
        question1SelectedText = (String) radioButton.getText();
    }

    private void question2Selection() {
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.question2RadioGroup);
        question2RadioButtonID = radioGroup2.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) radioGroup2.findViewById(question2RadioButtonID);
        question2SelectedText = (String) radioButton.getText();
    }

    private void question3Selection() {
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.question3RadioGroup);
        question3RadioButtonID = radioGroup3.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) radioGroup3.findViewById(question3RadioButtonID);
        question3SelectedText = (String) radioButton.getText();
    }

    private void question4Input() {
        textQuestion4 = (EditText) findViewById(R.id.inputQuestion4);
        question4Input = textQuestion4.getText().toString();
    }

    private void question5Input() {
        textQuestion5 = (EditText) findViewById(R.id.inputQuestion5);
        question5Input = textQuestion5.getText().toString();
    }

    private void question6Selection() {
        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.question6RadioGroup);
        question6RadioButtonID = radioGroup6.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) radioGroup6.findViewById(question6RadioButtonID);
        question6SelectedText = (String) radioButton.getText();
    }

}
