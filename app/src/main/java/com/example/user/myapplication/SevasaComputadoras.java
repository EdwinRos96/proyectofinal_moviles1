package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.user.myapplication.ItemsAdapters.*;

import java.util.ArrayList;
import java.util.List;

public class SevasaComputadoras extends AppCompatActivity {
    private ListView listaCompus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sevasa_computadoras);

        listaCompus = (ListView) findViewById(R.id.lvCompus);

        Computadoras c1 = new Computadoras("Toshiba", "INTEL Core-i7", "8GB RAM", "Precio: $900", R.mipmap.laptop);
        Computadoras c2 = new Computadoras("MAC", "Intel Core-i7", "8GB RAM", "Precio: $1600", R.mipmap.mac);
        Computadoras c3 = new Computadoras("Dell", "Intel Core-i5", "8GB RAM", "Precio: $1250", R.mipmap.escritorio);
        Computadoras c4 = new Computadoras("Toshiba", "Intel Core-i7", "8GB RAM", "Precio: $1000", R.mipmap.compusevasa4);
        Computadoras c5 = new Computadoras("Waio", "Intel Core-i5", "8GB RAM", "Precio: $800", R.mipmap.compusevasa5);
        Computadoras c6 = new Computadoras("Dell", "Intel Core-i7", "4GB RAM", "Precio: $700", R.mipmap.compudell6);


        List<Computadoras> listCompus = new ArrayList<Computadoras>();
        listCompus.add(c1);
        listCompus.add(c2);
        listCompus.add(c3);
        listCompus.add(c4);
        listCompus.add(c5);
        listCompus.add(c6);


        AdapterSevasaCompus adapter = new AdapterSevasaCompus(getApplicationContext(), (ArrayList<Computadoras>) listCompus);
        listaCompus.setAdapter(adapter);

        listaCompus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                if(position == 0){
                    intent = new Intent(getApplicationContext(),Sevasa_compu1.class);
                }else{
                    if(position == 1){
                        intent = new Intent(getApplicationContext(), Sevasa_compu2.class);
                    }else{
                        if(position == 2){
                            intent = new Intent(getApplicationContext(), Sevasa_compu3.class);
                        }else{
                            if(position == 3){
                                intent = new Intent(getApplicationContext(), Sevasa_compu4.class);
                            }else{
                                if(position == 4){
                                    intent = new Intent(getApplicationContext(), Sevasa_compu5.class);
                                }else {
                                    if(position == 5){
                                        intent = new Intent(getApplicationContext(), Sevasa_compu6.class);
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