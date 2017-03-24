package es.pamp.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String resultado = new String();
    private String resultado1 = new String();
    private String operacion = new String();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView resultadoTextView = (TextView)findViewById(R.id.resultado);
        resultado = "";
        resultado1 = "";
        operacion ="";

        //String op = savedInstanceState.getString("operacion");

        Button boton0 = (Button) findViewById(R.id.boton0);
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= resultado + "0";
                resultadoTextView.setText(resultado);

            }
        });
        Button boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= resultado + "1";
                resultadoTextView.setText(resultado);
            }
        });
        Button boton2 = (Button) findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= resultado + "2";
                resultadoTextView.setText(resultado);
            }
        });
        Button boton3 = (Button) findViewById(R.id.boton3);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= resultado + "3";
                resultadoTextView.setText(resultado);
            }
        });
        Button boton4 = (Button) findViewById(R.id.boton4);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= resultado + "4";
                resultadoTextView.setText(resultado);
            }
        });
        Button boton5 = (Button) findViewById(R.id.boton5);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= resultado + "5";
                resultadoTextView.setText(resultado);
            }
        });
        Button boton6 = (Button) findViewById(R.id.boton6);
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= resultado + "6";
                resultadoTextView.setText(resultado);
            }
        });
        Button boton7 = (Button) findViewById(R.id.boton7);
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= resultado + "7";
                resultadoTextView.setText(resultado);
            }
        });
        Button boton8 = (Button) findViewById(R.id.boton8);
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= resultado + "8";
                resultadoTextView.setText(resultado);
            }
        });
        Button boton9 = (Button) findViewById(R.id.boton9);
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= resultado + "9";
                resultadoTextView.setText(resultado);
            }
        });

        Button botonC  = (Button) findViewById(R.id.botonC);
        botonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= "";
                resultado1= "";
                resultadoTextView.setText(resultado);
            }
        });
        Button botonIgual = (Button) findViewById(R.id.botonIgual);
        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.equals("")){
                    resultado ="0";
                }
                if (resultado1.equals("")){
                    resultado1 ="0";
                }
                switch (operacion) {
                    case "div":
                        if (Integer.valueOf(resultado)==0){
                            resultado ="E";
                        }else{
                        resultado=String.valueOf(Math.ceil(Integer.valueOf(resultado1)/Integer.valueOf(resultado)));};
                        break;
                    case "mas":
                        resultado=String.valueOf(Integer.valueOf(resultado1)+Integer.valueOf(resultado));
                        break;
                    case "menos":
                        resultado=String.valueOf(Integer.valueOf(resultado1)-Integer.valueOf(resultado));
                        break;
                    case "multi":
                        resultado=String.valueOf(Integer.valueOf(resultado1)*Integer.valueOf(resultado));
                        break;
                }


                resultadoTextView.setText(resultado);
                resultado1=resultado;
                resultado="";
            }
        });
        Button botonDiv = (Button) findViewById(R.id.botonDiv);
        botonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado1 = resultado;
                resultado="";
                operacion= "div";
                resultadoTextView.setText(resultado);
            }
        });
        Button botonMas = (Button) findViewById(R.id.botonMas);
        botonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado1 = resultado;
                resultado = "";
                operacion= "mas";
                resultadoTextView.setText(resultado);
            }
        });
        Button botonMenos = (Button) findViewById(R.id.botonMenos);
        botonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado1 = resultado;
                resultado = "";
                operacion= "menos";
                resultadoTextView.setText(resultado);
            }
        });
        Button botonMulti = (Button) findViewById(R.id.botonMulti);
        botonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado1 = resultado;
                resultado = "";
                operacion= "multi";
                resultadoTextView.setText(resultado);
            }
        });


    }

   /* @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(valor);
        super.onSaveInstanceState(outState);

    }*/






}
