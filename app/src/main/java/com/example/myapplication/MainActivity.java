package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    ArrayList<String> nomes;

    PlanetaController planetaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.idListView);
        planetaController = new PlanetaController();
        PlanetaAdapter adapter = new PlanetaAdapter(this,
                R.layout.item_lista,
                planetaController.getPlanetas());
        listView.setAdapter(adapter);
    }
}