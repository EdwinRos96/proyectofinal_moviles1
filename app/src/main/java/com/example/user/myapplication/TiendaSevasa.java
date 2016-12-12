package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TiendaSevasa extends AppCompatActivity {
    Button irSevCompus;
    Button irSevAccesorios;
    Button irSevImpresoras;
    Button irSevCamaras;
    Button irContSevasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tienda_sevasa);


        irSevCompus =(Button)findViewById(R.id.botonSevComp);
        irSevAccesorios =(Button)findViewById(R.id.btnAccesorio);
        irSevImpresoras = (Button)findViewById(R.id.btnSevImpresoras);
        irSevCamaras = (Button)findViewById(R.id.btnCams);
        irContSevasa = (Button)findViewById(R.id.btnContSevasa);

        irSevCompus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irCompus = new Intent(TiendaSevasa.this, SevasaComputadoras.class);
                startActivity(irCompus);
            }
        });

        irSevAccesorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irAccesorios = new Intent(TiendaSevasa.this, SevasaAlmacenamiento.class);
                startActivity(irAccesorios);
            }
        });

        irSevImpresoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irImpresoras = new Intent(TiendaSevasa.this, SevasaImpresoras.class);
                startActivity(irImpresoras);
            }
        });

        irSevCamaras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irCams = new Intent(TiendaSevasa.this, SevasaCamaras.class);
                startActivity(irCams);
            }
        });

        irContSevasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irContacto = new Intent(TiendaSevasa.this, ContactoSevasa.class);
                startActivity(irContacto);
            }
        });
    }
}