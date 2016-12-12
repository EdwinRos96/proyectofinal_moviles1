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
 * Created by Mariord on 22/11/2016.
 */
public class AdapterSevasaAlmacenamiento extends ArrayAdapter<Almacenamiento> {
    List<Almacenamiento> sevAccesorios;
    public AdapterSevasaAlmacenamiento(Context context, List<Almacenamiento> objects) {
        super(context, 0, objects);
        this.sevAccesorios = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_almacenamiento, parent, false);
        }

        TextView nombre = (TextView) convertView.findViewById(R.id.tvMarcaCam);
        TextView marca = (TextView) convertView.findViewById(R.id.tvResolucion);
        TextView precio = (TextView) convertView.findViewById(R.id.tvPrecio);
        ImageView imag = (ImageView) convertView.findViewById(R.id.imgCamara);



        Almacenamiento acces = sevAccesorios.get(position);

        nombre.setText(acces.getNombre());
        marca.setText(acces.getMarca());
        precio.setText(acces.getPrecio());
        imag.setImageResource(acces.getImg());
        return convertView;

    }


}
