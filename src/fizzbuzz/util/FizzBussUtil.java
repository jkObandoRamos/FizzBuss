/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz.util;

public class FizzBussUtil{
    
    /*
    * Method to evaluate a number FizzBuss game
    *@Params
    *Integer: number
    *@Return
    *String: Return a message whit the evaluation
    *@autor: Jean Karlo Obando
    */
    

     public static String evaluateFizzBuss (Integer number){
         try{
         boolean isFizz= number%3==0;
         boolean isBuss = number%5==0;
         String message="";
         
         if(isFizz)
             message = "FIZZ";
         if(isBuss)
             message += "BUSS";

         if(!isFizz && !isBuss)
             message = number.toString();
         
         return message;
         }
         catch (ClassCastException e)
         {
             throw e;
         }
     }
         
     


    
}
