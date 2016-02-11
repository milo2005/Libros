package com.example.estacionvl_tc_014.databinding.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.estacionvl_tc_014.databinding.BR;

/**
 * Created by EstacionVL-TC-014 on 11/02/16.
 */
public class Libro extends BaseObservable {

    String nombre;
    String autor;
    String portada;
    String descripcion;

    @Bindable
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        notifyPropertyChanged(BR.nombre);
    }

    @Bindable
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
        notifyPropertyChanged(BR.autor);
    }

    @Bindable
    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
        notifyPropertyChanged(BR.portada);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
