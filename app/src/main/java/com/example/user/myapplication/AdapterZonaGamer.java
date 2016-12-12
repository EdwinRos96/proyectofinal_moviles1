package com.example.user.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterZonaGamer extends ArrayAdapter<Almacenamiento> {
    List<Almacenamiento> comZonaGamer;
    public AdapterZonaGamer(Context context, ArrayList<Almacenamiento> objects) {
        super(context, 0, objects);
        this.comZonaGamer = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_zonagamer, parent, false);
        }

        TextView marca = (TextView) convertView.findViewById(R.id.tvResolucion);
        TextView precio = (TextView) convertView.findViewById(R.id.tvPrecio);
        TextView memRam = (TextView) convertView.findViewById(R.id.tvTipo);
        TextView nombre = (TextView) convertView.findViewById(R.id.tvMarcaCam);
        ImageView imag = (ImageView) convertView.findViewById(R.id.imgAccesorioZG);



        Almacenamiento compus = comZonaGamer.get(position);

        marca.setText(compus.getMarca());
        precio.setText(compus.getPrecio());
        nombre.setText(compus.getNombre());
        imag.setImageResource(compus.getImg());
        return convertView;

    }
}
