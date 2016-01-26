package mx.edu.utng.abstractas;

/**
 * Created by angel on 22/01/16.
 */
public class Triangulo extends Figura {
    private float base;
    private float altura;

    @Override
    public float calcularArea() {
        return (base*altura)/2;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
