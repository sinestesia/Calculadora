package es.pamp.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String op = savedInstanceState.getString("operacion");



    }

   /* @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(valor);
        super.onSaveInstanceState(outState);

    }*/






}
