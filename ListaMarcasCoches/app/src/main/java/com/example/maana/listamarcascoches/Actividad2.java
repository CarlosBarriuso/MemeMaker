package com.example.maana.listamarcascoches;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by Mañana on 16/01/15.
 */
public class Actividad2 extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.actividad2_layout);
        TextView txtMarca = (TextView) findViewById(R.id.label);
        Intent i = getIntent();
// obtenemos los datos asociados al intent
        String marca = i.getStringExtra("marca");
// comparar el valor recibido con los elementos


// mostramos por pantalla
            
        }
}
