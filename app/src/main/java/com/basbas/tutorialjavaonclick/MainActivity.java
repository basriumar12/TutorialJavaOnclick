package com.basbas.tutorialjavaonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //buat variabel
    EditText edtHello;
    Button btnClick;
    TextView tvClick, tvHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtHello = findViewById(R.id.edt_hello);
        btnClick = findViewById(R.id.btn_click);
        tvClick = findViewById(R.id.tv_click);
        tvHere = findViewById(R.id.tv_here);

        //onclick pada button
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //apa yang terjadi
                String ambilNilaiEditext = edtHello.getText().toString();

                Toast.makeText(MainActivity.this, "Nilainya adalah "+ambilNilaiEditext,
                        Toast.LENGTH_SHORT).show();

            }
        });

        //onclick pada button
        tvClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //apa yang terjadi
                String ambilNilaiEditext = edtHello.getText().toString();
                tvHere.setText(ambilNilaiEditext);

                Toast.makeText(MainActivity.this, "Nilainya adalah "+ambilNilaiEditext,
                        Toast.LENGTH_SHORT).show();

            }
        });



    }
}
