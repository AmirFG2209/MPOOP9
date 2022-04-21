/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *
 * @author Amir
 */
public abstract class Poligono {
    
    /**
     * Metodo abstracto para el calculo del area
     * @return 
     */
    public abstract float area();
    
    /**
     * Metodo abstracto para el calculo del perimetro
     * @return 
     */
    public abstract float perimetro();

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
