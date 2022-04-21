/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class ProfDeCar extends Profesor{
    private int numAsig;

    public ProfDeCar(String nombre, int edad, int numAsig, int numAlumns, float salario, String horaEntrada, String horaSalida, String colorTenis) {
        super(numAlumns, salario, horaEntrada, horaSalida, colorTenis, nombre, edad);
        this.numAsig = numAsig;
    }

    


    public int getNumAsig() {
        return numAsig;
    }

    public void setNumAsig(int numAsig) {
        this.numAsig = numAsig;
    }

    @Override
    public String toString() {
        return super.toString()+ " ProfDeCar{" + "numAsig=" + numAsig + '}';
    }

    @Override
    public void reprobar() {
        System.out.println("Has reporbado mi materia");
       }

    @Override
    public void pasarAlumno() {
        System.out.println("Has acreditado mi materia");
       }

    @Override
    public void explicar() {
        System.out.println("Iniciaremos con la explicacion del tema");
       }

    @Override
    public void aclararDudas() {
        System.out.println("¿De que materia tienes duda? Te puedo ayudar");
        }

    @Override
    public void respirar() {
        System.out.println("Soy un profesor de carrera que respira");
      }
    
    
    
}
