package com.example.codetride.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView display = (TextView) findViewById(R.id.display);

        Intent intent = getIntent();
        ContactRecycler contactRecycler = (ContactRecycler) intent.getSerializableExtra("Hola");
        display.setText("\n"+contactRecycler.getName());
        display.append("\n\n"+contactRecycler.getSurname());
        display.append("\n\n"+contactRecycler.getPhone());
        display.append("\n\n"+contactRecycler.getGender());
        display.append("\n\n"+contactRecycler.getEmail());
        display.append("\n\n"+contactRecycler.getHeight());
        display.append("\n\n"+contactRecycler.getWeight());
    }
}
