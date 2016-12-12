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
 * Created by Mariord on 25/11/2016.
 */
public class SevasaCamaras extends AppCompatActivity {
    private ListView listaCamaras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sevasa_camaras);

        listaCamaras = (ListView) findViewById(R.id.lvCamaras);

        Camara cam1 = new Camara("Nikon D5300", "24MP", "Precio: $750","Semi-Profesional", R.mipmap.nikon);

        Camara cam2 = new Camara("GoPro Hero4", "12MP", "Precio: $450","Profesional", R.mipmap.gopro);

        Camara cam3 = new Camara("Canon XF300", "18MP", "Precio: $3000","Profesional", R.mipmap.camprofesional);

        Camara cam4 = new Camara("Sony DSC-WX100", "18MP", "Precio: $290","No-Profesional", R.mipmap.camara4);

        Camara cam5 = new Camara("Sony CyberShot DSC-W55", "7.2MP", "Precio: $65","No-Profesional", R.mipmap.camara5);

        Camara cam6 = new Camara("Nikon D600", "24MP", "Precio: $2500","Profesional", R.mipmap.camara6);





        List<Camara> listCamaras = new ArrayList<Camara>();
        listCamaras.add(cam1);
        listCamaras.add(cam2);
        listCamaras.add(cam3);
        listCamaras.add(cam4);
        listCamaras.add(cam5);
        listCamaras.add(cam6);


        AdapterSevasaCamara adapter = new AdapterSevasaCamara(getApplicationContext(), listCamaras);
        listaCamaras.setAdapter(adapter);

        listaCamaras.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;

                if(position == 0){
                    intent = new Intent(getApplicationContext(),Sevasa_cam1.class);
                }else{
                    if(position == 1){
                        intent = new Intent(getApplicationContext(), Sevasa_cam2.class);
                    }else{
                        if(position == 2){
                            intent = new Intent(getApplicationContext(), Sevasa_cam3.class);
                        }else{
                            if(position == 3){
                                intent = new Intent(getApplicationContext(), Sevasa_cam4.class);
                            }else{
                                if(position == 4){
                                    intent = new Intent(getApplicationContext(), Sevasa_cam5.class);
                                }else {
                                    if(position == 5){
                                        intent = new Intent(getApplicationContext(), Sevasa_cam6.class);
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
