package Intermediate.Exercise1;

/**
 *
 * @author dvchinx
 */
public class Multp {

    protected float a, b;

    public Multp() {
    }

    public int Operacion(float a, float b) {
        return (int) Math.round(a * b);
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

}
