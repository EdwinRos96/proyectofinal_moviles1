package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.user.myapplication.ItemsAdapters.*;

import java.util.ArrayList;
import java.util.List;

public class Comtech_ZonaGamer extends AppCompatActivity {
    private ListView listaZonaGamer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_zonagamer);

        listaZonaGamer = (ListView) findViewById(R.id.lvZonaGamer);

        Almacenamiento c1 = new Almacenamiento("Audifonos Gamer","Beats","$35", R.mipmap.audifonosnuevo);
        Almacenamiento c2 = new Almacenamiento("Tarjeta Gráfica NVIDIA","Geforce GTX 960","$350", R.mipmap.graficagaming);
        Almacenamiento c3 = new Almacenamiento("Silla Gamer","DXRacer","$350", R.mipmap.silla);
        Almacenamiento c4 = new Almacenamiento("Tarjeta Madre Gamer","ASRock H110M-HDS","$70", R.mipmap.motherboard);
        Almacenamiento c5 = new Almacenamiento("Memoria RAM 32GB (2x16GB)","HyperX Beast DDR4","$120", R.mipmap.ram2);
        Almacenamiento c6 = new Almacenamiento("Teclado Gamer","Razer 2014","$75", R.mipmap.tecladogamer);


        List<Almacenamiento> listCompus = new ArrayList<Almacenamiento>();
        listCompus.add(c1);
        listCompus.add(c2);
        listCompus.add(c3);
        listCompus.add(c4);
        listCompus.add(c5);
        listCompus.add(c6);

        AdapterZonaGamer adapter = new AdapterZonaGamer(getApplicationContext(), (ArrayList<Almacenamiento>) listCompus);
        listaZonaGamer.setAdapter(adapter);

        listaZonaGamer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                if(position == 0){
                    intent = new Intent(getApplicationContext(),Comt_gam1.class);
                }else{
                    if(position == 1){
                        intent = new Intent(getApplicationContext(), Comt_gam2.class);
                    }else{
                        if(position == 2){
                            intent = new Intent(getApplicationContext(), Comt_gam3.class);
                        }else{
                            if(position == 3){
                                intent = new Intent(getApplicationContext(), Comt_gam4.class);
                            }else{
                                if(position == 4){
                                    intent = new Intent(getApplicationContext(), Comt_gam5.class);
                                }else {
                                    if(position == 5){
                                        intent = new Intent(getApplicationContext(), Comt_gam6.class);
                                    }
                                }
                            }
                        }
                    }
                }

                startActivity(intent);
            }
        });
    }
}
