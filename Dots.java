/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dotslab8;

/**
 *
 * @author LAB_L11
 */
import java.util.Scanner;
public class Dots {

public static void main(String[] args) {
            Partida p= new Partida();
            Tablero t= new Tablero(5);
            Scanner i= new Scanner(System.in);
            
                System.out.println("1. Iniciar Juego \n");
                
                System.out.println("2. Salir \n");
                
                int op= i.nextInt();
               
                switch(op){
                    case 1: p.begin(t); 
                            break;
                    case 2: break;
                }
            
           
        
    }
}