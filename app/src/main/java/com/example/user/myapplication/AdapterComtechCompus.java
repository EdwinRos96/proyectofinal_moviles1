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
 * Created by Mariord on 18/11/2016.
 */
public class AdapterComtechCompus extends ArrayAdapter<Computadoras> {
    List<Computadoras> comtCompus;
    public AdapterComtechCompus(Context context, List<Computadoras> objects) {
        super(context, 0, objects);
        this.comtCompus = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_comtech_compus, parent, false);
        }

        TextView discoDuro = (TextView) convertView.findViewById(R.id.tvDiscoDuro);
        TextView procesador = (TextView) convertView.findViewById(R.id.tvProcesador);
        TextView memRam = (TextView) convertView.findViewById((R.id.tvTipo));
        TextView precio = (TextView) convertView.findViewById((R.id.tvPrecio));
        ImageView imag = (ImageView) convertView.findViewById(R.id.imgComtPC);


        Computadoras compus = comtCompus.get(position);

        discoDuro.setText(compus.getDiscoduro());
        procesador.setText(compus.getProcesador());
        memRam.setText(compus.getRam());
        precio.setText(compus.getPrecio());
        imag.setImageResource(compus.getImg());

        return convertView;
    }
}
