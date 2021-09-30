package testprograms;

import java.util.Scanner;

public class factorialprgm {
@SuppressWarnings("resource")
public static void main(String[] args) {  
        
        //declaring and variables   
        int fact = 1;  
        int i = 1;  
  
        //creating object of Scanner class  
        Scanner s = new Scanner(System.in);  
  
        //accepting a number from the user  
        System.out.println("Enter a number whose factorial is to be found: ");  
        int num = s.nextInt();  
          
        //counting the factorial using while loop  
        while( i <= num ){ 
            fact = fact * i;   
            i++; //increment i by 1   
        }     
  
        //printing the result  
        System.out.println("\nFactorial of " + num + " is: " + fact);  
    } 


}
