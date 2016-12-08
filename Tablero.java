/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dots;

import java.util.Random;
public class Tablero { 
     int n; //Dimension
     Random k = new Random(6);
     public Casilla[][] C;
     Jugada jugada;
  
    //Metodos:
    public Tablero (int n){
       this.C = new Casilla[n][n];
       this.n = n;
    }

    public void llenarTab(){
         for (int i=0; i < n; i++){
            for (int j=0; j < n; j++){
                C[i][j]=new Casilla(n);
            }
       }
    }
     @Override
    public String toString(){
        String S=" ";
        
             for (int i=0;i < C.length;i++){
                for (int j=0; j < C.length; j++){
                    
                    S+= C[i][j].getFicha() +"|";
                    S+= " ";
            }
            S+= " \n ";
    }
     return S;
 }
   public void gravedad(){
       
   };
    public void validarJugada(){
        for (int i=0;i < C.length;i++){
                for (int j=0; j < C.length; j++){
                    if (jugada.jugadaLineal(C, i, j))
                        
                }
        }
                
       }
    
}
 