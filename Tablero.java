/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dots;

 public class Tablero {
    private final int x,y; //Filas y columnas
    public Casilla[][] casillas;// Casillas del tablero
    
    //Metodos:
    public Tablero (int x, int y){ // Asigna # de filas y de columnas
        this.x=x;
        this.y=y;     
      };
  
    public void pintarmatriz(Tablero A,int x, int y){
        for (int i=0; i<=x; i++)
            for (int j=0; j<=y;j++){
             
           
            };
    };
    public void llenarMatriz(int x, int y){
        for (int i=0; i<x ; i++){
            for (int j=0; j<y ;j++){
             this.casillas[i][j]= new Casilla((Math.random() * 6)+1);
            }
           }
    }

};