package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class checkbox extends AppCompatActivity implements View.OnClickListener {
    CheckBox cbA,cbB,cbC;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        cbA = (CheckBox) findViewById(R.id.checkBoxA);
        cbB = (CheckBox) findViewById(R.id.checkBoxB);
        cbC = (CheckBox) findViewById(R.id.checkBoxC);
        btnSubmit = (Button) findViewById(R.id.button);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String item = "bạn đã chọn : \n";
        if (cbA.isChecked()){
            item +=cbA.getText()+"\n";
        }
        if(cbB.isChecked()){
            item += cbB.getText()+"\n";
        }
        if(cbC.isChecked()){
            item += cbC.getText()+"\n";
        }
        Toast.makeText(checkbox.this,item,Toast.LENGTH_LONG).show();
    }
}