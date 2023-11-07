/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intermediate.Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Div {

    protected float a, b;

    public Div() {
    }

    public int Operacion(float a, float b) {
        return (int) Math.round(a / b);
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
