/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete5;
import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor2;
/**
 *
 * @author Usuario
 */
public class ManejoArrayList5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String[] lineas = {"Andrea Solano|contratado|27",
        "María Quezada|nombramiento|43","Juan Cevallos|contratado|30"};
    
        String nombre;
        String tipo;
        int edad;
    
        Profesor2[] profes = new Profesor2 [lineas.length];
    
        for (int i=0; i<lineas.length ;i++){
            ArrayList <String> lineas_partes = new ArrayList<>(
                    Arrays.asList(lineas[i].split("\\|")));
            /* ese \\| sirve para que los saltos de lineas sean cuando hay
             una barra separando a la cadena. */
            
            nombre = lineas_partes.get(0);
            tipo = lineas_partes.get(1);
            edad = Integer.parseInt(lineas_partes.get(2));

            profes[i] = new Profesor2(nombre,tipo,edad);
            System.out.printf("%s",profes[i]);
        }
    }
    
}
