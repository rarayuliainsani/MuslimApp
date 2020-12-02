package com.example.muslimapps3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KalkulatorZakat extends AppCompatActivity {

    EditText harga;
    TextView hasil;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_zakat);

        harga = findViewById(R.id.editHarga);
        hasil = findViewById(R.id.txtHasil);
        submit = findViewById(R.id.btnHitung);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(harga.getText().length() > 0){

                    double hargaBeras = Double.parseDouble(harga.getText().toString());
                    double zakat = hargaBeras * 2.5;

                    hasil.setText(Double.toString(zakat));

                }else{
                    Toast toast = Toast.makeText(KalkulatorZakat.this,"Mohon Masukkan harga beras",Toast.LENGTH_LONG);
                    toast.show();

                }


            }

        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(KalkulatorZakat.this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
