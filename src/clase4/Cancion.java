/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author Estudiante
 */
public class Cancion {
    // Atributos
    public String titulo;
    // Metodos
    public void sonar(){
        System.out.println("Sonando" + this.titulo);
    }
    public static void main (){
    Cancion cancion1 = new Cancion();
    cancion1.titulo = "Close to me";
    cancion1.sonar();
}
}
