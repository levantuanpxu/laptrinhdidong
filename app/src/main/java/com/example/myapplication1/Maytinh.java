package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Maytinh extends AppCompatActivity  {
//khai bao
    EditText txtNhapA, txtNhapB;
    Button btncong,btntru,btnnhan,btnchia;
    TextView txvKetQua;
    Double a, b ,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maytinh);
        // ánh xạ
        txtNhapA = (EditText) findViewById(R.id.editTextNhapA);
        txtNhapB = (EditText) findViewById(R.id.editTextNhapB);
        txvKetQua = (TextView) findViewById(R.id.textViewKetQua);
        btncong = (Button) findViewById(R.id.cong);
        btntru = (Button) findViewById(R.id.tru);
        btnnhan = (Button) findViewById(R.id.nhan);
        btnchia = (Button) findViewById(R.id.chia);
        Tong();
        Hieu();
        Tich();
        Thuong();
    }
    public void Tong () {
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(txtNhapA.getText().toString());
                b = Double.parseDouble(txtNhapB.getText().toString());
                res = a + b;
                txvKetQua.setText(res.toString());
            }
        });
    }
    public void Hieu () {
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(txtNhapA.getText().toString());
                b = Double.parseDouble(txtNhapB.getText().toString());
                res = a - b;
                txvKetQua.setText(res.toString());
            }
        });
    }
    public void Tich () {
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(txtNhapA.getText().toString());
                b = Double.parseDouble(txtNhapB.getText().toString());
                res = a * b;
                txvKetQua.setText(res.toString());
            }
        });
    }
    public void Thuong () {
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(txtNhapA.getText().toString());
                b = Double.parseDouble(txtNhapB.getText().toString());
                res = a / b;
                txvKetQua.setText(res.toString());
            }
        });
    }

}