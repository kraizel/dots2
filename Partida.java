/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dotslab8;

import java.util.Scanner;

/**
 *
 * @author LAB_A112
 */
public class Partida  {
      int score=0;    
      Jugada jugada;
      Scanner sc1= new Scanner(System.in);
      public Partida (){
       jugada= new Jugada();
      }
     
      public void begin(Tablero t){
           t.llenarTab();
          
           while (score != 100){
           System.out.println(t.toString());
           System.out.print("Inserte coordenadas de la casilla con la que desea iniciar una jugada");
           
          
           int i=sc1.nextInt();
           int j=sc1.nextInt();
             
              if (t.getTab().validarVecino(i, j)){
                  jugada.jugadaLineal(i, j);
              }
           }
      }
}
     
 
