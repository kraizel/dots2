/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dotslab8;


import java.util.Random;

/**
 *
 * @author c0ep
 */
public class Casilla  {
   
    private FichaNumero ficha; //Contenido de la casilla
     Random r= new Random();
     
    
     public Casilla(int n){
        this.ficha= new FichaNumero(r.nextInt(6));
        
     }
     public int getFicha(){ // Obtengo la "forma" de la ficha en cada casilla
         return this.ficha.forma;
     }
}