package com.example.showmodules;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.showmodules.adapters.ModuloAdapter;
import com.example.showmodules.objects.Modulo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Modulo> modulos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        modulos = new ArrayList<>();
        modulos.add(new Modulo("M01","Sistemes informatics","Antonio Limon"));
        modulos.add(new Modulo("M02","Bases de dades","Joan Quintana"));
        modulos.add(new Modulo("M03","Programació","Pere Guitart"));
        modulos.add(new Modulo("M01","Sistemes informatics","Antonio Limon"));

        ModuloAdapter moduloAdapter = new ModuloAdapter(modulos,this);
        RecyclerView recyclerView = findViewById(R.id.modulosAlumn);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(moduloAdapter);
    }
}