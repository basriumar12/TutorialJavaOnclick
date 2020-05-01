package com.basbas.tutorialjavaonclick.bottom_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basbas.tutorialjavaonclick.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class BottomDialogActivity extends AppCompatActivity {

    Button btnDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_dialog);

        btnDialog = findViewById(R.id.btn_dialog_bottom);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View dialogView = getLayoutInflater().inflate(R.layout.item_bottom_dialog, null);
                BottomSheetDialog dialog = new BottomSheetDialog(BottomDialogActivity.this);
                dialog.setContentView(dialogView);

                Button btnSimpan = dialogView.findViewById(R.id.btn_simpan_dialog);
                final EditText edtNama = dialogView.findViewById(R.id.edt_nama);
                btnSimpan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(BottomDialogActivity.this,
                                "hasil yang ada di editext "+edtNama.getText().toString(),
                                Toast.LENGTH_SHORT).show();




                    }
                });


                dialog.show();

            }
        });


    }
}
