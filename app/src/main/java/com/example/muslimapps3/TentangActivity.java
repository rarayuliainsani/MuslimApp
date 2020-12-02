package com.example.muslimapps3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class TentangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(TentangActivity.this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
