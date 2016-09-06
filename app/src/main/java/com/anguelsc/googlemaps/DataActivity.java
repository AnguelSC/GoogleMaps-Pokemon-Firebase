package com.anguelsc.googlemaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anguelsc.googlemaps.Models.Pokemon;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("pokemons");
        DatabaseReference local = myRef.child("pokemon");
        local.setValue(new Pokemon("Pokemon 2",-6.7715875,-79.8390040));

    }
}
