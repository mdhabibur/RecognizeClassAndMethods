package com.mmali.recognizeclassandmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //github personal access token: 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


    //class name always starts with capital letter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //method name starts with small letter by convention

        //camelCase method is always used in java to write variables, class, method name
        //reserved keys are marked in blue color in android studio and you can't use them to write your variables

        showSecondCommit();



    }

    public void showSecondCommit(){
        Toast.makeText(MainActivity.this, "This is second commit to this repository", Toast.LENGTH_SHORT).show();
    }

}