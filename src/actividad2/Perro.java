/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;
/**
 *
 * @author alumno
 */
public class Perro extends Mascota{
    private  boolean colaCortada;
    
    public Perro(String nombre, int edad, String color, String colorOjos, String raza,  boolean colaCortada ) {
        super(color, colorOjos, raza, nombre, edad);
        this.colaCortada = colaCortada;
    }
    
    
    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }

    @Override
    public String toString() {
        return super.toString()+" Perro{" + "colaCortada=" + colaCortada + '}';
    }

    /**
     * Este metodo indica cuando el perro comienzá a correr
     */
    public void correr(){
        System.out.println("¡¡¡¡¡¡Mira humano, estoy corriendo!!!!!!!!");
    }
    /**
     * Este metodo indica cuando el perro corretea un objetivo
     */
    public void corretear(){
        System.out.println("TE ALCANZARÉEEEEEEE");
    }

    @Override
    public void jugar() {
        System.out.println("Juguemos con mi pelota, soy un perro");
     }

    @Override
    public void saltar() {
        System.out.println("Saltaré por ese premio");
     }

    @Override
    public void dormir() {
        System.out.println("soy un perro, iré a dormir");
    }

    @Override
    public void respirar() {
        System.out.println("*respira perrunamente*");
    }

}

