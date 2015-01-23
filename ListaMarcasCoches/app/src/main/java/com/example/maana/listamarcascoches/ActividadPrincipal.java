package com.example.maana.listamarcascoches;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class ActividadPrincipal extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// almacenamos los recursos en un Array
        String[] marcas_coches = getResources().getStringArray(R.array.lista_de_marcas);
// asociamos los elementos del Array a un ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_actividad_principal,
                R.id.label,marcas_coches));
        ListView lv = getListView();
// escuchamos onClick de los elemnots
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
// seleccionamos el item
                String marca = ((TextView) view).getText().toString();
// lanzamos la actividad al seleccionar un elemento
                Intent i = new Intent(getApplicationContext(), Actividad2.class);
// sending data to new activity
                i.putExtra("marcas_coches", marca);
                startActivity(i);
            }
        });
    }

}
