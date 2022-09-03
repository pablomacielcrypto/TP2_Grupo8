package com.example.tp2_grupo8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Ejer_1 (View view)
    {
        Intent ejer_1 = new Intent( this, agregar.class);
        startActivity(ejer_1 );
    }
    //Metodo del boton ejercicio 2, Calculadora.




    public void Continuar (View view)
    {
        Intent continuar = new Intent( this, agregar.class);
        startActivity(continuar );
    }
    @Override public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu_nuevo,mimenu);
        return true;
    }




    @Override public boolean onOptionsItemSelected(MenuItem opcionMenu) {
        int id = opcionMenu.getItemId();


        if (id == R.id.AgregarContactos) {
            Ejer_1(null);
            return true;
        }

        return super.onOptionsItemSelected(opcionMenu);
    }
}