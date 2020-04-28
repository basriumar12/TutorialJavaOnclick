package com.basbas.tutorialjavaonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class AdminActivity extends AppCompatActivity {
    String username, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        //tangkap data yang dikirim
        username = getIntent().getStringExtra("USERNAME");
        pass = getIntent().getStringExtra("PASS");
        showAlert(username,pass);


    }

    private void showAlert(String username, String pass) {
        AlertDialog.Builder dialog =
                new AlertDialog.Builder(AdminActivity.this);

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
