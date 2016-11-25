/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dots;

import java.util.Random;

/**
 *
 * @author c0ep
 */
public class Casilla  {
     private int  orden=0;//Orden de la matriz
     private  Ficha[][] ficha; //Matriz de fichas
     private Random r=new Random();
    
     Casilla(int x){  
       this.orden=x;
       this.ficha = new Ficha[x][x];
       this.llenarMatriz(ficha); 
}  
    public void llenarMatriz(Ficha[][] ficha){
        Ficha f;
        for (int x=0; x  < orden; x++){
            for (int y=0 ; y< orden; y++){
                f= new Ficha(r.nextInt(5));
                ficha[x][y]=f;
            }
        }
    }
    public Ficha[][] getMatriz(){
        return this.ficha;
    }
    public int getOrden(){
        return orden;
    }
    }
    
    

    
    