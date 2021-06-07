package com.br.pedro.bruno.minhaspropostas.view;

import androidx.appcompat.app.AppCompatActivity;
import com.br.pedro.bruno.minhaspropostas.R;

import android.os.Bundle;
import android.widget.TextView;

public class PaginaInicial extends AppCompatActivity {

    TextView txtUsuario,txtEmpresa,txtVersion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inicial);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtEmpresa = findViewById(R.id.txtEmpresa);
        txtVersion = findViewById(R.id.txtVersion);

        txtUsuario.setText("Pedro");
        //txtUsuario.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_launcher_background,0,0,0);
        txtEmpresa.setText("Maxima");
        txtVersion.setText("1.00");

    }
}