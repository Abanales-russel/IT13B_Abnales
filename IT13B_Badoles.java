/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class IT13B_Badoles { 
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 10;
        int y = 4;
        int w = 6;
        
       System.out.println(x + " * " + y + " + " + w + " = " + (x * y + w));
       System.out.println("(" + x + " - " + y + ")"+ " % " + w + " = " + ((x - y) % w));
       System.out.println("(" + x + " + " + y + " + " + w + ")" + "/" + 3 + " = " + ((x + y + w) / 3));
       System.out.println(x + " * " + w + " - "+ "(" + y + "*" + y + ")" +" = " + (x * w - (y * y)));
    }
    

    
}
