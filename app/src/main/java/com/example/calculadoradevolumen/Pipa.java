package com.example.calculadoradevolumen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Pipa extends AppCompatActivity {

    private EditText vl1, vl2, vl3;
    private TextView txtRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pipa);

        vl1 = findViewById(R.id.vl1);
        vl2 = findViewById(R.id.vl2);
        vl3 = findViewById(R.id.vl3);
        txtRespuesta = findViewById(R.id.txtRespuesta);


    }

    public void calcularVolumenPipa(View view){
        String vl1String = vl1.getText().toString();
        String vl2String = vl2.getText().toString();
        String vl3String = vl3.getText().toString();

        double vl1Double = Double.valueOf(vl1String);
        double vl2Double = Double.valueOf(vl2String);
        double vl3Double = Double.valueOf(vl3String);


        Double radio1 = (vl1Double  / 2);
        Double radio2 = (vl2Double  / 2);

        DecimalFormat formato = new DecimalFormat("#.###");
        Double volumenPipa = radio1 * radio2 * vl3Double * 3.1416;
        String resul = String.valueOf(formato.format(volumenPipa));
        txtRespuesta.setText(resul+" U³");

    } //Fin metodo calcularVolumen
}