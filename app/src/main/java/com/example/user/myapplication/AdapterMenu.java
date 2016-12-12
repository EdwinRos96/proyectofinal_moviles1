package com.example.user.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mariord on 28/11/2016.
 */
public class AdapterMenu extends ArrayAdapter<Menu> {
    List<Menu> mainTiendas;
    public AdapterMenu(Context context, List<Menu> objects) {
        super(context, 0, objects);
        this.mainTiendas = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_menu_tienda, parent, false);
        }

        TextView telefono = (TextView) convertView.findViewById(R.id.idTelf);
        TextView correo = (TextView) convertView.findViewById(R.id.idCorreo);
        TextView direccion = (TextView) convertView.findViewById(R.id.idDireccion);
        ImageView imag = (ImageView) convertView.findViewById(R.id.logoTienda);



        Menu mTienda = mainTiendas.get(position);

        telefono.setText(mTienda.getNumTelefono());
        correo.setText(mTienda.getCorreo());
        direccion.setText(mTienda.getDireccion());
        imag.setImageResource(mTienda.getLogo());
        return convertView;

    }
}
