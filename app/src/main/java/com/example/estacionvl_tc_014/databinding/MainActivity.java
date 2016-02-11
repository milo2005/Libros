package com.example.estacionvl_tc_014.databinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.estacionvl_tc_014.databinding.databinding.ActivityMainBinding;
import com.example.estacionvl_tc_014.databinding.models.Libro;
import com.example.estacionvl_tc_014.databinding.util.C;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Libro libro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.root);

        int pos  = getIntent().getIntExtra("pos",0);

        libro = C.data.get(pos);

        binding.setLibro(libro);
        binding.btn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Libro editado",Toast.LENGTH_SHORT).show();

        libro.setAutor("Dario Chamorro");

    }
}
