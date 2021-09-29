package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tinhgiaithua extends AppCompatActivity {
//khai báo
    TextView txtKqua;
    EditText txtNhap;
    Button btnTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinhgiaithua);

        // ánh xạ
        txtKqua=(TextView) findViewById(R.id.textViewKqua);
    }
}