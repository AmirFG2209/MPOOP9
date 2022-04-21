/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author amirs
 */
public class Mesero extends Empleado {
    private String restaurante;
    private int numMesas;
    private String colorUniforme;

    public Mesero(String nombre, int edad, String restaurante, int numMesas, String colorUniforme, float salario, String horaEntrada, String horaSalida, String colorTenis) {
        super(salario, horaEntrada, horaSalida, colorTenis, nombre, edad);
        this.restaurante = restaurante;
        this.numMesas = numMesas;
        this.colorUniforme = colorUniforme;
    }

    
    
    
    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public String getColorUniforme() {
        return colorUniforme;
    }

    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }

    @Override
    public String toString() {
        return super.toString()+" Mesero{" + "restaurante=" + restaurante + ", numMesas=" + numMesas + ", colorUniforme=" + colorUniforme + '}';
    }
    
    
    
    /**
     * Este metodo indica cuando el mesero recibe los pedidos
     */
    public void recibirPedidos(){
        System.out.println("Estoy a sus ordenes, ¿cual será su orden?");
    }
    /**
     * Este metodo indica cuando el mesero ha traido los pedidos
     */
    public void darPedido(){
        System.out.println("Aqui tiene su pedido señor");
    }
    /**
     * Este metodo recibe como parametro la cantidad de propina que le dejan al mesero
     * de manera siguiente, el mesero agradece por la misma
     * @param cantidad 
     */
    public void recibirPropina(int cantidad){
        System.out.println("Gracias por"+ cantidad + "pesos de propina");
    }
    /**
     * Este metodo indica cuando el mesero tomará su descanso
     */
    public void tomarDescanso(){
        System.out.println("Es hora de mi descanso");
    }

    @Override
    public void aclararDudas() {
        System.out.println("Si me permite, le puedo aclarar cualquier duda del menu, usted pregunte");
        }

    @Override
    public void respirar() {
        System.out.println("*respira* ser mesero es cansado");
       }
    
}
