package com.example.estacionvl_tc_014.databinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.estacionvl_tc_014.databinding.databinding.ActivityMainBinding;
import com.example.estacionvl_tc_014.databinding.models.Libro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.root);

        Libro libro = new Libro();
        libro.setNombre("Inferno");
        libro.setAutor("Dan Brown");
        libro.setDescripcion("Inferno es una novela de misterio y suspense del escritor estadounidense Dan Brown, basada en la simbología oculta en la Divina Comedia, obra clásica de Dante Alighieri, así como en los problemas de la superpoblación mundial. Se trata de la sexta novela del escritor, la cuarta con Robert Langdon como protagonista tras Ángeles y demonios, El código Da Vinci y El símbolo perdido. Fue publicada por la editorial Doubleday el 14 mayo de 2013");

        binding.setLibro(libro);



    }
}