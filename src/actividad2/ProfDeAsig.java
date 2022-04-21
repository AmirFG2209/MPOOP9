/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class ProfDeAsig extends Profesor{
    
    private String nomAsig;

    public ProfDeAsig(String nombre, int edad, String nomAsig, int numAlumns, float salario, String horaEntrada, String horaSalida, String colorTenis) {
        super(numAlumns, salario, horaEntrada, horaSalida, colorTenis, nombre, edad);
        this.nomAsig = nomAsig;
    }

    

    public String getNomAsig() {
        return nomAsig;
    }

    public void setNomAsig(String nomAsig) {
        this.nomAsig = nomAsig;
    }

    @Override
    public String toString() {
        return super.toString()+"ProfDeAsig{" + "nomAsig=" + nomAsig + '}';
    }

    
    
    @Override
    public void reprobar() {
        System.out.println("Has reprobado mi asignatura, lo siento");
        }

    @Override
    public void pasarAlumno() {
        System.out.println("Has acreditado mi asignatura, felicidades");
    }

    @Override
    public void explicar() {
        System.out.println("Iniciaremos la explicacion de este tema");
       }

    @Override
    public void aclararDudas() {
        System.out.println("¿En que tema tienes duda? Te puedo ayudar en temas de esta signatura");
    }

    @Override
    public void respirar() {
        System.out.println("*respira*\n me gusta respirar como profe de asignatura");
    }

}
