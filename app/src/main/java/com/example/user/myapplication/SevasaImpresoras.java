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

public class SevasaImpresoras extends AppCompatActivity {
    private ListView listaImpresoras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sevasa_impresoras);

        listaImpresoras = (ListView) findViewById(R.id.lvImpresoras);

        Almacenamiento c1 = new Almacenamiento("Impresora All In One", "HP DeskJet 2132", "$200",R.mipmap.impresora1);
        Almacenamiento c2 = new Almacenamiento("Impresora All In One", "HP DeskJet 3633", "$180", R.mipmap.impresora2);
        Almacenamiento c3 = new Almacenamiento("Impresora All In One", "HP ENVY 4524", "$230", R.mipmap.impresora3);
        Almacenamiento c4 = new Almacenamiento("Impresora PIXMA ", "Canon MP250", "$210", R.mipmap.impresora4);
        Almacenamiento c5 = new Almacenamiento("Impresora PIXMA", "Canon MP490", "$160", R.mipmap.impresora5);
        Almacenamiento c6 = new Almacenamiento("Impresora All In One", "HP ENVY 4520", "$190", R.mipmap.impresora6);


        List<Almacenamiento> listImpres = new ArrayList<Almacenamiento>();
        listImpres.add(c1);
        listImpres.add(c2);
        listImpres.add(c3);
        listImpres.add(c4);
        listImpres.add(c5);
        listImpres.add(c6);

        AdapterSevasaImpresoras adapter = new AdapterSevasaImpresoras(getApplicationContext(), (ArrayList<Almacenamiento>) listImpres);
        listaImpresoras.setAdapter(adapter);

        listaImpresoras.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                if(position == 0){
                    intent = new Intent(getApplicationContext(),Sevasa_imp1.class);
                }else{
                    if(position == 1){
                        intent = new Intent(getApplicationContext(), Sevasa_imp2.class);
                    }else{
                        if(position == 2){
                            intent = new Intent(getApplicationContext(), Sevasa_imp3.class);
                        }else{
                            if(position == 3){
                                intent = new Intent(getApplicationContext(), Sevasa_imp4.class);
                            }else{
                                if(position == 4){
                                    intent = new Intent(getApplicationContext(), Sevasa_imp5.class);
                                }else {
                                    if(position == 5){
                                        intent = new Intent(getApplicationContext(), Sevasa_imp6.class);
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
