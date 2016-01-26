package mx.edu.utng.abstractas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by angel on 22/01/16.
 */
public class AreasActivity extends Activity {

    private Triangulo triangulo;
    private Cuadrado cuadrado;
    private EditText edtLado;
    private EditText edtAltura;
    private EditText edtBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areas_layout);
        cuadrado = new Cuadrado();
        edtLado = (EditText)findViewById(R.id.edt_lado);
        triangulo = new Triangulo();
        edtAltura = (EditText)findViewById(R.id.edt_altura);
        edtBase = (EditText)findViewById(R.id.edt_base);

    }

    public void calcular(View view){
        float lado = Float.parseFloat(
                edtLado.getText().toString());
        cuadrado.setLado(lado);
        Toast.makeText(this, "Area del cuadrado: "
                                        +cuadrado.calcularArea(),
                Toast.LENGTH_SHORT).show();
    }

    public void calcularAreaTriangulo(View view){
        float altura = Float.parseFloat(
                edtAltura.getText().toString());
        triangulo.setAltura(altura);
        float base = Float.parseFloat(
                edtBase.getText().toString());
        triangulo.setBase(base);
        Toast.makeText(this, "Area del triangulo: "
                                            +triangulo.calcularArea(),
                Toast.LENGTH_SHORT).show();
    }
}
