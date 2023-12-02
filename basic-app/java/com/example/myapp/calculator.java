package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp.R;

public class calculator extends AppCompatActivity {

    private EditText calculatorResultEditText;
    private StringBuilder currentInput;
    private double result;
    private String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        calculatorResultEditText = findViewById(R.id.calculatorResultTextView);
        currentInput = new StringBuilder();
        result = 0;
        operator = "";

        // Initialize button click listeners
        initializeButtons();
    }

    private void initializeButtons() {
        // Numeric buttons
        for (int i = 0; i <= 9; i++) {
            int resID = getResources().getIdentifier("button_" + i, "id", getPackageName());
            Button button = findViewById(resID);
            int finalI = i;
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onNumberClick(finalI);
                }
            });
        }

        // Operator buttons
        Button buttonAdd = findViewById(R.id.button_add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorClick("+");
            }
        });

        Button buttonSubtract = findViewById(R.id.button_subtract);
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorClick("-");
            }
        });

        Button buttonMultiply = findViewById(R.id.button_multiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorClick("*");
            }
        });

        Button buttonDivide = findViewById(R.id.button_divide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorClick("/");
            }
        });

        // Clear button
        Button buttonClear = findViewById(R.id.button_clear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearCalculator();
            }
        });

        // Equal button
        Button buttonEqual = findViewById(R.id.button_equal);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });
    }

    private void onNumberClick(int number) {
        currentInput.append(number);
        updateCalculatorDisplay();
    }

    private void onOperatorClick(String newOperator) {
        if (!currentInput.toString().isEmpty()) {
            if (!operator.isEmpty()) {
                calculateResult();
                operator = newOperator;
                currentInput.append(" " + operator + " ");
                updateCalculatorDisplay();
            } else {
                operator = newOperator;
                currentInput.append(" " + operator + " ");
                updateCalculatorDisplay();
            }
        }
    }

    private void clearCalculator() {
        currentInput.setLength(0);
        result = 0;
        operator = "";
        updateCalculatorDisplay();
    }

    private void calculateResult() {
        if (!currentInput.toString().isEmpty()) {
            String inputText = currentInput.toString();
            String[] parts = inputText.split(" ");
            if (parts.length == 3) {
                double leftOperand = Double.parseDouble(parts[0]);
                double rightOperand = Double.parseDouble(parts[2]);
                double tempResult = 0;

                if (parts[1].equals("+")) {
                    tempResult = leftOperand + rightOperand;
                } else if (parts[1].equals("-")) {
                    tempResult = leftOperand - rightOperand;
                } else if (parts[1].equals("*")) {
                    tempResult = leftOperand * rightOperand;
                } else if (parts[1].equals("/")) {
                    if (rightOperand != 0) {
                        tempResult = leftOperand / rightOperand;
                    } else {
                        // Handle division by zero
                        clearCalculator();
                    }
                }

                // Update the result and clear the current input
                result = tempResult;
                currentInput.setLength(0);
                currentInput.append(result);
                updateCalculatorDisplay();
                operator = "";
            }
        }
    }


    private void updateCalculatorDisplay() {
        calculatorResultEditText.setText(currentInput);
    }
}