package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openColorsActivity(View view){
        Intent intentColors = new Intent(this, ColorsActivity.class);
        if (intentColors.resolveActivity(getPackageManager()) != null) {
                startActivity(intentColors);
        }
    }
    public void openFamilyActivity(View view){
        Intent intentFamily = new Intent(this, FamilyActivity.class);
        if (intentFamily.resolveActivity(getPackageManager()) != null) {
            startActivity(intentFamily);
        }
    }
    public void openNumbersActivity(View view){
        Intent intentNumbers = new Intent(this, NumbersActivity.class);
        if (intentNumbers.resolveActivity(getPackageManager()) != null) {
            startActivity(intentNumbers);
        }
    }
    public void openPhrasesActivity(View view){
        Intent intentPhrases = new Intent(this, PhrasesActivity.class);
        if (intentPhrases.resolveActivity(getPackageManager()) != null) {
            startActivity(intentPhrases);
        }
    }
}
