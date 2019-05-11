package com.github.calo001.presenters;

import com.github.calo001.interactor.OperationInteractorImpl;
import com.github.calo001.interfaces.OperationInteractor;
import com.github.calo001.interfaces.OperationPresenter;
import com.github.calo001.interfaces.OperationView;

public class OperationPresenterImpl implements OperationPresenter {

    private OperationView operationView;
    private OperationInteractor operationInteractor;

    public OperationPresenterImpl(OperationView operationView) {
        this.operationView = operationView;
        this.operationInteractor = new OperationInteractorImpl(this);
    }

    @Override
    public void showResult(String result) {
        if (operationView != null) {
            operationView.showResult(result);
        }
    }

    @Override
    public void invalidOperation() {
        operationView.invalidOperation();
    }


    @Override
    public void add(int num1, int num2) {
        if (operationInteractor != null) {
            operationInteractor.add(num1, num2);
        }
    }

    @Override
    public void subtract(int num1, int num2) {
        if (operationInteractor != null) {
            operationInteractor.subtract(num1, num2);
        }
    }

    @Override
    public void multiply(int num1, int num2) {
        if (operationInteractor != null) {
            operationInteractor.multiply(num1, num2);
        }
    }

    @Override
    public void divide(int num1, int num2) {
        if (operationInteractor != null) {
            operationInteractor.divide(num1, num2);
        }
    }
}
