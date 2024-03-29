package com.example.paisesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.paisesapp.adapter.PaisesAdapter;
import com.example.paisesapp.interfaces.PaisesListener;
import com.example.paisesapp.model.Pais;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PaisesListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Pais> listaPaises = new ArrayList<>();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setIdioma("Português");
        pais.setQtdHabitantes(200_000_000);
        listaPaises.add(pais);

        Pais pais1 = new Pais();
        pais1.setNome("China");
        pais1.setIdioma("Mandarim");
        pais1.setQtdHabitantes(1_000_000_000);
        listaPaises.add(pais1);

        Pais pais2 = new Pais();
        pais2.setNome("Estados Unidos");
        pais2.setIdioma("Inglês");
        pais2.setQtdHabitantes(300_000_000);
        listaPaises.add(pais2);
        listaPaises.add(pais2);
        listaPaises.add(pais2);
        listaPaises.add(pais2);
        listaPaises.add(pais2);
        listaPaises.add(pais2);
        listaPaises.add(pais2);


        PaisesAdapter paisesAdapter = new PaisesAdapter(listaPaises);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.paises_recycler_view);
        recyclerView.setAdapter(paisesAdapter);
        recyclerView.setLayoutManager(layoutManager);




    }

    @Override
    public void onPaisClicado(Pais pais) {

        Intent intent = new Intent(this, PaisDetalheActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("PAIS", pais);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
