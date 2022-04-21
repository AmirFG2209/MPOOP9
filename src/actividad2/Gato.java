/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Gato extends Mascota{
    private String coloCollar;

    public Gato(String nombre, int edad, String coloCollar, String color, String colorOjos, String raza) {
        super(color, colorOjos, raza, nombre, edad);
        this.coloCollar = coloCollar;
    }

    public String getColoCollar() {
        return coloCollar;
    }

    public void setColoCollar(String coloCollar) {
        this.coloCollar = coloCollar;
    }

    
    @Override
    public String toString() {
        return super.toString()+" Gato{" + '}';
    }
    
    public void rasguñar(){
        System.out.println("TSSSSSS *sonido de rasguños*");
        
    }
    public void trepar(){
        System.out.println("Mira humano, estoy trepando, ahora soy más alto que tu");
    }

    @Override
    public void jugar() {
        System.out.println("Jugemos con mi estambre");
        
    }

    @Override
    public void saltar() {
        System.out.println("Saltaré por ese pajarito");
    }

    @Override
    public void dormir() {
        System.out.println("*Duerme en modo gatuno*");
    }

    @Override
    public void respirar() {
        System.out.println("*respira como gato*");
    }
    
}

