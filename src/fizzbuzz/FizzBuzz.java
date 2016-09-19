/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Labs-DECC
 */



public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // System.out.println("The number is: " + fizzbuzz.util.FizzBussUtil.evaluateFizzBuss(3));
        
        for(int i=1; i<=15;i++)
        {
           System.out.print(fizzbuzz.util.FizzBussUtil.evaluateFizzBuss(i)+" "); 
        }
    }
    
}
