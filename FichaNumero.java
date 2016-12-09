/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dotslab8;

/**
 *
 * @author LAB_A112
 */
public class FichaNumero extends Ficha{
    public int forma;
   
    public FichaNumero(int n){
       this.forma=n;
     }
    
    @Override
    public int getValor(){
        return this.forma;
   }
    
    
 
    
    
}
