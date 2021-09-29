package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_login extends AppCompatActivity {
// bước 1 khai báo
    EditText txtUsername, txtPassword;
    Button btnLogin,btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // bước 2 ánh xạ từ xml sang java
  txtUsername=(EditText) findViewById(R.id.editText_Username);
  txtPassword=(EditText) findViewById(R.id.editText_Password);
  btnLogin=(Button) findViewById(R.id.btn_Login);
  btnCancel=(Button) findViewById(R.id.btn_Cancel);
    }
}