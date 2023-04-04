package com.example.loginscreen_v20;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.loginscreen_v20.databinding.ActivityListaBinding;

import java.util.ArrayList;
import java.util.List;

public class lista extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        ListView listView = findViewById(R.id.listview);
        List<String> list = new ArrayList<>();

        list.add("4 Manzanas");
        list.add("1kg de Arroz");
        list.add("1/4 kg de mortadela");
        list.add("3 Cebollas");
        list.add("4 cebollines");
        list.add("4 bolsas de Ñoquis");
        list.add("400 grs. de carne picada");
        list.add("2 tarros de Leche condensada :b");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
    }

    }