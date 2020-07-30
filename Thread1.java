/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omamakhan
 */

public class Thread1 extends Thread {
    // VU ID: BC160400533
    
    // storing 05 in thread1 class
    public int id1 = 05;
    
    // creating object of Factorial method
    private Factorial fact1;
    
    // creating object thread1 class
    public Thread1(Factorial factorial) {
        this.fact1 = factorial; 
    }
    
    // run method (calling printFactorial method)
    public void run() {
        for (int i = 0; i < id1; i ++)
        {
            try {
                fact1.printFactorial(i, "Thread 1");
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}