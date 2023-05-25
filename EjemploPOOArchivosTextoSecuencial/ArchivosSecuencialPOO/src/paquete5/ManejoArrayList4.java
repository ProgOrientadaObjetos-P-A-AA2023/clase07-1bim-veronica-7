/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete5;
import java.util.ArrayList;
import java.util.Arrays;
import paquete1.*;
/**
 *
 * @author Usuario
 */
public class ManejoArrayList4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String linea = "Andrea Solano; contratado";
        
        ArrayList<String> linea_partes = new ArrayList<>(
            Arrays.asList(linea.split(";")));
        
        Profesor profe = new Profesor(linea_partes.get(0),
        linea_partes.get(1));
        
        System.out.println(profe);
    }
    
}
