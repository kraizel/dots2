/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dots;

 public class Tablero { 
    //Metodos:
    public Tablero (Casilla casilla){ // Asigna # de filas y de columnas
        this.pintarmatriz(casilla);
      };
  
    public void pintarmatriz(Casilla casilla){
        Ficha[][] m= casilla.getMatriz();
        int orden= casilla.getOrden();
       
        for (int i=0; i<=orden; i++){
            for (int j=0; j<=orden;j++){
              System.out.print(m[i][j].getForma() + "|");
            };           
        System.out.println();
    };
    }

};