/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author amirs
 */
public class MainP9Act2 {
    public static void main(String[] args) {
        ProfDeAsig profe1= new ProfDeAsig("Juanito", 46, "Quimica", 30, 6_000f,"8:00 am", "11:00 am", "azul");
        System.out.println(profe1);
        profe1.respirar();
        Gato gato1= new Gato("simba", 3, "morado", "Amarillo", "Verdes", "somalí");
        Perro perro1= new Perro("pelusa", 4, "Gris","negros", "criollo", true);
        Mesero meseroEstrella= new Mesero("Enrique", 22, "El salmon de Oro", 4, "rojo", 5_000f, "12:00 pm", "7:00 pm", "Negros");
        ProfDeCar profe2= new ProfDeCar("Carlos", 51, 3, 65, 7_000f, "9:00 am", "2:00 pm", "cafes");
        gato1.respirar();
        perro1.respirar();
        profe2.respirar();
        meseroEstrella.respirar();
        
        
    
    }

    
}
