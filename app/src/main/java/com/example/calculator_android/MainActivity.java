package com.example.calculator_android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String intermediateNumber = "";
    TextView textView;
    Double firstNumber, secondNumber;
    String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
    }

    public void tappingNumber(View view) {

        switch (view.getId()) {
            case R.id.button0:
                textView.append("0");
                intermediateNumber += "0";
                break;
            case R.id.button1:
                textView.append("1");
                intermediateNumber += "1";
                break;
            case R.id.button2:
                textView.append("2");
                intermediateNumber += "2";
                break;
            case R.id.button3:
                textView.append("3");
                intermediateNumber += "3";
                break;
            case R.id.button4:
                textView.append("4");
                intermediateNumber += "4";
                break;
            case R.id.button5:
                textView.append("5");
                intermediateNumber += "5";
                break;
            case R.id.button6:
                textView.append("6");
                intermediateNumber += "6";
                break;
            case R.id.button7:
                textView.append("7");
                intermediateNumber += "7";
                break;
            case R.id.button8:
                textView.append("8");
                intermediateNumber += "8";
                break;
            case R.id.button9:
                textView.append("9");
                intermediateNumber += "9";
                break;
        }

    }

    @SuppressLint("SetTextI18n")
    public void tappingLogic(View view) {
        switch (view.getId()) {
            case R.id.button_addition:
                firstNumber = Double.valueOf(intermediateNumber);
                operation = "+";
                textView.setText("");
                intermediateNumber = String.valueOf(0);
                break;

            case R.id.button_subtraction:
                firstNumber = Double.valueOf(intermediateNumber);
                operation = "-";
                textView.setText("");
                intermediateNumber = String.valueOf(0);
                break;

            case R.id.button_multiplication:
                firstNumber = Double.valueOf(intermediateNumber);
                operation = "*";
                textView.setText("");
                intermediateNumber = String.valueOf(0);
                break;

            case R.id.button_division:
                firstNumber = Double.valueOf(intermediateNumber);
                operation = "/";
                textView.setText("");
                intermediateNumber = String.valueOf(0);
                break;

            case R.id.clear:
                intermediateNumber = "";
                firstNumber = (double) 0;
                secondNumber = (double) 0;
                operation = "";
                textView.setText(" ");
                break;

            case R.id.button_equals:
                secondNumber = Double.valueOf(intermediateNumber);
                textView.setText("");

                switch (operation) {
                    case "+":
                        textView.setText(Double.parseDouble(String.valueOf(firstNumber))
                                + Double.parseDouble(String.valueOf(secondNumber)) + "");
                        break;

                    case "-":
                        textView.setText(Double.parseDouble(String.valueOf(firstNumber))
                                - Double.parseDouble(String.valueOf(secondNumber)) + "");
                        break;

                    case "*":
                        textView.setText(Double.parseDouble(String.valueOf(firstNumber))
                                * Double.parseDouble(String.valueOf(secondNumber)) + "");
                        break;

                    case "/":
                        textView.setText(Double.parseDouble(String.valueOf(firstNumber))
                                / Double.parseDouble(String.valueOf(secondNumber)) + "");
                        break;
                }
                operation = "";
                firstNumber = (double) 0;
                secondNumber = (double) 0;
                break;
        }

    }
}
