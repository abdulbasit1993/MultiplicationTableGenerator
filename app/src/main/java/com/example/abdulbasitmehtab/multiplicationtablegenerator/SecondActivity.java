package com.example.abdulbasitmehtab.multiplicationtablegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResult = (TextView) findViewById(R.id.textView);

        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("inputValue",0);

        for(int i=1;i<=10;i++)
        {
            tvResult.append("\n" + intValue + " x " + i + " = "+ intValue*i);
        }
    }
}
