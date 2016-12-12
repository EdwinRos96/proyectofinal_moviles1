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

/**
 * Created by Mariord on 22/11/2016.
 */
public class SevasaAlmacenamiento extends AppCompatActivity {
    private ListView listaAccesorios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sevasa_accesorios);

        listaAccesorios = (ListView) findViewById(R.id.lvAccesorios);

        Almacenamiento a1 = new Almacenamiento("Disco Duro Externo 1TB", "Seagate", "Precio: $220", R.mipmap.discoduro1);
        Almacenamiento a2 = new Almacenamiento("Disco Duro Externo 500GB", "Samsung", "Precio: $150", R.mipmap.discoduro2);
        Almacenamiento a3 = new Almacenamiento("Disco Duro Externo 500GB", "ADATA", "Precio: $80", R.mipmap.discoduro3);
        Almacenamiento a4 = new Almacenamiento("Disco Duro Externo 2TB", "Western Digital", "Precio: $250", R.mipmap.discoduro4);
        Almacenamiento a5 = new Almacenamiento("Disco Duro Externo 500GB", "Touro Mobile", "Precio: $65", R.mipmap.discoduro5);
        Almacenamiento a6 = new Almacenamiento("Disco Duro Externo 500GB", "Transcend", "Precio: $105", R.mipmap.discoduro6);




        List<Almacenamiento>  listAccesorios = new ArrayList<Almacenamiento>();
        listAccesorios.add(a1);
        listAccesorios.add(a2);
        listAccesorios.add(a3);
        listAccesorios.add(a4);
        listAccesorios.add(a5);
        listAccesorios.add(a6);
        AdapterSevasaAlmacenamiento adapter = new AdapterSevasaAlmacenamiento(getApplicationContext(), listAccesorios);
        listaAccesorios.setAdapter(adapter);

        listaAccesorios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                if(position == 0){
                    intent = new Intent(getApplicationContext(),Sevasa_disc1.class);
                }else{
                    if(position == 1){
                        intent = new Intent(getApplicationContext(), Sevasa_disc2.class);
                    }else{
                        if(position == 2){
                            intent = new Intent(getApplicationContext(), Sevasa_disc3.class);
                        }else{
                            if(position == 3){
                                intent = new Intent(getApplicationContext(), Sevasa_disc4.class);
                            }else{
                                if(position == 4){
                                    intent = new Intent(getApplicationContext(), Sevasa_disc5.class);
                                }else {
                                    if(position == 5){
                                        intent = new Intent(getApplicationContext(), Sevasa_disc6.class);
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
