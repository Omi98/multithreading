/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omamakhan
 */

import java.math.BigInteger;

public class Factorial {
    public synchronized void printFactorial(int number, String name) {
        try {
            BigInteger value = new BigInteger("1");
            
            for (int count = 1; count <= number; count ++) {
                value = value.multiply(BigInteger.valueOf(count));
                
                Thread.sleep(10);
            }
            
            System.out.println("\n" + name + " factorial of " + number + " is: " + value);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
