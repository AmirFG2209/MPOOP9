/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public abstract class Profesor extends Empleado {
    private int numAlumns;

    public Profesor(int numAlumns, float salario, String horaEntrada, String horaSalida, String colorTenis, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, colorTenis, nombre, edad);
        this.numAlumns = numAlumns;
    }

   

    
    /**
     * Metodo para reprobar al alumnado encargado del profesor
     */
    public abstract void reprobar();
    
    /**
     * Metodo para acreditar al alumnado encargado del profesor
     */
    public abstract void pasarAlumno();
    /**
     * Metodo para que el profesor comience la explicacion de un tema
     */
    public abstract void explicar(); 
    
    @Override
    public String toString() {
        return super.toString()+" Profesor{" + "numAlumns=" + numAlumns + '}';
    }
}
