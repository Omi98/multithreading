/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omamakhan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // calling all the methods
        Factorial fact = new Factorial();
        
        Thread1 t1 = new Thread1(fact);
        Thread2 t2 = new Thread2(fact);
        
        // starting both threads simultaneously
        t1.start();
        t2.start();
    }
    
}
