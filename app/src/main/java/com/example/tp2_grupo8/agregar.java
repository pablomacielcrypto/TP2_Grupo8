package com.example.tp2_grupo8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class agregar extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    //EditText que se envian al Formulario 2
    private EditText et_nombre;
    private EditText et_apellido;
    private EditText et_telefono;
    private EditText et_email;
    private EditText et_direccion;
    private EditText et_fecha;
    private Spinner s1;
    private Spinner s2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {


           super.onCreate(savedInstanceState);
           setContentView(R.layout.agregar);
           this.setTitle("Ejercicios Controles");
           et_nombre = (EditText) findViewById(R.id.editTextTextPersonName2);
           et_apellido = (EditText) findViewById(R.id.edApe);
           et_telefono = (EditText) findViewById(R.id.editTextPhone);
           et_email = (EditText) findViewById(R.id.editTextTextEmailAddress);
           et_direccion = (EditText) findViewById(R.id.editTextDireccion);
           et_fecha = (EditText) findViewById(R.id.editTextDate);
           s1 = (Spinner) findViewById(R.id.spinner);
           s2 = (Spinner) findViewById(R.id.spinner2);
      }

}




