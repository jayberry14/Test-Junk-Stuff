package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
// TODO some notes ihbibh
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String[] signs = {"X", "/", "+", "-", "^"};
    private int signState = 0;

    public void displayMessage(View view) {
        TextView textView = findViewById(R.id.aboutWolves);
        if(textView.getVisibility() == textView.GONE) {
            textView.setVisibility(textView.VISIBLE);
        }
        else {
            textView.setVisibility(textView.GONE);
        }
    }

    public void flip(View view) {
        Button sign = findViewById(R.id.sign);
        Button calc = findViewById(R.id.calc);
        signState = (signState + 1) % 5;
//        TextView test = findViewById(R.id.test);
//        test.setText("" + signState);
        sign.setText(signs[signState]);

    }

    public void multiply() {
        EditText tmp1 = findViewById(R.id.num1);
        EditText tmp2 = findViewById(R.id.num2);
        float num1 = Float.valueOf(tmp1.getText().toString());
        float num2 = Float.valueOf(tmp2.getText().toString());

        TextView result = findViewById(R.id.result);
        TextView test = findViewById(R.id.test);
        float res = num1 * num2;
//        test.setText("num1: " + num1 + ", num2: " + num2);
        result.setText("" + res);
    }

    public void divide() {
        EditText tmp1 = findViewById(R.id.num1);
        EditText tmp2 = findViewById(R.id.num2);
        float num1 = Float.valueOf(tmp1.getText().toString());
        float num2 = Float.valueOf(tmp2.getText().toString());

        TextView result = findViewById(R.id.result);
        TextView test = findViewById(R.id.test);
        float res = num1 / num2;
//        test.setText("num1: " + num1 + ", num2: " + num2);
        result.setText("" + res);
    }

    public void add() {
        EditText tmp1 = findViewById(R.id.num1);
        EditText tmp2 = findViewById(R.id.num2);
        float num1 = Float.valueOf(tmp1.getText().toString());
        float num2 = Float.valueOf(tmp2.getText().toString());

        TextView result = findViewById(R.id.result);
        TextView test = findViewById(R.id.test);
        float res = num1 + num2;
//        test.setText("num1: " + num1 + ", num2: " + num2);
        result.setText("" + res);
    }

    public void substrate() {
        EditText tmp1 = findViewById(R.id.num1);
        EditText tmp2 = findViewById(R.id.num2);
        float num1 = Float.valueOf(tmp1.getText().toString());
        float num2 = Float.valueOf(tmp2.getText().toString());

        TextView result = findViewById(R.id.result);
        TextView test = findViewById(R.id.test);
        float res = num1 - num2;
//        test.setText("num1: " + num1 + ", num2: " + num2);
        result.setText("" + res);
    }

    public void pow() {
        EditText tmp1 = findViewById(R.id.num1);
        EditText tmp2 = findViewById(R.id.num2);
        double num1 = Double.valueOf(tmp1.getText().toString());
        double num2 = Double.valueOf(tmp2.getText().toString());

        TextView result = findViewById(R.id.result);
        TextView test = findViewById(R.id.test);
        double res = Math.pow(num1, num2);
//        test.setText("num1: " + num1 + ", num2: " + num2);
        result.setText("" + res);
    }

    @Override
    public void onClick(View v) {
        switch (signState) {
            case 0:
                multiply();
                break;
            case 1:
                divide();
                break;
            case 2:
                add();
                break;
            case 3:
                substrate();
                break;
            case 4:
                pow();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.calc).setOnClickListener(this);
    }
}
