package com.example.projetoinfovacinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Adulto extends AppCompatActivity {

    ImageView btnVoltarAdulto;

    //Conteúdos que estão incialmente "invisíveis" no card
    TextView txtInfoAdulto1, txtInfoAdulto2, txtInfoAdulto3, txtInfoAdulto4, txtInfoAdulto5, txtInfoAdulto6, txtInfoAdulto7, txtInfoAdulto8;

    //LinearLayout dos cardviews
    LinearLayout layout1, layout2, layout3, layout4, layout5, layout6, layout7, layout8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adulto);

        btnVoltarAdulto = findViewById(R.id.btnVoltarAdulto);

        txtInfoAdulto1 = findViewById(R.id.txtInfoAdulto1);
        layout1 = findViewById(R.id.layout1);

        txtInfoAdulto2 = findViewById(R.id.txtInfoAdulto2);
        layout2 = findViewById(R.id.layout2);

        txtInfoAdulto3 = findViewById(R.id.txtInfoAdulto3);
        layout3 = findViewById(R.id.layout3);

        txtInfoAdulto4 = findViewById(R.id.txtInfoAdulto4);
        layout4 = findViewById(R.id.layout4);

        txtInfoAdulto5 = findViewById(R.id.txtInfoAdulto5);
        layout5 = findViewById(R.id.layout5);

        txtInfoAdulto6 = findViewById(R.id.txtInfoAdulto6);
        layout6 = findViewById(R.id.layout6);

        txtInfoAdulto7 = findViewById(R.id.txtInfoAdulto7);
        layout7 = findViewById(R.id.layout7);

        txtInfoAdulto8 = findViewById(R.id.txtInfoAdulto8);
        layout8 = findViewById(R.id.layout8);

        //Ao clicar no botão de voltar no canto superior esquerdo, irá retornar para tela principal
        btnVoltarAdulto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                overridePendingTransition(R.anim.mover_esquerda, R.anim.fade_out);
            }
        });
    }

    //Classe para expandir o cardview junto com o conteúdo
    public void expand1 (View view){
        int v = (txtInfoAdulto1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        txtInfoAdulto1.setVisibility(v);

    }

    public void expand2 (View view){
        int v = (txtInfoAdulto2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        txtInfoAdulto2.setVisibility(v);

    }

    public void expand3 (View view){
        int v = (txtInfoAdulto3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
        txtInfoAdulto3.setVisibility(v);

    }

    public void expand4 (View view){
        int v = (txtInfoAdulto4.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout4, new AutoTransition());
        txtInfoAdulto4.setVisibility(v);

    }

    public void expand5 (View view){
        int v = (txtInfoAdulto5.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout5, new AutoTransition());
        txtInfoAdulto5.setVisibility(v);

    }

    public void expand6 (View view){
        int v = (txtInfoAdulto6.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout6, new AutoTransition());
        txtInfoAdulto6.setVisibility(v);

    }

    public void expand7 (View view){
        int v = (txtInfoAdulto7.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout7, new AutoTransition());
        txtInfoAdulto7.setVisibility(v);

    }

    public void expand8 (View view){
        int v = (txtInfoAdulto8.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout8, new AutoTransition());
        txtInfoAdulto8.setVisibility(v);

    }
}