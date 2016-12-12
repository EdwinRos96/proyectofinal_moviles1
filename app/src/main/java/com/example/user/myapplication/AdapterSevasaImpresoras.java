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
public class AdapterSevasaImpresoras extends ArrayAdapter<Almacenamiento> {
    List<Almacenamiento> sevImpresoras;
    public AdapterSevasaImpresoras(Context context, List<Almacenamiento> objects) {
        super(context, 0, objects);
        this.sevImpresoras = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_impresoras, parent, false);
        }

        TextView nombre = (TextView) convertView.findViewById(R.id.tvMarcaCam);
        TextView marca = (TextView) convertView.findViewById(R.id.tvResolucion);
        TextView precio = (TextView) convertView.findViewById(R.id.tvPrecio);
        ImageView imag = (ImageView) convertView.findViewById(R.id.imgSevImp);



        Almacenamiento impres = sevImpresoras.get(position);

        nombre.setText(impres.getNombre());
        marca.setText(impres.getMarca());
        precio.setText(impres.getPrecio());
        imag.setImageResource(impres.getImg());
        return convertView;

    }


}
