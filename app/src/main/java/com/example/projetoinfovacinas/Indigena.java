package com.example.projetoinfovacinas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Indigena extends AppCompatActivity {

    ImageView btnVoltarIndigena;
    TextView txtInfoIndigena1, txtInfoIndigena2, txtInfoIndigena3, txtInfoIndigena4, txtInfoIndigena5, txtInfoIndigena6, txtInfoIndigena7, txtInfoIndigena8, txtInfoIndigena9, txtInfoIndigena10, txtInfoIndigena11, txtInfoIndigena12, txtInfoIndigena13, txtInfoIndigena14, txtInfoIndigena15, txtInfoIndigena16, txtInfoIndigena17, txtInfoIndigena18, txtInfoIndigena19, txtInfoIndigena20, txtInfoIndigena21, txtInfoIndigena22, txtInfoIndigena23, txtInfoIndigena24, txtInfoIndigena25, txtInfoIndigena26, txtInfoIndigena27, txtInfoIndigena28, txtInfoIndigena29 ;
    LinearLayout layout1, layout2, layout3, layout4, layout5, layout6, layout7, layout8, layout9, layout10, layout11, layout12, layout13, layout14, layout15, layout16, layout17, layout18, layout19, layout20, layout21, layout22, layout23, layout24, layout25, layout26, layout27, layout28, layout29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indigena);

        btnVoltarIndigena = findViewById(R.id.btnVoltarIndigena);

        txtInfoIndigena1 = findViewById(R.id.txtInfoIndigena1);
        layout1 = findViewById(R.id.layout1);

        txtInfoIndigena2 = findViewById(R.id.txtInfoIndigena2);
        layout2 = findViewById(R.id.layout2);

        txtInfoIndigena3 = findViewById(R.id.txtInfoIndigena3);
        layout3 = findViewById(R.id.layout3);

        txtInfoIndigena4 = findViewById(R.id.txtInfoIndigena4);
        layout4 = findViewById(R.id.layout4);

        txtInfoIndigena5 = findViewById(R.id.txtInfoIndigena5);
        layout5 = findViewById(R.id.layout5);

        txtInfoIndigena6 = findViewById(R.id.txtInfoIndigena6);
        layout6 = findViewById(R.id.layout6);

        txtInfoIndigena7 = findViewById(R.id.txtInfoIndigena7);
        layout7 = findViewById(R.id.layout7);

        txtInfoIndigena8 = findViewById(R.id.txtInfoIndigena8);
        layout8 = findViewById(R.id.layout8);

        txtInfoIndigena9 = findViewById(R.id.txtInfoIndigena9);
        layout9 = findViewById(R.id.layout9);

        txtInfoIndigena10 = findViewById(R.id.txtInfoIndigena10);
        layout10 = findViewById(R.id.layout10);

        txtInfoIndigena11 = findViewById(R.id.txtInfoIndigena11);
        layout11 = findViewById(R.id.layout11);

        txtInfoIndigena12 = findViewById(R.id.txtInfoIndigena12);
        layout12 = findViewById(R.id.layout12);

        txtInfoIndigena13 = findViewById(R.id.txtInfoIndigena13);
        layout13 = findViewById(R.id.layout13);

        txtInfoIndigena14 = findViewById(R.id.txtInfoIndigena14);
        layout14 = findViewById(R.id.layout14);

        txtInfoIndigena15 = findViewById(R.id.txtInfoIndigena15);
        layout15 = findViewById(R.id.layout15);

        txtInfoIndigena16 = findViewById(R.id.txtInfoIndigena16);
        layout16 = findViewById(R.id.layout16);

        txtInfoIndigena17 = findViewById(R.id.txtInfoIndigena17);
        layout17 = findViewById(R.id.layout17);

        txtInfoIndigena18 = findViewById(R.id.txtInfoIndigena18);
        layout18 = findViewById(R.id.layout18);

        txtInfoIndigena19 = findViewById(R.id.txtInfoIndigena19);
        layout19 = findViewById(R.id.layout19);

        txtInfoIndigena20 = findViewById(R.id.txtInfoIndigena20);
        layout20 = findViewById(R.id.layout20);

        txtInfoIndigena21 = findViewById(R.id.txtInfoIndigena21);
        layout21 = findViewById(R.id.layout21);

        txtInfoIndigena22 = findViewById(R.id.txtInfoIndigena22);
        layout22 = findViewById(R.id.layout22);

        txtInfoIndigena23 = findViewById(R.id.txtInfoIndigena23);
        layout23 = findViewById(R.id.layout23);

        txtInfoIndigena24 = findViewById(R.id.txtInfoIndigena24);
        layout24 = findViewById(R.id.layout24);

        txtInfoIndigena25 = findViewById(R.id.txtInfoIndigena25);
        layout25 = findViewById(R.id.layout25);

        txtInfoIndigena26 = findViewById(R.id.txtInfoIndigena26);
        layout26 = findViewById(R.id.layout26);

        txtInfoIndigena27 = findViewById(R.id.txtInfoIndigena27);
        layout27 = findViewById(R.id.layout27);

        txtInfoIndigena28 = findViewById(R.id.txtInfoIndigena28);
        layout28 = findViewById(R.id.layout28);

        txtInfoIndigena29 = findViewById(R.id.txtInfoIndigena29);
        layout29 = findViewById(R.id.layout29);




        //Ao clicar no botão de voltar no canto superior esquerdo, irá retornar para tela principal
        btnVoltarIndigena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                overridePendingTransition(R.anim.mover_esquerda, R.anim.fade_out);
            }
        });
    }

    //Classe para expandir o cardview junto com o conteúdo
    public void expand1 (View view){
        int v = (txtInfoIndigena1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        txtInfoIndigena1.setVisibility(v);

    }
    public void expand2 (View view){
        int v = (txtInfoIndigena2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        txtInfoIndigena2.setVisibility(v);

    }

    public void expand3 (View view){
        int v = (txtInfoIndigena3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
        txtInfoIndigena3.setVisibility(v);

    }
    public void expand4 (View view){
        int v = (txtInfoIndigena4.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout4, new AutoTransition());
        txtInfoIndigena4.setVisibility(v);

    }
    public void expand5 (View view){
        int v = (txtInfoIndigena5.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout5, new AutoTransition());
        txtInfoIndigena5.setVisibility(v);

    }
    public void expand6 (View view){
        int v = (txtInfoIndigena6.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout6, new AutoTransition());
        txtInfoIndigena6.setVisibility(v);

    }
    public void expand7 (View view){
        int v = (txtInfoIndigena7.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout7, new AutoTransition());
        txtInfoIndigena7.setVisibility(v);

    }
    public void expand8 (View view){
        int v = (txtInfoIndigena8.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout8, new AutoTransition());
        txtInfoIndigena8.setVisibility(v);

    }
    public void expand9 (View view){
        int v = (txtInfoIndigena9.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout9, new AutoTransition());
        txtInfoIndigena9.setVisibility(v);

    }
    public void expand10 (View view){
        int v = (txtInfoIndigena10.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout10, new AutoTransition());
        txtInfoIndigena10.setVisibility(v);

    }
    public void expand11 (View view){
        int v = (txtInfoIndigena11.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout11, new AutoTransition());
        txtInfoIndigena11.setVisibility(v);

    }
    public void expand12 (View view){
        int v = (txtInfoIndigena12.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout12, new AutoTransition());
        txtInfoIndigena12.setVisibility(v);

    }
    public void expand13 (View view){
        int v = (txtInfoIndigena13.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout13, new AutoTransition());
        txtInfoIndigena13.setVisibility(v);

    }
    public void expand14 (View view){
        int v = (txtInfoIndigena14.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout14, new AutoTransition());
        txtInfoIndigena14.setVisibility(v);

    }
    public void expand15 (View view){
        int v = (txtInfoIndigena15.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout15, new AutoTransition());
        txtInfoIndigena15.setVisibility(v);

    }
    public void expand16 (View view){
        int v = (txtInfoIndigena16.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout16, new AutoTransition());
        txtInfoIndigena16.setVisibility(v);

    }
    public void expand17 (View view){
        int v = (txtInfoIndigena17.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout17, new AutoTransition());
        txtInfoIndigena17.setVisibility(v);

    }
    public void expand18 (View view){
        int v = (txtInfoIndigena18.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout18, new AutoTransition());
        txtInfoIndigena18.setVisibility(v);

    }
    public void expand19 (View view){
        int v = (txtInfoIndigena19.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout19, new AutoTransition());
        txtInfoIndigena19.setVisibility(v);

    }
    public void expand20 (View view){
        int v = (txtInfoIndigena20.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout20, new AutoTransition());
        txtInfoIndigena20.setVisibility(v);

    }
    public void expand21 (View view){
        int v = (txtInfoIndigena21.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout21, new AutoTransition());
        txtInfoIndigena21.setVisibility(v);

    }
    public void expand22(View view){
        int v = (txtInfoIndigena22.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout22, new AutoTransition());
        txtInfoIndigena22.setVisibility(v);

    }
    public void expand23 (View view){
        int v = (txtInfoIndigena23.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout23, new AutoTransition());
        txtInfoIndigena23.setVisibility(v);

    }
    public void expand24 (View view){
        int v = (txtInfoIndigena24.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout24, new AutoTransition());
        txtInfoIndigena24.setVisibility(v);

    }
    public void expand25 (View view){
        int v = (txtInfoIndigena25.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout25, new AutoTransition());
        txtInfoIndigena25.setVisibility(v);

    }
    public void expand26 (View view){
        int v = (txtInfoIndigena26.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout26, new AutoTransition());
        txtInfoIndigena26.setVisibility(v);

    }
    public void expand27 (View view){
        int v = (txtInfoIndigena27.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout27, new AutoTransition());
        txtInfoIndigena27.setVisibility(v);

    }
    public void expand28 (View view){
        int v = (txtInfoIndigena28.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout28, new AutoTransition());
        txtInfoIndigena28.setVisibility(v);

    }

    public void expand29 (View view){
        int v = (txtInfoIndigena29.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout29, new AutoTransition());
        txtInfoIndigena29.setVisibility(v);

    }

}