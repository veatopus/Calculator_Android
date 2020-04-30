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
    String operation, result;
    boolean isFirst, resetAfterOperation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
    }

    public void tappingNumber(View view) {
        if (resetAfterOperation) {
            textView.setText("");
            resetAfterOperation = !resetAfterOperation;
        }
        switch (view.getId()) {
            case R.id.button0:
                textView.append("0");
                intermediateNumber += "0";
                isFirst = true;
                break;
            case R.id.button1:
                textView.append("1");
                intermediateNumber += "1";
                isFirst = true;
                break;
            case R.id.button2:
                textView.append("2");
                intermediateNumber += "2";
                break;
            case R.id.button3:
                textView.append("3");
                intermediateNumber += "3";
                isFirst = true;
                break;
            case R.id.button4:
                textView.append("4");
                intermediateNumber += "4";
                isFirst = true;
                break;
            case R.id.dot:
                if (isFirst) {
                    textView.append(".");
                    intermediateNumber += ".";
                    isFirst = !isFirst;
                }
                break;
            case R.id.button5:
                textView.append("5");
                intermediateNumber += "5";
                isFirst = true;
                break;
            case R.id.button6:
                textView.append("6");
                intermediateNumber += "6";
                isFirst = true;
                break;
            case R.id.button7:
                textView.append("7");
                intermediateNumber += "7";
                isFirst = true;
                break;
            case R.id.button8:
                textView.append("8");
                intermediateNumber += "8";
                isFirst = true;
                break;
            case R.id.button9:
                textView.append("9");
                intermediateNumber += "9";
                isFirst = true;
                break;
        }

    }

    @SuppressLint("SetTextI18n")
    public void tappingLogic(View view) {
        switch (view.getId()) {
            case R.id.button_addition:
                if (isFirst) {
                    firstNumber = Double.valueOf(intermediateNumber);
                    operation = "+";
                    textView.setText("");
                    intermediateNumber = null;
                }
                break;

            case R.id.button_subtraction:
                if (isFirst) {
                    firstNumber = Double.valueOf(intermediateNumber);
                    operation = "-";
                    textView.setText("");
                    intermediateNumber = null;
                }
                break;

            case R.id.button_multiplication:
                if (isFirst) {
                    firstNumber = Double.valueOf(intermediateNumber);
                    operation = "*";
                    textView.setText("");
                    intermediateNumber = null;
                }
                break;

            case R.id.button_division:
                if (isFirst) {
                    firstNumber = Double.valueOf(intermediateNumber);
                    operation = "/";
                    textView.setText("");
                    intermediateNumber = null;
                }
                break;

            case R.id.back:

                break;

            case R.id.clear:
                clear();
                textView.setText("");
                break;

            case R.id.button_equals:
                if (operation != null) {
                    secondNumber = Double.valueOf(intermediateNumber);
                    textView.setText("");

                    switch (operation) {
                        case "+":
                            result = Double.parseDouble(String.valueOf(firstNumber))
                                    + Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;

                        case "-":
                            result = Double.parseDouble(String.valueOf(firstNumber))
                                    - Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;

                        case "*":
                            result = Double.parseDouble(String.valueOf(firstNumber))
                                    * Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;

                        case "/":
                            result = Double.parseDouble(String.valueOf(firstNumber))
                                    / Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;
                    }
                    resetAfterOperation = true;
                    textView.setText(result);
                    clear();

                }

                break;
        }

    }

    public void clear() {
        intermediateNumber = null;
        result = null;
        firstNumber = null;
        secondNumber = null;
        operation = null;
        resetAfterOperation = false;
        isFirst = false;
    }
}
