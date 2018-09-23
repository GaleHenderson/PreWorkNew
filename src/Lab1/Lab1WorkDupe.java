package Lab1;

import java.util.Scanner;

public class Lab1WorkDupe {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);

	      int userInput1 = 0;
	      int userInput2 = 0;
	      
	      int hundreds1 = 0;
	      int tens1 = 0;
	      int ones1 = 0;
	      
	      int hundreds2 = 0;
	      int tens2 = 0;
	      int ones2 = 0;
	      
	      int hundredsSum = 0;
	      int tensSum = 0;
	      int onesSum = 0;
	      
	      
	      //This will prompt user for input and guide them if not a 3-digit integer
	      System.out.println("Please enter your first 3-digit number");
	      userInput1 = scnr.nextInt();
	      
	      	while ((userInput1 < 100) || (userInput1 > 999)) {
		         System.out.println("Whoops! Please type a 3-digit number");
		         userInput1 = scnr.nextInt();
		      } 
	      	if ((userInput1 >= 100) || (userInput1 <= 999)) {
		    	 System.out.println("Thank you!");
		      }
	      
	    //Determines hundreds place digit of userInput1
        hundreds1 = userInput1 / 100;
        
        //Determines tens digit of userInput1
        tens1 = (userInput1 % 100) / 10;

        //Determines ones digit of userInput1
        ones1 = (userInput1 % 10);
        
      //This will prompt user for input and guide them if not a 3-digit integer
        System.out.println("Please enter a second 3-digit number");
	      userInput2 = scnr.nextInt();  
	      
	      while ((userInput2 < 100) || (userInput2 > 999)) {
		         System.out.println("Whoops! Please type a 3-digit number");
		         userInput2 = scnr.nextInt();
		      } 
	      if ((userInput2 >= 100) || (userInput2 <= 999)) {
		    	 System.out.println("Thank you!");
		      }
	      
	      //Determines hundreds place digit of userInput2
        hundreds2 = userInput2 / 100;
        

        //Determines tens digit of userInput2
        tens2 = (userInput2 % 100) / 10;
        

        //Determines ones digit of userInput2
        ones2 = (userInput2 % 10);
        
        
        //Determines equality in place values of inputs 1 & 2
        hundredsSum = hundreds1 + hundreds2;
        tensSum = tens1 + tens2;
        onesSum = ones1 + ones2;
      		  
    if ((hundredsSum == tensSum) && (tensSum == onesSum)) {
	         System.out.println("True");
	      }
    
    else if ((hundredsSum != tensSum) && (tensSum != onesSum)) {
	         System.out.println("False");
	      }
    scnr.close();
    
	}

}
