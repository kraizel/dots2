/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dots;

final public class Tablero {
    private final int x,y; //Filas y columnas
    private final double[][] valor;// Valor posicion
    private Casilla casilla;
 
    //Metodos:
    public Tablero (int x, int y){ // Asigna # de filas y de columnas
        this.x=x;
        this.y=y;
        valor= new double[x][y];
        
      };
  
    public void pintarmatriz(Tablero A,int x, int y){
        for (int i=0; i<=x; i++)
            for (int j=0; j<=y;j++){
             
              System.out.print(A.valor[i][j]);
           
            };
    };
    public void llenarMatriz(int x, int y){
        Tablero A= new Tablero(x,y);
        for (int i=0; i<x ; i++){
            for (int j=0; j<y ;j++){
             A.valor[i][j] = (Math.random() * 6)+1;
            }
           }
    }

};