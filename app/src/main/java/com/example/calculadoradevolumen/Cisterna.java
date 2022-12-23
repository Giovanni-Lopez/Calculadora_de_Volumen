package com.example.calculadoradevolumen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        String vl1String = vl1.getText().toString();
        String vl2String = vl2.getText().toString();

        double vl1Double = Double.valueOf(vl1String);
        double vl2Double = Double.valueOf(vl2String);

        DecimalFormat formato = new DecimalFormat("#.###");
        Double radio = (vl1Double  / 2);
        Double volumCilindro = 3.1416 * (radio * radio) * vl2Double;
        String resul = String.valueOf(formato.format(volumCilindro));
        txtRespuesta.setText(resul+" U³");

    } //Fin metodo calcularVolumenCilindro
}