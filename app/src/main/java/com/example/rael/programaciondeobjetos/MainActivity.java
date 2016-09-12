package com.example.rael.programaciondeobjetos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

    public void fade(View view) {
        ImageView parado = (ImageView) findViewById(R.id.batparado);
        ImageView feliz = (ImageView) findViewById(R.id.batfeliz);
        Button primer = (Button) findViewById(R.id.primerboton);
        Button segundo = (Button) findViewById(R.id.segundoboton);
        
        parado.animate().alpha(0f).setDuration(2000);
        feliz.animate().alpha(1f).setDuration(2000);

        primer.setEnabled(false);
        primer.setVisibility(View.INVISIBLE);
        segundo.setEnabled(true);
        segundo.setVisibility(View.VISIBLE);
    }

    public void moveFlanders(View view) {
        ImageView parado = (ImageView) findViewById(R.id.batparado);
        ImageView beatles = (ImageView) findViewById(R.id.batfeliz);
        Button segundo = (Button) findViewById(R.id.segundoboton);
        Button reinicio = (Button) findViewById(R.id.reiniciar);

        beatles.animate().translationXBy(1000f).setDuration(2000);
        parado.setVisibility(View.VISIBLE);
        parado.animate().translationYBy(3000f).setDuration(2000);

        segundo.setEnabled(false);
        segundo.setVisibility(View.INVISIBLE);

        reinicio.setEnabled(true);
        reinicio.setVisibility(View.VISIBLE);
    }

    public void resetImages(View view) {
        Button primero = (Button) findViewById(R.id.primerboton);
        Button reinicio = (Button) findViewById(R.id.reiniciar);
        ImageView parado = (ImageView) findViewById(R.id.batparado);
        ImageView feliz = (ImageView) findViewById(R.id.batfeliz);
        ImageView enojado = (ImageView) findViewById(R.id.batenojado);

        enojado.setVisibility(View.INVISIBLE);
        enojado.setTranslationY(-3000);
        feliz.setAlpha(0f);
        feliz.animate().translationX(0f).setDuration(0);
        parado.setAlpha(1f);

        reinicio.setEnabled(false);
        reinicio.setVisibility(View.INVISIBLE);

        primero.setEnabled(true);
        primero.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView flanders = (ImageView) findViewById(R.id.batenojado);
        flanders.setTranslationY(-3000);
    }
}
