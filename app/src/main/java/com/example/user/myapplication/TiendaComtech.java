package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TiendaComtech extends AppCompatActivity {

    Button irCompus;
    Button irZonaGamer;
    Button irContComtech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tienda_comtech);

        //asignamos a la variable de tipo botón el boton que tiene el id button3
        irCompus =(Button)findViewById(R.id.botonCompu);


        irCompus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irCompus = new Intent(TiendaComtech.this, ComtechComputadoras.class);
                startActivity(irCompus);
            }
        });


        irZonaGamer = (Button)findViewById(R.id.button7);

        irZonaGamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irZonaGamer = new Intent(TiendaComtech.this,Comtech_ZonaGamer.class);
                startActivity(irZonaGamer);
            }
        });

        irContComtech = (Button) findViewById(R.id.btnContComtech);
        irContComtech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irContacto = new Intent(TiendaComtech.this, ContactoComtech.class);
                startActivity(irContacto);
            }
        });

    }
}
