package mx.edu.utbg.abstractas;

/**
 * Created by Jessy on 22/01/2016.
 */
public class Cuadrado extends Figura{
    private float lado;


    public float calcularArea(){

        return lado*lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}

