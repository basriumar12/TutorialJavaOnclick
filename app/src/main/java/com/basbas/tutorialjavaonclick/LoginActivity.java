package com.basbas.tutorialjavaonclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsername, edtPass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        loginLogic();
    }

    private void initView() {
        edtPass = findViewById(R.id.edt_pass);
        edtUsername = findViewById(R.id.edt_username);
        btnLogin = findViewById(R.id.btn_login);
    }

    private void loginLogic() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validasi
                String username = edtUsername.getText().toString();
                String pass = edtPass.getText().toString();

                if (username.isEmpty()){
                    edtUsername.setError("Data tidak bisa kosong");
                }
                else if (pass.isEmpty()){
                    edtPass.setError("Data tidak bisa kosong");
                } else {
                    if (username.equals("admin") && pass.equals("12345")){
                        Toast.makeText(LoginActivity.this, "Berhasil Login",
                                Toast.LENGTH_SHORT).show();
                        
                    } else{
                        Toast.makeText(LoginActivity.this, "Gagal Login",
                                Toast.LENGTH_SHORT).show();
                    }


                }


            }
        });


    }




}
