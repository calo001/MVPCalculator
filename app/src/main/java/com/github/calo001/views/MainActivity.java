package com.github.calo001.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.github.calo001.R;
import com.github.calo001.interfaces.OperationInterface;
import com.github.calo001.presenters.OperationPresenter;

public class MainActivity extends AppCompatActivity implements OperationInterface.View {

    private EditText number1;
    private EditText number2;
    private TextView txtResult;
    private OperationInterface.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.txtNumber1);
        number2 = findViewById(R.id.txtNumber2);
        txtResult = findViewById(R.id.txtResult);
        presenter = new OperationPresenter(this);
    }

    public void doAdd(View view) {
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        presenter.add(num1, num2);
    }

    public void doSubtract(View view) {
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        presenter.subtract(num1, num2);
    }

    public void doMultiply(View view) {
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        presenter.multiply(num1, num2);
    }

    public void doDivide(View view) {
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        presenter.divide(num1, num2);
    }

    @Override
    public void showResult(String result) {
        txtResult.setText(result);
    }
}
