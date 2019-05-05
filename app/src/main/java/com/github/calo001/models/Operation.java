package com.github.calo001.models;

import com.github.calo001.interfaces.OperationInterface;

public class Operation implements OperationInterface.Model {
    private int result;
    private OperationInterface.Presenter presenter;

    public Operation(OperationInterface.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void add(int num1, int num2) {
        result =  num1 + num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void subtract(int num1, int num2) {
        result = num1 - num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void multiply(int num1, int num2) {
        result = num1 * num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void divide(int num1, int num2) {
        if (num2 > 0) {
            result = num1 / num2;
            presenter.showResult(Integer.toString(result));
        } else {
            presenter.showResult("Invalid numbers");
        }
    }
}
