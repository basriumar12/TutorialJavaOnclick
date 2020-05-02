package com.basbas.tutorialjavaonclick.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.basbas.tutorialjavaonclick.R;

public class RegisterActivity extends AppCompatActivity {

    EditText edtUsername, edtEmail, edtPass, edtRepass;
    TextView tvRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //inisialisasi id
        edtEmail = findViewById(R.id.edt_email);
        edtUsername = findViewById(R.id.edt_username);
        edtPass = findViewById(R.id.edt_pass);
        edtRepass = findViewById(R.id.edt_repass);
        tvRegister = findViewById(R.id.tv_register);

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edtUsername.getText().toString();
                String email = edtUsername.getText().toString();
                String pass = edtUsername.getText().toString();
                String rePass = edtUsername.getText().toString();

                if (userName.isEmpty()){
                    edtUsername.setError("Data tidak bisa kosong");
                }
                else if (email.isEmpty()){
                    edtEmail.setError("Data tidak bisa kosong");
                }                else if (pass.isEmpty()){
                    edtPass.setError("Data tidak bisa kosong");
                }                else if (rePass.isEmpty()){
                    edtRepass.setError("Data tidak bisa kosong");
                } else {

                    Toast.makeText(RegisterActivity.this,
                            "Berhasil Register dengan username "+userName, Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
