package com.br.pedro.bruno.minhaspropostas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.br.pedro.bruno.minhaspropostas.R;

public class MainActivity extends AppCompatActivity {

    EditText editLogin, editSenha;
    Button btnLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editLogin = findViewById(R.id.editLogin);
        editSenha = findViewById(R.id.editSenha);
        btnLogar = findViewById(R.id.btnLogar);

        logar();

    }

    private void logar(){


        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean validacao = true;
                if(TextUtils.isEmpty(editLogin.getText())){
                    editLogin.setError("Digite o Login");
                    editLogin.requestFocus();
                    validacao = false;
                }
                if(TextUtils.isEmpty(editSenha.getText())){
                    editSenha.setError("Digite a Senha");
                    editSenha.requestFocus();
                    validacao = false;
                }

                if(validacao){
                    if(validaLogin()){
                        Intent in = new Intent(MainActivity.this,PaginaInicial.class);
                        startActivity(in);
                    }
                }

            }
        });

    }

    private boolean validaLogin() {
        // validar no banco de dados se existe login
        return true;
    }

}