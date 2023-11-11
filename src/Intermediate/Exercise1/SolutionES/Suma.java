package Intermediate.Exercise1.SolutionES;

/**
 *
 * @author dvchinx
 */
public class Suma {

    protected float a, b;

    public Suma() {
    }

    public int Operacion(float a, float b) {
        return (int) Math.round(a + b);
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
