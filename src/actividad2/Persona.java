/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public abstract class Persona extends SerVivo {
    private String colorTenis;

    public Persona(String colorTenis, String nombre, int edad) {
        super(nombre, edad);
        this.colorTenis = colorTenis;
    }

    

    public String getColorTenis() {
        return colorTenis;
    }

    @Override
    public String toString() {
        return super.toString()+"Persona{" + "colorTenis=" + colorTenis + '}';
    }
    
    

    
}
