package com.github.calo001.interactor;

import com.github.calo001.interfaces.OperationInteractor;
import com.github.calo001.interfaces.OperationPresenter;

public class OperationInteractorImpl implements OperationInteractor {
    private int result;
    private OperationPresenter presenter;

    public OperationInteractorImpl(OperationPresenter operationPresenter) {
        this.presenter = operationPresenter;
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
        if (num2 == 0) {
            result = num1 / num2;
            presenter.showResult(Integer.toString(result));
        } else {
            presenter.invalidOperation();
        }
    }
}
