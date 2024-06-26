package com.example.projetofirebase;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class produtos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);
    }

    // Método chamado quando o botão "Voltar" é clicado
    public void goBack(View view) {
        finish(); // Fecha a atividade atual e retorna à anterior
    }
}