/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author amirs
 */
public abstract class Empleado extends Persona {
    private float salario;
    private String horaEntrada;
    private String horaSalida;

    public Empleado(float salario, String horaEntrada, String horaSalida, String colorTenis, String nombre, int edad) {
        super(colorTenis, nombre, edad);
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    

    public float getSalario() {
        return salario;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }
    
    /**
     * Metodo para aclarar dudas a los encargados del empleado
     */
    public abstract void aclararDudas();
    
    @Override
    public String toString() {
        return super.toString()+ " Empleado{" + "salario=" + salario + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }
    
    
}
