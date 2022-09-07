package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView_h;
    private TextView textView_w;
    private TextView textView_rs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView_h = findViewById(R.id.editTextTextHeightPerson);
        textView_w = findViewById(R.id.editTextTextPersonName2);
        textView_rs = findViewById(R.id.textView_showResult);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal(Double.parseDouble(textView_w.getText().toString()),Double.parseDouble(textView_h.getText().toString()));
            }
        });
    }
    public void cal(double w, double h) {
        DecimalFormat f = new DecimalFormat("##.00");
        double BMI = w/(h*h/10000);
        if(w<=0 || h<=0){
            textView_rs.setText("Positive numbers only!");
            return;
        }
        if(BMI<18){
            textView_rs.setText("Under Weight");

        } else if (BMI<24.9){
            textView_rs.setText("Normal Weight");

        } else if (BMI<29.9){
            textView_rs.setText("Obese I");

        }else if (BMI<34.9) {
            textView_rs.setText("Obese II");

        } else {
            textView_rs.setText("Obese III");

        }

    }
}