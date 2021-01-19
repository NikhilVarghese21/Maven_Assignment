package com.knoldus;


// Calculator for Addition, Subtraction, Multiplication and Division.
public class Calculator {
    public void Add(float operand1, float operand2)
    {
        float result = operand1 + operand2;
        System.out.println(operand1  + " + " + operand2 + " = " + result);
    }
    public void Subtract(float operand1, float operand2)
    {
        float result = operand1 - operand2;
        System.out.println(operand1  + " - " + operand2 + " = " + result);
    }
    public void Multiply(float operand1, float operand2)
    {
        float result = operand1 * operand2;
        System.out.println(operand1  + " * " + operand2 + " = " + result);
    }
    public void Divide(float operand1, float operand2)
    {
        float result = operand1 / operand2;
        System.out.println(operand1  + " / " + operand2 + " = " + result);
    }
}

