//Number Guessing Game

import java.util.Scanner;
import java.util.Random;

 public class nogame{
	public static void main(String args[])
    { 
    		generateRandom();
    } 


    public static void generateRandom(){
    
    	Random rand=new Random();

    	//Generating a random number between 0-111
    	int randomNum=rand.nextInt(111);

    	guess(randomNum);
    }



    public static void guess(int randomNum){
    	
    	Scanner in=new Scanner(System.in);

    	
    	System.out.println("");
    	System.out.println("Number Guessing Game");
    	System.out.print("Guess a number between 0-111: ");
    	int guess=in.nextInt();
    	System.out.println("");

    
    	while (guess<0 || guess>111){
    		System.out.print("Guess a number between 0-111: ");
    		guess=in.nextInt();
    		System.out.println("");
    	}

    	
    	int tries=0;
    	while(guess!=randomNum){
    		tries++;
    		System.out.println("Wrong Guess!");
    		System.out.print("Guess again: ");
    		guess=in.nextInt();
    		System.out.println("");

    		
    		while (guess<0 || guess>111){
    			System.out.print("Guess a number between 0-111: ");
    			guess=in.nextInt();
    			System.out.println("");
    		}
    	}

    	
    	System.out.println("Correct Answer. You Won!");
    	System.out.println("Wrong Tries: "+tries);
    	System.out.println("");

    	
    	System.out.println("Press 1 to Play again.");
    	System.out.println("Press 0 to exit.");
    	int choice=in.nextInt();

    	if(choice==1)
    		generateRandom();
    	else
    		return;
    }

}
