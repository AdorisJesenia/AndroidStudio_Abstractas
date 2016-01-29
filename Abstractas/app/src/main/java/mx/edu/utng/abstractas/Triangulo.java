package mx.edu.utbg.abstractas;

/**
 * Created by Jessy on 22/01/2016.
 */
public class Triangulo extends Figura{
    private float altura;
    private float base;
    public float calcularArea(){
        return base*altura/2;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}
