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

public class ComtechComputadoras extends AppCompatActivity {
    private ListView listaCompus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comtech_computadoras);


        listaCompus = (ListView) findViewById(R.id.lvComPC);

        Computadoras c1 = new Computadoras("HDD: 500 GB","INTEL Core-i5", "RAM: 4 GB","$420", R.mipmap.compuazul);
        Computadoras c2 = new Computadoras("HDD: 1 TB","INTEL Core-i7", "RAM: 8 GB","$720",R.mipmap.compucomtech1);
        Computadoras c3 = new Computadoras("HDD: 750 GB","INTEL Core-i3", "RAM: 6 GB","$800",R.mipmap.compucomtech2);
        Computadoras c4 = new Computadoras("Iphone 5S", "Cámara 8MP","1GB RAM","$550",R.mipmap.cel1);
        Computadoras c5 = new Computadoras("Samsung Galaxy E7","Camara 13MP","2GB RAM","$470",R.mipmap.cel2);
        Computadoras c6 = new Computadoras("Samsung Galaxy Grand Prime","Cámara 8MP","2GB RAM","$500",R.mipmap.cel3);


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
                    intent = new Intent(getApplicationContext(),Comt_compu1.class);
                }else{
                    if(position == 1){
                        intent = new Intent(getApplicationContext(), Comt_compu2.class);
                    }else{
                        if(position == 2){
                            intent = new Intent(getApplicationContext(), Comt_compu3.class);
                        }else{
                            if(position == 3){
                                intent = new Intent(getApplicationContext(), Comt_compu4.class);
                            }else{
                                if(position == 4){
                                    intent = new Intent(getApplicationContext(), Comt_compu5.class);
                                }else {
                                    if(position == 5){
                                        intent = new Intent(getApplicationContext(), Comt_compu6.class);
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


