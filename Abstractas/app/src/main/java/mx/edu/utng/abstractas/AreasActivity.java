package mx.edu.utbg.abstractas;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by Jessy on 22/01/2016.
 */
public class AreasActivity extends Activity {
    private Cuadrado cuadrado;
    private EditText edtLado;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areas_layout);
        cuadrado =new Cuadrado();
        edtLado = (EditText)findViewById(R.id.edt_lado);


    }
public void calcular(){
    float lado=Float.parseFloat(
            edtLado.getText().toString());
    cuadrado.setLado(lado);
    Toast.makeText(this,
            "Area de cuadrado:"
    +cuadrado.calcularArea(),
            Toast.LENGTH_SHORT).show();

}

}
