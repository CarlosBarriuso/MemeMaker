package com.example.maana.ejemplodelistview;

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


public class ActividadList extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// almacenamos los recursos en un Array
        String[] adobe_products = getResources().getStringArray(R.array.adobe_products);
// asociamos los elementos del Array a un ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_intent_layout, R.id.label, adobe_products));
        ListView lv = getListView();
// escuchamos onClick de los elemnots
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
// selected item
                String product = ((TextView) view).getText().toString();
// lanzamos la actividad al seleccionar un elemento
                Intent i = new Intent(getApplicationContext(), Single_List_Inten.class);
// sending data to new activity
                i.putExtra("product", product);
                startActivity(i);
            }
        });
    }
}
