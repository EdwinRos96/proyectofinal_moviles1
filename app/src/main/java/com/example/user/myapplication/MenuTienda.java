package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mariord on 28/11/2016.
 */
public class MenuTienda extends AppCompatActivity {
    private ListView listaTiendas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_tienda);

        listaTiendas = (ListView) findViewById(R.id.lvtiendas);

        Menu t1 = new Menu("Teléfono: 2252-4204", "Correo: sevasaonline@sevasaonline.com", "Dirección: Shell Plaza El Sol 1c. al sur 1 1/2 abajo, No 112", R.mipmap.logofinalsevasa);
        Menu t2 = new Menu("Teléfono: 2264-8800", "Correo: comtechonline@comtechonline.com", "Dirección: Calle Principal de Altamira D' Este No. 589", R.mipmap.logocomtech);





        List<Menu> listTiendas = new ArrayList<Menu>();
        listTiendas.add(t1);
        listTiendas.add(t2);

        AdapterMenu adapter = new AdapterMenu(getApplicationContext(), listTiendas);
        listaTiendas.setAdapter(adapter);


        listaTiendas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                    if(position == 0){
                        intent = new Intent(getApplicationContext(),TiendaSevasa.class);
                    }else{
                        if(position == 1){
                            intent = new Intent(getApplicationContext(),TiendaComtech.class);
                        }
                    }

                startActivity(intent);
            }
        });



    }




}
