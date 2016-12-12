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

/**
 * Created by Mariord on 18/11/2016.
 */
public class AdapterSevasaCompus extends ArrayAdapter<Computadoras> {
    List<Computadoras> sevCompus;
    public AdapterSevasaCompus(Context context, ArrayList<Computadoras> objects) {
        super(context, 0, objects);
        this.sevCompus = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_sevasa_compus, parent, false);
        }

        TextView marca = (TextView) convertView.findViewById(R.id.tvResolucion);
        TextView precio = (TextView) convertView.findViewById(R.id.tvPrecio);
        TextView memRam = (TextView) convertView.findViewById(R.id.tvTipo);
        TextView nombre = (TextView) convertView.findViewById(R.id.tvMarcaCam);
        ImageView imag = (ImageView) convertView.findViewById(R.id.imgSevasaPC);



        Computadoras compus = sevCompus.get(position);

        marca.setText(compus.getDiscoduro());
        precio.setText(compus.getProcesador());
        memRam.setText(compus.getRam());
        nombre.setText(compus.getPrecio());
        imag.setImageResource(compus.getImg());
        return convertView;

    }
}
