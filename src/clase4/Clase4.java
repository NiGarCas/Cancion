/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Clase4 {

    public static int funcion1 (int dato){
        int positivo = dato * -1;
        int salida = positivo;
        return salida;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i =0;
        int numero;
        System.out.println ("Ingrese un numero");
        Scanner flujoEntrada = new Scanner(System.in);
        numero = flujoEntrada.nextInt();
        if (numero > 0){
            while (!(i > numero)){
                System.out.println (i);
                i = i + 1;
            }
        }else{
            int resultado = 0;
            resultado = funcion1(numero);
            System.out.println (resultado);
        }
        // TODO code application logic here
    }
    
}
