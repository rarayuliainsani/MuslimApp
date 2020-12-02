package com.example.muslimapps3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListMalaikat extends AppCompatActivity {

    String[] malaikat = new String[]{"Malaikat Jibril", "Malaikat Mikail", "Malaikat Israfil", "Malaikat Izrail", "Malaikat Munkar",
            "Malaikat Nakir", "Malaikat Rakib", "Malaikat Atid", "Malaikat Malik", "Malaikat Ridwan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_malaikat);


        ListView listView = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListMalaikat.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, malaikat);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListMalaikat.this, "Memilih " + malaikat[i], Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ListMalaikat.this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
