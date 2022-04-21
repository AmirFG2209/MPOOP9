/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona{
    private String carrera;
    private int semestre;

    public Alumno(String carrera, int semestre, String colorTenis, String nombre, int edad) {
        super(colorTenis, nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }


    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + '}';
    }
   
   
   /**
    * Este metodo indica cuando el alumno comenzará a poner atencion
    */
   public void aprender(){
       System.out.println("Pondré atencion para aprender más");
   }
   /**
    * Este metodo sirve para indicarnos cuando el alumno comenzará a estudiar
    */
   public void estudiar(){
       System.out.println("Bien, hora de estudiar");
   }
   /**
    * Este metodo lo utilizará el alumno cuando esté en problemas con una materia y no crea acreditar
    */
   public void darseDeBaja(){
       System.out.println("No puedo más con este semestre, lo darpe de baja");
   }

    @Override
    public void respirar() {
        System.out.println("soy un alumno que respira");
       }
   
    
}
