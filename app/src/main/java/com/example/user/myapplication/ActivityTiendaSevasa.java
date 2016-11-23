package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ActivityTiendaSevasa extends AppCompatActivity {
    Button irSevCompus;
    Button irSevAccesorios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda_sevasa);


        //asignamos a la variable de tipo botón el boton que tiene el id button3
        irSevCompus =(Button)findViewById(R.id.botonSevComp);
        irSevAccesorios =(Button)findViewById(R.id.btnAccesorio);

        irSevCompus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irCompus = new Intent(ActivityTiendaSevasa.this, ActivitySevasaComputadoras.class);
                startActivity(irCompus);
            }
        });

        irSevAccesorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irAccesorios = new Intent(ActivityTiendaSevasa.this, MainActivitySevasaAccesorios.class);
                startActivity(irAccesorios);
            }
        });
    }
}
