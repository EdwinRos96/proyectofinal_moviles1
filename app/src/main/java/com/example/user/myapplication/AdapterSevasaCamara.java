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
 * Created by Mariord on 25/11/2016.
 */
public class AdapterSevasaCamara extends ArrayAdapter<Camara> {
    List<Camara> sevCamaras;
    public AdapterSevasaCamara(Context context, List<Camara> objects) {
        super(context, 0, objects);
        this.sevCamaras = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_camaras, parent, false);
        }

        TextView marca = (TextView) convertView.findViewById(R.id.tvMarcaCam);
        TextView resolucion = (TextView) convertView.findViewById(R.id.tvResolucion);
        TextView precio = (TextView) convertView.findViewById(R.id.tvPrecio);
        TextView tipo = (TextView) convertView.findViewById(R.id.tvTipo);
        ImageView imag = (ImageView) convertView.findViewById(R.id.imgCamara);



        Camara cam = sevCamaras.get(position);

        marca.setText(cam.getMarca());
        resolucion.setText(cam.getResolucion());
        precio.setText(cam.getPrecio());
        tipo.setText(cam.getTipo());
        imag.setImageResource(cam.getImagen());
        return convertView;

    }
}
