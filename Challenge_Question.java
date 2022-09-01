import java.util.Scanner;

public class Challenge_Question {
    
    public static void main(String[] args) {
        
        System.out.println("Hello, So todays question of the day is : -");
        System.out.println("Which animal is native to Anatartica ?");
        System.out.println("A . Pigs");
        System.out.println("B . Chameleon");
        System.out.println("C . Penguin");        
        System.out.print("Choose a option from above :- ");


        Scanner input = new Scanner(System.in);
        char The_answer = input.next().charAt(0);

        if (The_answer == 'A') {
            System.out.println("The answer you have provided is wrong unfortunatly.");
        } 
        
        else if (The_answer == 'B'){
            System.out.println("The answer you have provided is wrong unfortunatly.");
        } 
        
        else {
            System.out.println("You have the write answer. Congratulations.");
        }

        input.close();
    }

}
