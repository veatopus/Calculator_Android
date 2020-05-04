package com.example.calculator_android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int counter = 1;
    TextView textViewForPanel;
    TextView textViewForMemory;
    Double firstNumber, secondNumber;
    String intermediateNumber = "0";
    String operation, resultInString = "";
    double intermediateResult = 0;
    boolean isFirst, resetAfterOperation, isFirstForZero = false;
    boolean isFirstForDot = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewForPanel = findViewById(R.id.text);
        textViewForMemory = findViewById(R.id.textMemory);
        clear();

        if (savedInstanceState != null) {
            intermediateNumber = savedInstanceState.getString("intermediateNumber");
            resultInString = savedInstanceState.getString("resultInString");
            operation = savedInstanceState.getString("operation");
            firstNumber = savedInstanceState.getDouble("firstNumber");
            secondNumber = savedInstanceState.getDouble("secondNumber");
            counter = savedInstanceState.getInt("counter");
            isFirstForZero = savedInstanceState.getBoolean("isFirstForZero");
            isFirst = savedInstanceState.getBoolean("isFirst");
            isFirstForDot = savedInstanceState.getBoolean("isFirstForDot");
        }

    }

    @SuppressLint("SetTextI18n")
    public void tappingNumber(View view) {
        if (intermediateNumber.equals("0"))
            isFirstForZero = false;
        if (counter <= 9) {
            if (resetAfterOperation) {
                textViewForMemory.setText("=" + resultInString);
                resultInString = "";
                textViewForPanel.setText("");
                resetAfterOperation = !resetAfterOperation;
            }
            switch (view.getId()) {
                case R.id.button0:
                    if (isFirstForZero) {
                        textViewForPanel.append("0");
                        intermediateNumber += "0";
                        counter++;
                        isFirst = true;
                    }
                    break;
                case R.id.button1:
                    if (counter == 1) {
                        textViewForPanel.setText("1");
                        intermediateNumber = "1";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("1");
                        intermediateNumber += "1";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.button2:
                    if (counter == 1) {
                        textViewForPanel.setText("2");
                        intermediateNumber = "2";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("2");
                        intermediateNumber += "2";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.button3:
                    if (counter == 1) {
                        textViewForPanel.setText("3");
                        intermediateNumber = "3";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("3");
                        intermediateNumber += "3";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.button4:
                    if (counter == 1) {
                        textViewForPanel.setText("4");
                        intermediateNumber = "4";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("4");
                        intermediateNumber += "4";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.button5:
                    if (counter == 1) {
                        textViewForPanel.setText("5");
                        intermediateNumber = "5";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("5");
                        intermediateNumber += "5";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.button6:
                    if (counter == 1) {
                        textViewForPanel.setText("6");
                        intermediateNumber = "6";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("6");
                        intermediateNumber += "6";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.button7:
                    if (counter == 1) {
                        textViewForPanel.setText("7");
                        intermediateNumber = "7";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("7");
                        intermediateNumber += "7";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.button8:
                    if (counter == 1) {
                        textViewForPanel.setText("8");
                        intermediateNumber = "8";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("8");
                        intermediateNumber += "8";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.button9:
                    if (counter == 1) {
                        textViewForPanel.setText("9");
                        intermediateNumber = "9";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("9");
                        intermediateNumber += "9";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.dot:
                    if (counter == 1) {
                        isFirstForDot = true;
                        isFirst = true;
                        counter++;
                    }
                    if (isFirst && isFirstForDot) {
                        textViewForPanel.append(".");
                        intermediateNumber += ".";
                        isFirst = false;
                        isFirstForDot = false;
                        isFirstForZero = true;
                    }
                    break;
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void tappingLogic(View view) {
        switch (view.getId()) {
            case R.id.button_addition:
                if (isFirst) {
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;
                    counter = 1;
                    operation = "+";
                    textViewForMemory.setText(intermediateNumber + operation);
                    textViewForPanel.setText("0");
                    intermediateNumber = "0";
                    isFirstForDot = true;
                }
                break;

            case R.id.button_subtraction:
                if (isFirst) {
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;
                    counter = 1;
                    operation = "-";
                    textViewForMemory.setText(intermediateNumber + operation);
                    textViewForPanel.setText("0");
                    intermediateNumber = "0";
                    isFirstForDot = true;
                }
                break;

            case R.id.button_multiplication:
                if (isFirst) {
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;
                    counter = 1;
                    operation = "*";
                    textViewForMemory.setText(intermediateNumber + operation);
                    textViewForPanel.setText("0");
                    intermediateNumber = "0";
                    isFirstForDot = true;
                }
                break;

            case R.id.button_division:
                if (isFirst) {
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;
                    counter = 1;
                    operation = "/";
                    textViewForMemory.setText(intermediateNumber + operation);
                    textViewForPanel.setText("0");
                    intermediateNumber = "0";
                    isFirstForDot = true;
                }
                break;

            case R.id.back:
                intermediateNumber = "0";
                isFirstForDot = true;
                counter = 1;
                textViewForPanel.setText(intermediateNumber);
                break;

            case R.id.clear:
                clear();
                textViewForPanel.setText("0");
                textViewForMemory.setText("");
                break;

            case R.id.button_equals:
                if (!operation.equals("")) {
                    textViewForMemory.setText(operation + intermediateNumber);
                    if (!operation.equals("")) {
                        secondNumber = Double.valueOf(intermediateNumber);
                        textViewForPanel.setText("");
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
                        textViewForPanel.setText(resultInString);
                        clear();

                    }
                }
                break;
        }

    }

    public void clear() {
        intermediateNumber = "0";
        operation = "";
        firstNumber = 0.0;
        secondNumber = 0.0;
        isFirstForZero = false;
        isFirst = false;
        isFirstForDot = true;
        counter = 1;
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("intermediateNumber", intermediateNumber);
        outState.putString("resultInString", resultInString);
        outState.putString("operation", operation);
        outState.putDouble("firstNumber", firstNumber);
        outState.putDouble("secondNumber", secondNumber);
        outState.putBoolean("isFirstForZero", isFirstForZero);
        outState.putBoolean("isFirst", isFirst);
        outState.putBoolean("isFirstForDot", isFirstForDot);
        outState.putInt("counter", counter);
    }
}
