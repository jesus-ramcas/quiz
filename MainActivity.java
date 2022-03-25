package com.uca.proyecto_jesusr;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioButton respuesta1, respuesta2, respuesta3;
    TextView txtNpregunta, txtPregunta;
    Button salir, siguiente;
    int nota = 0; int Npregunta = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuesta1 = (RadioButton)findViewById(R.id.respuesta1);
        respuesta2 = (RadioButton)findViewById(R.id.respuesta2);
        respuesta3 = (RadioButton)findViewById(R.id.respuesta3);

        txtNpregunta = (TextView)findViewById(R.id.txtNpregunta);
        txtPregunta = (TextView)findViewById(R.id.txtPregunta);

        siguiente = (Button)findViewById(R.id.siguiente);
        salir = (Button)findViewById(R.id.salir);
    }

    public void siguiente (View v){
        if(respuesta1.isChecked() == false && respuesta2.isChecked() == false && respuesta3.isChecked()==false){
            Toast.makeText(this, "Marque una opcion", Toast.LENGTH_SHORT).show();
        }else if(Npregunta == 1){
            if(respuesta1.isChecked()){
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;

            txtNpregunta.setText("Pregunta 2");
            txtPregunta.setText("¿Tienes tu gusto?");
            respuesta1.setText("Opcion 1 p2");
            respuesta2.setText("Opcion 2 p2");

            respuesta1.setChecked(false);
            respuesta2.setChecked(false);
            respuesta3.setChecked(false);
        }else if(Npregunta == 2) {
            if (respuesta1.isChecked()) {
                nota = nota + 2;
            }

            Npregunta = Npregunta + 1;

            txtNpregunta.setText("Pregunta 3");
            txtPregunta.setText("¿Te sientes bien?");
            respuesta1.setText("Opcion 1 p3");
            respuesta2.setText("Opcion 2 p3");
            respuesta3.setText("Opcion 3 p3");

            respuesta1.setChecked(false);
            respuesta2.setChecked(false);
            respuesta3.setChecked(false);
        }else if(Npregunta== 3) {
            if (respuesta1.isChecked()) {
                nota = nota + 2;
            }

            Npregunta = Npregunta + 1;

            txtNpregunta.setText("Pregunta 4");
            txtPregunta.setText("¿Tienes gripe?");
            respuesta1.setText("Opcion 1 p4");
            respuesta2.setText("Opcion 2 p4");
            respuesta3.setText("Opcion 3 p4");

            respuesta1.setChecked(false);
            respuesta2.setChecked(false);
            respuesta3.setChecked(false);
        }else if(Npregunta == 4) {
            if (respuesta1.isChecked()) {
                nota = nota + 2;
            }

            Npregunta = Npregunta + 1;

            txtNpregunta.setText("Pregunta 5");
            txtPregunta.setText("¿Te duelen los huesos?");
            respuesta1.setText("Opcion 1 p5");
            respuesta2.setText("Opcion 2 p5");
            respuesta3.setText("Opcion 3 p5");

            respuesta1.setChecked(false);
            respuesta2.setChecked(false);
            respuesta3.setChecked(false);
        }else if(Npregunta == 5) {
            if (respuesta1.isChecked()) {
                nota = nota + 2;
            }

            Npregunta = Npregunta + 1;

            txtNpregunta.setText("Pregunta 6");
            txtPregunta.setText("¿Puedes oler?");
            respuesta1.setText("Opcion 1 p6");
            respuesta2.setText("Opcion 2 p6");
            respuesta3.setText("Opcion 3 p6");

            respuesta1.setChecked(false);
            respuesta2.setChecked(false);
            respuesta3.setChecked(false);
        }else if(Npregunta == 6) {
            if (respuesta1.isChecked()) {
                nota = nota + 2;
            }

            Npregunta = Npregunta + 1;

            txtNpregunta.setText("Pregunta 7");
            txtPregunta.setText("¿Te duele la cabeza?");
            respuesta1.setText("Opcion 1 p7");
            respuesta2.setText("Opcion 2 p7");
            respuesta3.setText("Opcion 3 p7");

            respuesta1.setChecked(false);
            respuesta2.setChecked(false);
            respuesta3.setChecked(false);
        }else if(Npregunta == 7) {
            if (respuesta1.isChecked()) {
                nota = nota + 2;
            }

            Npregunta = Npregunta + 1;

            txtNpregunta.setText("Pregunta 8");
            txtPregunta.setText("¿sientes que es covid?");
            respuesta1.setText("Opcion 1 p8");
            respuesta2.setText("Opcion 2 pu");
            respuesta3.setText("Opcion 3 p8");

            respuesta1.setChecked(false);
            respuesta2.setChecked(false);
            respuesta3.setChecked(false);
        }else if(Npregunta == 8) {
            if (respuesta1.isChecked()) {
                nota = nota + 2;
            }

            Npregunta = Npregunta + 1;

            txtNpregunta.setText("Pregunta 9");
            txtPregunta.setText("¿Tienes tos?");
            respuesta1.setText("Opcion 1 p9");
            respuesta2.setText("Opcion 2 p9");
            respuesta3.setText("Opcion 3 p9");

            respuesta1.setChecked(false);
            respuesta2.setChecked(false);
            respuesta3.setChecked(false);
        }else if(Npregunta == 9) {
            if (respuesta1.isChecked()) {
                nota = nota + 2;
            }

            Npregunta = Npregunta+ 1;

            txtNpregunta.setText("Pregunta 10");
            txtPregunta.setText("¿Te dueen los ojos?");
            respuesta1.setText("Opcion 1 p10");
            respuesta2.setText("Opcion 2 p10");
            respuesta3.setText("Opcion 3 p10");

            respuesta1.setChecked(false);
            respuesta2.setChecked(false);
            respuesta3.setChecked(false);
        }else if(Npregunta == 10) {
            if (respuesta1.isChecked()) {
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;

            txtNpregunta.setText("Nota obtenida: "+nota);
            if(nota >= 6){
                txtPregunta.setText("Estado: Con covid");
            }else{
                txtPregunta.setText("Estado: Sin covid");
            }

            respuesta1.setVisibility(View.GONE);
            respuesta2.setVisibility(View.GONE);
            respuesta3.setVisibility(View.GONE);
            siguiente.setVisibility(View.GONE);
        }
    }

    public void Salir(View v){
        finish();
    }
}
