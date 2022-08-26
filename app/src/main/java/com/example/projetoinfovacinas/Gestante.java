package com.example.projetoinfovacinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Gestante extends AppCompatActivity {

    ImageView btnVoltarGestante;
    TextView txtInfoGestante1, txtInfoGestante2, txtInfoGestante3, txtInfoGestante4;
    LinearLayout layout1, layout2, layout3,layout4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestante);

        btnVoltarGestante = findViewById(R.id.btnVoltarGestante);

        txtInfoGestante1 = findViewById(R.id.txtInfoGestante1);
        layout1 = findViewById(R.id.layout1);

        txtInfoGestante2 = findViewById(R.id.txtInfoGestante2);
        layout2 = findViewById(R.id.layout2);

        txtInfoGestante3 = findViewById(R.id.txtInfoGestante3);
        layout3 = findViewById(R.id.layout3);

        txtInfoGestante4 = findViewById(R.id.txtInfoGestante4);
        layout4 = findViewById(R.id.layout4);

        //Ao clicar no botão de voltar no canto superior esquerdo, irá retornar para tela principal
        btnVoltarGestante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                overridePendingTransition(R.anim.mover_esquerda, R.anim.fade_out);
            }
        });
    }
    //Classe para expandir o cardview junto com o conteúdo
    public void expand1 (View view){
        int v = (txtInfoGestante1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        txtInfoGestante1.setVisibility(v);

    }
    public void expand2 (View view){
        int v = (txtInfoGestante2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        txtInfoGestante2.setVisibility(v);

    }

    public void expand3 (View view){
        int v = (txtInfoGestante3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
        txtInfoGestante3.setVisibility(v);

    }

    public void expand4 (View view){
        int v = (txtInfoGestante4.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout4, new AutoTransition());
        txtInfoGestante4.setVisibility(v);

    }
}