package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ptb2 extends AppCompatActivity {
    EditText txta,txtb,txtc;
    Button btngiaipt ,btnxoa,btnthoat;
    TextView txtkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptb2);
        txta = (EditText) findViewById(R.id.editTextA);
        txtb = (EditText) findViewById(R.id.editTextB);
        txtc = (EditText) findViewById(R.id.editTextC);
        btnxoa = (Button) findViewById(R.id.btnxoa);
        btngiaipt = (Button) findViewById(R.id.btngiaipt);
        txtkq = (TextView) findViewById(R.id.kq);
        btnthoat =(Button) findViewById(R.id.btnthoat);
        xoa();
        giaipt();
        thoat();
    }
    public void xoa() {
        btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txta.getText().clear();
                txtb.getText().clear();
                txtc.getText().clear();

            }
        });
    }

    public void  giaipt() {
        btngiaipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a  = Double.parseDouble(txta.getText().toString());
                Double b  = Double.parseDouble(txtb.getText().toString());
                Double c  = Double.parseDouble(txtc.getText().toString());
                Double  x1, x2;
                Double delta = (b * b) - (4*a*c);
                if (delta < 0){
                    txtkq.setText("pt vô nghiệp");
                }
                else if(delta == 0 ){
                    x1 = x2  = (-b)/(2*a);
                    txtb.setText("pt co nghiem kep:"+ x1);
                }
                else{
                    x1=(-b + Math.sqrt(delta))/(2*a);
                    x2=(-b - Math.sqrt(delta))/(2*a);
                    txtkq.setText("pt co 2 nghiem :\n x1="+x1+"\n x2="+x2);
                }
            }
        });

    }

    private void thoat() {
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Khoi tao lai Activity main
                Intent intent = new Intent(getApplicationContext(), ptb2.class);
                startActivity(intent);

                // Tao su kien ket thuc app
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startActivity(startMain);
                finish();
            }
        });
    }


}