package com.example.myapplication;

public class MathOperations {
    public double sum(double num1, double num2){
        return num1+num2;
    }
    public double substraction (double num1, double num2){
        return num1-num2;
    }
    public double divide(double num1, double num2){
        if (num2 != 0)
            return num1/num2;
        else
            return 0;
    }
    public double multiply(double num1, double num2){
        return num1*num2;
    }
    public double sin (double num1){
        return Math.sin(num1);
    }
    public double cos (double num1) {
        return Math.cos(num1);
    }
    public double secondgrade(double num1){
        return Math.pow(num1,2);
    }
    public double justgrade(double num1, double num2){
        return Math.pow(num1,num2);
    }
    public double sqrt(double num1){
        return Math.sqrt(num1);
    }
}
