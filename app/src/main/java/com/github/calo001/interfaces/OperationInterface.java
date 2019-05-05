package com.github.calo001.interfaces;

public interface OperationInterface {
    interface View {
        void showResult(String result);
    }

    interface Presenter {
        void showResult(String result);
        void add(int num1, int num2);
        void subtract(int num1, int num2);
        void multiply(int num1, int num2);
        void divide(int num1, int num2);
    }

    interface Model {
        void add(int num1, int num2);
        void subtract(int num1, int num2);
        void multiply(int num1, int num2);
        void divide(int num1, int num2);
    }
}
