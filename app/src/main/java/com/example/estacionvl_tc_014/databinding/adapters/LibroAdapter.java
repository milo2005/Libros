package com.example.estacionvl_tc_014.databinding.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.estacionvl_tc_014.databinding.databinding.TemplateLibroBinding;
import com.example.estacionvl_tc_014.databinding.models.Libro;

import java.util.List;

/**
 * Created by EstacionVL-TC-014 on 11/02/16.
 */
public class LibroAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<Libro> data;

    public LibroAdapter(LayoutInflater inflater, List<Libro> data) {
        this.inflater = inflater;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TemplateLibroBinding template = TemplateLibroBinding
                .inflate(inflater,parent,false);

        template.setL(data.get(position));


        return template.getRoot();
    }
}
