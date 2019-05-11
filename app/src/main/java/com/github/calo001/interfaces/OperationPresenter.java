package com.github.calo001.interfaces;

public interface OperationPresenter {
    void showResult(String result);
    void invalidOperation();
    void add(int num1, int num2);
    void subtract(int num1, int num2);
    void multiply(int num1, int num2);
    void divide(int num1, int num2);
}
