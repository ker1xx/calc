package com.example.myapplication;

import static java.lang.Double.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private MathOperations cOps;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num0;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private Button dot;
    private Button allclear;
    private Button clear;
    private Button equal;
    private Button sin;
    private Button cos;
    private Button secondgrade;
    private Button justgrade;
    private Button sqrt;
    private double number1=0;
    private double number2=0;
    private TextView Text;
    private String Digit;
    private String oldText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Text = (TextView) findViewById(R.id.Text);
        num1 =(Button)findViewById(R.id.num1);
        num0 =(Button)findViewById(R.id.num0);
        num2 =(Button)findViewById(R.id.num2);
        num3 =(Button)findViewById(R.id.num3);
        num4 =(Button)findViewById(R.id.num4);
        num5 =(Button)findViewById(R.id.num5);
        num6 =(Button)findViewById(R.id.num6);
        num7 =(Button)findViewById(R.id.num7);
        num8 =(Button)findViewById(R.id.num8);
        num9 =(Button)findViewById(R.id.num9);
        allclear =(Button)findViewById(R.id.allclear);
        minus =(Button)findViewById(R.id.button12);
        sin =(Button)findViewById(R.id.sin);
        justgrade =(Button)findViewById(R.id.setgrade);
        equal =(Button)findViewById(R.id.equal);
        cos =(Button)findViewById(R.id.cos);
        clear =(Button)findViewById(R.id.clear);
        secondgrade =(Button)findViewById(R.id.sqr);
        sqrt =(Button)findViewById(R.id.sqrt);
        dot =(Button)findViewById(R.id.dot);
        plus =(Button)findViewById(R.id.button16);
        multiply =(Button)findViewById(R.id.multiply);
        divide =(Button)findViewById(R.id.division);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText = Text.getText().toString();
                Text.setText(oldText+"1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText = Text.getText().toString();
                Text.setText(oldText+"2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText = Text.getText().toString();
                Text.setText(oldText+"3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText = Text.getText().toString();
                Text.setText(oldText+"4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText = Text.getText().toString();
                Text.setText(oldText+"5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText = Text.getText().toString();
                Text.setText(oldText+"6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText = Text.getText().toString();
                Text.setText(oldText+"7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText = Text.getText().toString();
                Text.setText(oldText+"8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText = Text.getText().toString();
                Text.setText(oldText+"9");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText = Text.getText().toString();
                Text.setText(oldText+"0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText("");
                number1 = Double.parseDouble(oldText);
                oldText="";
                Digit = "+";
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText("");
                number1 = Double.parseDouble(oldText);
                oldText="";
                Digit = "-";
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText("");
                number1 = Double.parseDouble(oldText);
                oldText="";
                Digit = "*";
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText("");
                number1 = Double.parseDouble(oldText);
                oldText="";
                Digit = "/";
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText = Text.getText().toString();
                Text.setText(oldText+".");
            }
        });
        allclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = 0;
                oldText = "";
                Text.setText("");

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldText="";
                Text.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Double.parseDouble((String) Text.getText());
                if (number1 != 0 && number2 != 0) {
                    if (Objects.equals(Digit, "+"))
                        Text.setText((int) cOps.sum(number1, number2));
                    else if (Objects.equals(Digit, "-"))
                        Text.setText((int) cOps.substraction(number1, number2));
                    else if (Objects.equals(Digit, "*"))
                        Text.setText((int) cOps.multiply(number1, number2));
                    else if (Objects.equals(Digit, "/"))
                        Text.setText((int) cOps.divide(number1, number2));
                    else if (Objects.equals(Digit, "^"))
                        Text.setText((int) cOps.justgrade(number1,number2));
                }
            }
        });
        secondgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble((String)Text.getText());
                Text.setText("");
                number1 = Double.parseDouble(oldText);
                Text.setText((int)cOps.secondgrade(number1));
                oldText="";
            }
        });
        justgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Double.parseDouble((String)Text.getText());
                Text.setText("");
                number1 = Double.parseDouble(oldText);
                Text.setText((int)cOps.justgrade(number1,number2));
                oldText="";
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble((String)Text.getText());
                Text.setText("");
                Text.setText((int)cOps.sin(number1));
                oldText="";
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble((String)Text.getText());
                Text.setText("");
                Text.setText((int)cOps.cos(number1));
                oldText="";
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble((String)Text.getText());
                Text.setText("");
                Text.setText((int)cOps.sqrt(number1));
                oldText="";
            }
        });

    }


}