package mx.edu.utbg.abstractas;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;

/**
 * Created by Jessy on 22/01/2016.
 */
public class AreaTrianguloActivity {
    private Triangulo triangulo;
    private EditText edtBase;
    private EditText edtAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areatr_layout);
        triangulo =new Triangulo();
        edtBase = (EditText)findViewById(R.id.edt_base);
        edtAltura = (EditText)findViewById(R.id.edt_altura);


    }
    public void calcular(){
        float base =Float.parseFloat(

                edtBase.getText().toString());
        triangulo.setBase(base);
        float altura = Float.parseFloat(
        edtAltura.getText().toString());
        triangulo.setAltura(altura);
        Toast.makeText(this,
                "Area de triangulo:"
                        + triangulo.calcularArea(),
                Toast.LENGTH_SHORT).show();

    }

}
