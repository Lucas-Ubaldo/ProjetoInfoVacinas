package com.example.projetoinfovacinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Creditos extends AppCompatActivity {

    ImageView btnVoltarCreditos;
    TextView txtInfoIntegrantes, ministSaude, urlSbim;
    LinearLayout layout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        txtInfoIntegrantes = findViewById(R.id.txtInfoIntegrantes);
        layout1 = findViewById(R.id.layout1);
        btnVoltarCreditos = findViewById(R.id.btnVoltarCreditos);
        ministSaude = findViewById(R.id.ministerioSaude);
        urlSbim = findViewById(R.id.sbim);

        //Botão para voltar para tela principal
        btnVoltarCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.mover_esquerda, R.anim.fade_out);
            }
        });

        ministSaude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaUrl("https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/c/calendario-nacional-de-vacinacao/calendario-vacinal-2020");
            }
        });

        urlSbim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaUrl("https://familia.sbim.org.br/vacinas/vacinas-disponiveis");
            }
        });
    }

    private void irParaUrl (String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}