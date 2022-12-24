package com.example.calculadoradevolumen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Cisterna extends AppCompatActivity {

    private EditText vl1, vl2;
    private TextView txtRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cisterna);

        vl1 = findViewById(R.id.vl1);
        vl2 = findViewById(R.id.vl2);
        txtRespuesta = findViewById(R.id.txtRespuesta);

    }

    public void calcularVolumenCilindro(View view){

        if(validar()){

        String vl1String = vl1.getText().toString();
        String vl2String = vl2.getText().toString();

        double vl1Double = Double.valueOf(vl1String);
        double vl2Double = Double.valueOf(vl2String);

        DecimalFormat formato = new DecimalFormat("#.###");
        Double radio = (vl1Double  / 2);
        Double volumCilindro = 3.1416 * (radio * radio) * vl2Double;
        String resul = String.valueOf(formato.format(volumCilindro));
        txtRespuesta.setText(resul+" U³");
        }

    } //Fin metodo calcularVolumenCilindro

    public boolean validar(){
        boolean retorno = true;

        String v1 = vl1.getText().toString();
        String v2 = vl2.getText().toString();

        if (v1.isEmpty()){
            vl1.setError("Ingrese Diametro");
            retorno=false;
        }

        if (v2.isEmpty()){
            vl2.setError("Ingrese Altura");
            retorno=false;
        }

        return retorno;
    } //Fin metodo Validar
}