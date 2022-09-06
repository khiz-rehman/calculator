package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        TextView calculator = findViewById(R.id.tvCalculator2);
        calculator.setText("Calculator");

        Thread thread = new Thread(){

            public void run(){
                try {
                    sleep(4000);
                }
                catch (Exception e){
                   e.printStackTrace();
                }
                finally {
                    String data = calculator.getText().toString();
                    Intent intent = new Intent(SplashActivity.this , MainActivity.class);
                    intent.putExtra("getIntentValue" , "Calculator");
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
}