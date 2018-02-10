package com.example.abdulbasitmehtab.multiplicationtablegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button result;
    String number;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.etNum);
        result = (Button) findViewById(R.id.btGenerate);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = et.getText().toString();
                value = Integer.parseInt(number);

                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);
                myIntent.putExtra("inputValue", value);
                startActivity(myIntent);
            }
        });
    }
}
