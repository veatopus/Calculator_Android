package com.example.calculator_android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.Double.valueOf;


public class MainActivity extends AppCompatActivity {
    String intermediateNumber = "";
    TextView textView;
    Double firstNumber, secondNumber;
    String operation, resultInString;
    double intermediateResult = 0.0;
    boolean isFirst, resetAfterOperation,isFirstForZero = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        clear();
    }

    public void tappingNumber(View view) {
        if (resetAfterOperation) {
            textView.setText("");
            resetAfterOperation = !resetAfterOperation;
        }
        switch (view.getId()) {
            case R.id.button0:
                if (isFirstForZero) {
                    textView.append("0");
                    intermediateNumber += "0";
                    isFirst = true;
                }
                break;
            case R.id.button1:
                textView.append("1");
                intermediateNumber += "1";
                isFirst = true;
                isFirstForZero = true;
                break;
            case R.id.button2:
                textView.append("2");
                intermediateNumber += "2";
                isFirst = true;
                isFirstForZero = true;
                break;
            case R.id.button3:
                textView.append("3");
                intermediateNumber += "3";
                isFirst = true;
                isFirstForZero = true;
                break;
            case R.id.button4:
                textView.append("4");
                intermediateNumber += "4";
                isFirst = true;
                isFirstForZero = true;
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
                isFirstForZero = true;
                isFirst = true;
                break;
            case R.id.button6:
                textView.append("6");
                intermediateNumber += "6";
                isFirstForZero = true;
                isFirst = true;
                break;
            case R.id.button7:
                textView.append("7");
                intermediateNumber += "7";
                isFirstForZero = true;
                isFirst = true;
                break;
            case R.id.button8:
                textView.append("8");
                intermediateNumber += "8";
                isFirstForZero = true;
                isFirst = true;
                break;
            case R.id.button9:
                textView.append("9");
                intermediateNumber += "9";
                isFirstForZero = true;
                isFirst = true;
                break;
        }

    }

    @SuppressLint("SetTextI18n")
    public void tappingLogic(View view) {
        switch (view.getId()) {

            case R.id.button_addition:
                if (isFirst) {
                    //firstNumber = Double.valueOf(intermediateNumber);
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;

                    operation = "+";
                    textView.setText("");
                    intermediateNumber = "";
                }
                break;

            case R.id.button_subtraction:
                if (isFirst) {
                    //firstNumber = Double.valueOf(intermediateNumber);
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;

                    operation = "-";
                    textView.setText("");
                    intermediateNumber = "";
                }
                break;

            case R.id.button_multiplication:
                if (isFirst) {
                    //firstNumber = Double.valueOf(intermediateNumber);
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;

                    operation = "*";
                    textView.setText("");
                    intermediateNumber = "";
                }
                break;

            case R.id.button_division:
                if (isFirst) {
                    //firstNumber = Double.valueOf(intermediateNumber);
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;

                    operation = "/";
                    textView.setText("");
                    intermediateNumber = "";
                }
                break;

            case R.id.back:
                textView.setText("забудь про эту кнопку");
                break;

            case R.id.clear:
                clear();
                textView.setText("");
                break;

            case R.id.button_equals:

                if (!operation.equals("")) {
                    secondNumber = Double.valueOf(intermediateNumber);


                    textView.setText("");


                    switch (operation) {
                        case "+":
                            resultInString = Double.parseDouble(String.valueOf(firstNumber))
                                    + Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;

                        case "-":
                            resultInString = Double.parseDouble(String.valueOf(firstNumber))
                                    - Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;

                        case "*":
                            resultInString = Double.parseDouble(String.valueOf(firstNumber))
                                    * Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;

                        case "/":
                            resultInString = Double.parseDouble(String.valueOf(firstNumber))
                                    / Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;
                    }
                    resetAfterOperation = true;
                    textView.setText(resultInString);
                    clear();

                }

                break;
        }

    }

    public void clear() {
        intermediateNumber = "";
        resultInString = "";
        operation = "";
        firstNumber = 0.0;
        secondNumber = 0.0;
        isFirstForZero = false;
        isFirst = false;
    }
}
