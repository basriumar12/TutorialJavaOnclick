package com.basbas.tutorialjavaonclick;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
                        //mengirim data menggunakan intent
                        Intent ngirimData = new Intent(LoginActivity.this,
                                AdminActivity.class);
                        //isi data yang dikirim
                        ngirimData.putExtra("USERNAME", username);
                        ngirimData.putExtra("PASS", pass);
                        startActivity(ngirimData);




                       // showAlert(username,pass);

                    } else{
                        Toast.makeText(LoginActivity.this, "Gagal Login",
                                Toast.LENGTH_SHORT).show();
                    }


                }


            }
        });


    }

    private void showAlert(String username, String pass) {
        AlertDialog.Builder dialog =
                new AlertDialog.Builder(LoginActivity.this);

        dialog.setTitle("Berhasil Login");
        dialog.setMessage("Anda Berhasil Login dengan Username :"+username +" Pass :"+pass);
        dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //di isi ketika user klik no
            }
        });

        dialog.show();


    }


}
