package com.basbas.tutorialjavaonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ValidasiActivity extends AppCompatActivity {


    //buat variabel global
    EditText edtNama, edtKelamin, edtAlamat;
    Button btnSimpan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validasi);
        //inisialisasi

        edtAlamat = findViewById(R.id.edt_alamat);
        edtKelamin = findViewById(R.id.edt_kelamin);
        edtNama = findViewById(R.id.edt_nama);
        btnSimpan = findViewById(R.id.btn_simpan);

        //buat validasi
        validasi();

    }

    private void validasi() {
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtAlamat.getText().toString().isEmpty() ||
                        edtKelamin.getText().toString().isEmpty() ||
                        edtNama.getText().toString().isEmpty()) {

                    Toast.makeText(ValidasiActivity.this, "Editext tidak bisa kosong",
                            Toast.LENGTH_SHORT).show();
                } else {

                    String nama = edtNama.getText().toString();
                    String alamat = edtAlamat.getText().toString();
                    String kelamin = edtKelamin.getText().toString();
                    Toast.makeText(ValidasiActivity.this, "Hasil data Nama :"
                            +nama +" Alamat :"+alamat +"Jenis Kelamin "+kelamin
                            ,

                            Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
