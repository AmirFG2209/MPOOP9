/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public abstract class Mascota extends SerVivo{
    private String color;
    private String colorOjos;
    private String raza;

    public Mascota(String color, String colorOjos, String raza, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.colorOjos = colorOjos;
        this.raza = raza;
    }
    
    /**
     * Metodo para que el animal domestico comience a jugar
     */
    public abstract void jugar();
    
    /**
     * Metodo para que el animal domestico comience a saltar
     */
    public abstract void saltar();
    
    /**
     * Metodo que indica cuando la mascota tomará una siesta
     */
    public abstract void dormir();
    
     @Override
    public String toString() {
        return super.toString()+" Mascota{" + "color=" + color + ", colorOjos=" + colorOjos + ", raza=" + raza + '}';
    }
}
