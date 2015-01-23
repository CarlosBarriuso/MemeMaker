package com.example.maana.ejemplodelistview;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Single_List_Inten extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list_item_view);
        TextView txtProduct = (TextView) findViewById(R.id.product_label);
        Intent i = getIntent();
// obtenemos los datos asociados al intent
        String product = i.getStringExtra("product");
// mostramos por pantalla
        txtProduct.setText(product);
    }
}
