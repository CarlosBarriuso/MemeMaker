package es.tessier.carlos.misproyectos;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ListActivity {

    private String practicas[] = {"GoogleJSON","Actividad_Intent_1","Assets"};

    final static String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        practicas);

        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView lista, View vista,
                                   int posicion, long id){
        super.onListItemClick(lista, vista, posicion, id);
        // guardamos el nombre de la actividad seleccionada
        String nombrePractica = practicas[posicion];
        try{
            Class<?> clase = Class.forName(
                    "es.tessier.carlos.misproyectos."+
                    nombrePractica);
            Intent intent = new Intent(this,clase);
            startActivity(intent);
        }
        catch(ClassNotFoundException e){
            Log.e(TAG,"Actividad no creada: ",e);
        }

    }



}
