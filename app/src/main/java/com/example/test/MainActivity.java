package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstValue , secondValue ;
    TextView textViewAns ;
    Button add, subtract , multiply , divide ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String data2;
        TextView showtext = findViewById(R.id.tvCalculator);
        Intent intent = getIntent();
        data2 = intent.getStringExtra("getIntentValue");

        showtext.setText(data2);


        firstValue = findViewById(R.id.etFirstValue);
        secondValue = findViewById(R.id.etSecondValue);
        textViewAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first_Value , second_value , ans_ ;

                first_Value = Integer.parseInt(firstValue.getText().toString());
                second_value = Integer.parseInt(secondValue.getText().toString());

                ans_ = first_Value + second_value;

                textViewAns.setText(" Answer is " + ans_);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first_Value , second_value , ans_ ;

                first_Value = Integer.parseInt(firstValue.getText().toString());
                second_value = Integer.parseInt(secondValue.getText().toString());

                ans_ = first_Value - second_value;

                textViewAns.setText(" Answer is " + ans_);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first_Value , second_value , ans_ ;

                first_Value = Integer.parseInt(firstValue.getText().toString());
                second_value = Integer.parseInt(secondValue.getText().toString());

                ans_ = first_Value * second_value;

                textViewAns.setText(" Answer is " + ans_);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first_Value , second_value , ans_ ;

                first_Value = Integer.parseInt(firstValue.getText().toString());
                second_value = Integer.parseInt(secondValue.getText().toString());

                ans_ = first_Value / second_value;

                textViewAns.setText(" Answer is " + ans_);
            }
        });
    }
}