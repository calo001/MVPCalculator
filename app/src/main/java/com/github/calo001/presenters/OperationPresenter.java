package com.github.calo001.presenters;

import com.github.calo001.interfaces.OperationInterface;
import com.github.calo001.models.Operation;

public class OperationPresenter implements OperationInterface.Presenter {

    private OperationInterface.View view;
    private OperationInterface.Model model;

    public OperationPresenter(OperationInterface.View view) {
        this.view = view;
        this.model = new Operation(this);
    }

    @Override
    public void showResult(String result) {
        if (view != null) {
            view.showResult(result);
        }
    }

    @Override
    public void add(int num1, int num2) {
        if (model != null) {
            model.add(num1, num2);
        }
    }

    @Override
    public void subtract(int num1, int num2) {
        if (model != null) {
            model.subtract(num1, num2);
        }
    }

    @Override
    public void multiply(int num1, int num2) {
        if (model != null) {
            model.multiply(num1, num2);
        }
    }

    @Override
    public void divide(int num1, int num2) {
        if (model != null) {
            model.divide(num1, num2);
        }
    }
}
