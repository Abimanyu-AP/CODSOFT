import java.util.Scanner;
import java.util.Random;
public class NumberGame{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        Random random= new Random();
        int lowerbound = 1;
        int upperbound = 100;
        int numbertoguess = random.nextInt(upperbound-lowerbound+1)+lowerbound;
        int guess;
        int attempts = 0;
        System.out.println("welcome to the Number Guessing Game!");
        System.out.println("I'm Thinking of a number between" +" "+ lowerbound +" "+ "and" + " "  + upperbound + ".");
        do{
            System.out.println("Enter your guess:");
            guess=Sc.nextInt();
            attempts++;
        
        if(guess<numbertoguess){
            System.out.println("Too low.Try again!");
        }
        else if(guess>numbertoguess){
            System.out.println("Too High.Try again!");
        }
        else{
            System.out.println("Congratulations!.You guessed the number in:"+attempts+"attempts.");
        }
    }
    while(guess != numbertoguess);
    Sc.close();

    }
}