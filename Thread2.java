/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omamakhan
 */

public class Thread2 extends Thread {
    // VU ID: BC160400533
    
    // storing 33 in thread2 class
    public int id2 = 33;
    
    // creating object of Factorial method
    private Factorial fact2;
    
    // creating object thread1 class
    public Thread2(Factorial factorial) {
        this.fact2 = factorial; 
    }
    
    // run method (calling printFactorial method)
    public void run() {
        for (int i = 0; i < id2; i ++)
        {
            try {
                fact2.printFactorial(i, "Thread 2");
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}