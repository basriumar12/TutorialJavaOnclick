package com.basbas.tutorialjavaonclick.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.basbas.tutorialjavaonclick.R;
import com.google.android.material.snackbar.Snackbar;

public class SpinnerActivity extends AppCompatActivity {

    String nama [] = {"Basri Umar","Lukman","Andri"};
    Spinner spinnerNama;
    TextView tvSelect;
    LinearLayout rootLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinnerNama = findViewById(R.id.spinner_nama);
        tvSelect = findViewById(R.id.tv_select);
        rootLayout = findViewById(R.id.root_layout);


        //buat variabel adapter
        ArrayAdapter adapter =
                new ArrayAdapter(SpinnerActivity.this,
                        android.R.layout.simple_spinner_item,nama);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNama.setAdapter(adapter);

        spinnerNama.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tvSelect.setText(nama[position].toString());
                //snackbar
                Snackbar.make(rootLayout,"Pilih item "+nama[position],Snackbar.LENGTH_LONG).show();




            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}
