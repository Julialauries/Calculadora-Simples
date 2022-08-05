package com.example.calculadora_simples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean isNewOp = true;
    EditText ed1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if(isNewOp)
            ed1.setText("");
        isNewOp = false;
        String number = ed1.getText().toString();
        switch (view.getId()) {

            case R.id.bu1:
                number +=  "1";
                break;

            case R.id.bu2:
                number +=  "2";
                break;

            case R.id.bu3:
                number +=  "3";
                break;

            case R.id.bu4:
                number +=  "4";
                break;

            case R.id.bu5:
                number +=  "5";
                break;

            case R.id.bu6:
                number +=  "6";
                break;

            case R.id.bu7:
                number +=  "7";
                break;

            case R.id.bu8:
                number +=  "8";
                break;

            case R.id.bu9:
                number +=  "9";
                break;

            case R.id.bu0:
                number +=  "0";
                break;

            case R.id.buComma:
                number +=  ".";
                break;
        }

        ed1.setText(number);


    }

    public void convertEvent(View view) {

        ed1 editDolar;

        Double valorDolar = Double.parseDouble(ed1.getText().toString());

        Double valorConvertido = valorDolar * 4.68;

          ed1.setText("$" + valorConvertido);


    }


   public void resetEvent(View view) {
        ed1.setText("0");
        isNewOp = true;
    }


}