/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller08;

/**
 *
 * @author USUARIO
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String palabra = "Universidad";
            char letras;
            for (int i = 0; i < palabra.length(); i++){
            letras = palabra.charAt (i);
            for (int j=0; j<=i; j++){
            System.out.printf("%s", letras);
            }
            System.out.println("");
            
        }
    }
}
    
    

