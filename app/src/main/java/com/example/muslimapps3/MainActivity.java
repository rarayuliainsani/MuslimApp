package com.example.muslimapps3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     Button btnRukunIslam, btnRukunIman, btnNamaMalaikat, btnNabi, btnZakat, btnCatatan, btnTentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btnRukunIslam = findViewById(R.id.btnRukunIslam);
         btnRukunIman = findViewById(R.id.btnRukunIman);
         btnNamaMalaikat = findViewById(R.id.btnNamaMalaikat);
         btnNabi =  findViewById(R.id.btnNabi);
         btnZakat = findViewById(R.id.btnZakat);
         btnCatatan = findViewById(R.id.btnCatatan);
         btnTentang =  findViewById(R.id.btnTentang);

        btnNamaMalaikat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListMalaikat.class);
                startActivity(intent);
            }
        });

        btnZakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KalkulatorZakat.class);
                startActivity(intent);
            }
        });

        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(intent);
            }
        });
    }
}
