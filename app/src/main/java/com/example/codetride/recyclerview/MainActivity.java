package com.example.codetride.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerAdapter recyclerAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<ContactRecycler> contactRecyclers = new ArrayList<>();

        ContactRecycler contactRecycler = new ContactRecycler();

        contactRecycler.setName("Themba");
        contactRecycler.setSurname("Khoza");
        contactRecycler.setEmail("T.khoza7@Gmail.com");
        contactRecycler.setPhone("0717910433");
        contactRecycler.setGender("Male");
        contactRecycler.setHeight("122");
        contactRecycler.setWeight("170");

        ContactRecycler contactRecycler1 = new ContactRecycler();

        contactRecycler1.setName("Khetsiwe");
        contactRecycler1.setSurname("Mbebe");
        contactRecycler1.setEmail("Anna@Gmail.com");
        contactRecycler1.setPhone("0799043432");
        contactRecycler1.setGender("Female");
        contactRecycler1.setHeight("112");
        contactRecycler1.setWeight("150");

        contactRecyclers.add(contactRecycler);

        contactRecyclers.add(contactRecycler1);

        recyclerAdapter = new RecyclerAdapter(this,contactRecyclers);

        recyclerView.setAdapter(recyclerAdapter);
    }
}
