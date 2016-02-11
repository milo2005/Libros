package com.example.estacionvl_tc_014.databinding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.estacionvl_tc_014.databinding.adapters.LibroAdapter;
import com.example.estacionvl_tc_014.databinding.databinding.ActivityListBinding;
import com.example.estacionvl_tc_014.databinding.models.Libro;
import com.example.estacionvl_tc_014.databinding.util.C;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    LibroAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityListBinding binding = ActivityListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        C.data =  new ArrayList<>();

        Libro libro = new Libro();
        libro.setNombre("Inferno");
        libro.setAutor("Dan Brown");
        libro.setDescripcion("Inferno es una novela de misterio y suspense del escritor estadounidense Dan Brown, basada en la simbología oculta en la Divina Comedia, obra clásica de Dante Alighieri, así como en los problemas de la superpoblación mundial. Se trata de la sexta novela del escritor, la cuarta con Robert Langdon como protagonista tras Ángeles y demonios, El código Da Vinci y El símbolo perdido. Fue publicada por la editorial Doubleday el 14 mayo de 2013");

        libro.setPortada("http://www.revista609.com/wp-content/uploads/2013/06/inferno-di-dan-brown.jpg");

        Libro l2 =  new Libro();
        l2.setAutor("George RR Martin");
        l2.setNombre("Juego de Tronos");
        l2.setPortada("http://litreactor.com/sites/default/files/images/books/game-of-thrones-book.jpg");
        l2.setDescripcion("Novela de fantasía escrita por el autor estadounidense George R. R. Martin en 1996 y ganadora del premio Locus en 1997. Se trata de la primera entrega de la serie de gran popularidad Canción de hielo y fuego. La novela se caracteriza por su estética medieval");

        Libro l3 =  new Libro();
        l3.setAutor("Julian Rodrigues");
        l3.setNombre("El principito");
        l3.setPortada("http://listas.eleconomista.es/system/lists/000/002/065/medium/principititoP.jpg?1447029007");

        l3.setDescripcion("La obra fue publicada en abril de 1943, tanto en inglés como en francés, por la editorial estadounidense Reynal & Hitchcock, mientras que la editorial francesa Éditions Gallimard no pudo imprimir la obra hasta 1946");


        C.data.add(libro);
        C.data.add(l2);
        C.data.add(l3);

        adapter = new LibroAdapter(getLayoutInflater(), C.data);
        binding.list.setAdapter(adapter);

        binding.list.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent =  new Intent(this, MainActivity.class);
        intent.putExtra("pos", position);
        startActivity(intent);
    }
}
