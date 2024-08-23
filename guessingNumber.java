import java.util.*;
import java.util.Scanner;
public class guessingNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int numGuess = random.nextInt(upperBound - lowerBound + 1);
        int attempts = 0;
        int maxAttempts = 20;
        System.out.println("Welcome to the Number Guessing Game: @ Designed by :- * Sagar Dabas * ");
        System.out.println("I have Selected a Number between" + lowerBound + "and" +upperBound + "Can you Guess it ?");
        while(attempts < maxAttempts)
        {
            System.out.println("Enter Your Guess Number ");
            int userGuess = sc.nextInt();
            attempts++;
            if(userGuess == numGuess)
            {
                System.out.println("Congratulations! You have guessed the correct number in " + attempts + "attempts.");
                break;
            }
            else if(userGuess < numGuess)
            {
                System.out.println("Try a Higher Number .");
            }
            else
            {
                System.out.println("Try a Lower Number .");
            }
            if(attempts == maxAttempts)
            {
                System.out.println("Sorry, You have reached the maaximum number of attempts. The correct Number was:" + numGuess);
            }
            System.out.println("Thanks for Playing!");
            System.out.println("@ Designed By :-- * Sagar Dabas * ");
        }
    }
}
