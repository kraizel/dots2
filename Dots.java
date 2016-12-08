/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dots;
/** @author c0ep**/ 

public class Dots {
    
    public static void main(String[] args) {
        int MaxScore=0;
        Tablero tab= new Tablero(5);

        // TODO code application logic here
        tab.llenarTab();
        System.out.println(tab.toString());
    }
    
}
    