/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dots;

/**
 *
 * @author c0ep
 */
public abstract class Ficha {
    //Atributos
     private final double forma;
    
    // Metodos
     
     public  Ficha(int forma){ // Constructor
        this.forma=forma;
};
    public abstract void pintarFicha();
    public abstract void borrarFicha();
    
}
