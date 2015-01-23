package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class Assets extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assets);

        // se crea un TextView que contendrá el contenido del fichero de texto y lo
        // mostrará por pantalla
        TextView textView = new TextView(this);
        setContentView(textView);

        // creamos una instancia de la clase AssetManager
        AssetManager assetManager = getAssets();

        // definimos una variable inputStream vacía
        InputStream inputStream = null;

        try {
            inputStream =assetManager.open("canciones/la lola.txr");
            ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[4096];
            int len =0;
            while((len = inputStream.read(bytes))>0)
                byteStream.write(bytes,0,len);

            String text = new String(byteStream.toByteArray(),"UTF8");
            textView.setText(text);

        } catch (IOException e) {
            textView.setText("No se puede cargar el archivo");
        }
        finally {
            if(inputStream !=null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    textView.setText("No se puede cargar el archivo");
                }
        }

    }



}
