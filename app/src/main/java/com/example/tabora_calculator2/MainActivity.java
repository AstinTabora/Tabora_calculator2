package com.example.tabora_calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView text1, result;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Button del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.txtNum1);
        number2 = findViewById(R.id.txtNum2);
        text1 = findViewById(R.id.text1);
        result = findViewById(R.id.textresult);
        add = findViewById(R.id.btnadd);
        subtract = findViewById(R.id.btnsubtract);
        multiply = findViewById(R.id.btnmultiply);
        divide = findViewById(R.id.btndivide);
        del = findViewById(R.id.btndel);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(number1.getText().toString());
                double num2=Double.parseDouble(number2.getText().toString());
                double sum=num1+num2;
                result.setText(String.valueOf(sum));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(number1.getText().toString());
                double num2=Double.parseDouble(number2.getText().toString());
                double difference=num1-num2;
                result.setText(String.valueOf(difference));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double product = num1 * num2;
                result.setText(String.valueOf(product));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double quotient = num1/num2;
                result.setText(String.valueOf(quotient));
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1.setText(" ");
                number2.setText(" ");
            }
        });

    }
}