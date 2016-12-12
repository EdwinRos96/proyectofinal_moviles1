package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.orm.SugarRecord;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ContactoSevasa extends AppCompatActivity {

    private Button enviar;
    private EditText nombre;
    private EditText correo;
    private EditText asunto;
    private EditText mensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactosevasa);
        ButterKnife.bind(this);

        this.enviar = (Button) findViewById(R.id.btnEnviar);
        nombre = (EditText) findViewById(R.id.etNombre);
        correo = (EditText) findViewById(R.id.etCorreo);
        asunto = (EditText) findViewById(R.id.etAsunto);
        mensaje = (EditText) findViewById(R.id.etMensaje);


        this.enviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                insertar();
            }
        });

    }


    public void insertar(){
        ContactoBD temp = new ContactoBD();
        temp.setNombre(nombre.getText().toString());
        temp.setCorreo(correo.getText().toString());
        temp.setAsunto(asunto.getText().toString());
        temp.setMensaje(mensaje.getText().toString());
        temp.save();
        Toast mensaje = Toast.makeText(getApplicationContext(),"¡Mensaje enviado satisfactoriamente!", Toast.LENGTH_SHORT);
        mensaje.show();
    }


}
