package com.app.booking13;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Countries> country = new ArrayList<Countries>();
        Countries country1 = new Countries("SAR", "Saudi riyal");
        Countries country2 = new Countries("ILS", "Sheqel");
        Countries country3 = new Countries("EUR", "European Erue");
        Countries country4 = new Countries("SAR", "Saudi riyal");
        Countries country5 = new Countries("ILS", "Sheqel");
        Countries country6 = new Countries("EUR", "European Erue");
        Countries country7 = new Countries("SAR", "Saudi riyal");
        Countries country8 = new Countries("ILS", "Sheqel");
        Countries country9 = new Countries("EUR", "European Erue");
        Countries country10 = new Countries("SAR", "Saudi riyal");
        Countries country11 = new Countries("ILS", "Sheqel");
        Countries country12 = new Countries("EUR", "European Erue");

        country.add(country1);
        country.add(country2);
        country.add(country3);
        country.add(country4);
        country.add(country5);
        country.add(country6);
        country.add(country7);
        country.add(country8);
        country.add(country9);
        country.add(country10);
        country.add(country11);
        country.add(country12);


        RecyclerView rv = (RecyclerView) findViewById(R.id.recycleview);




        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true);


        final MyAdapter adapter = new MyAdapter(getApplicationContext(), country, new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Countries item) {
                Toast.makeText(Main.this, "click", Toast.LENGTH_SHORT).show();
            }
        });
        rv.setAdapter(adapter);

    }
}
