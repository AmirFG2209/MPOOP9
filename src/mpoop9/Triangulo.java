/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *
 * @author Amir
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gamma;
    private float a, b, c; 
    private float base, altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public int getGamma() {
        return gamma;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
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

    @Override
    public String toString() {
        return super.toString()+ "Triangulo{" + '}';
    }
    
    
    /**
     * Metodo que calcula el área de un Triangulo
     * @return 
     */

    @Override
    public float area() {
        return base * altura / 2;
    }

    /**
     * Metodo que calcula el perimetro de un triangulo
     * @return 
     */
    @Override
    public float perimetro() {
        return a+b+c;
    }
    
}
