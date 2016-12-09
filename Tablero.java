/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dotslab8;
import java.util.Random;

public class Tablero { 
     int n; //Dimension
     public Casilla[][] C;
     
     /* Metodoque se implementan:
     * 
     *  Creacion del tablero (Arreglo Bidimensional de Casillas)
     *  Salida por pantalla
     *  Validacion de las casillas vecinas en la casilla donde se desea comenzar una jugada
     *  Validacion de jugadas posibles desde la casilla
     *  Verifico si las coordenadas de la casilla no se encuentran en un extremo o limite del tablero
     */
     
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
     
   public boolean validarVecino(int i, int j){
          boolean f=false;   //Consideramos que no tiene vecinos
          if ((i < this.n-1) && (j < this.n-1)){
               
                if  ( (C[i][j-1]!= null) && (this.C[i][j].getFicha()== this.C[i][j-1].getFicha()) ) {
                     f = true; 
                     
                    }
                else if  ( C[i][j+1]!= null && (this.C[i][j].getFicha()== this.C[i][j+1].getFicha()) ) {
                     f = true;
                    
                    }
                else if  ( C[i-1][j]!= null && (this.C[i][j].getFicha()== this.C[i-1][j].getFicha()) ) {
                     f = true;
                     
                    }
                else if  ( C[i+1][j]!= null && (this.C[i][j].getFicha()== this.C[i+1][j].getFicha()) ) {
                     f = true;
                     
                    }
                
                else {
                System.out.println("Casilla sin vecinos");
                }
          } else System.out.println("Casilla no valida");
          return f;
   }
   
    public Tablero getTab(){
        return this;
    }
        
        }
                
       
    

