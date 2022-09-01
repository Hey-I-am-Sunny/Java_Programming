import java.util.Scanner;


//Question 1 - Calculate the multiplication and addition of two numbers ?

/* 
public class Challenge_Questions {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Hey Please provide the first number : -");
        Double Number1 = input.nextDouble();
        System.out.println("Hey Please provide the Second number : -");
        Double Number2 = input.nextDouble();

        Double Sum_of =  Number1 + Number2;
        Double Product_of = Number1 * Number2;

        System.out.println("The sum of the numbers is " + Sum_of + " And the product is " + Product_of + ".");
    }    
}
*/

//Question 2 - Print a fibonacci series untill given number of times.

/* 
public class Challenge_Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey Please provide the length of the fibonacci series : -");
        Integer Size_of_Series = input.nextInt();
        Integer Num1 = 1;
        Integer Num2 = 1;
        Integer Num3 = 0;
        System.out.print("The Fibonacci series is as follows : - 1 1 ");

        for (int i = 0 ; i <= Size_of_Series ; i++){
            Num3 = Num2 + Num1;
            System.out.print(Num3);
            System.out.print(" ");
            Num1 = Num2;
            Num2 = Num3;            
        }
    }    
}
*/

// Question 3 - Print the charactes from a string at even indexes !
/*
public class Challenge_Questions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey What is the string ? : -");
        String The_Sentence = input.nextLine();

        for ( int i = 0 ; i < The_Sentence.length() ; i = i + 2){
            System.out.print(The_Sentence.charAt(i));
        }
    }    
}
*/

//Question 4 - Remove the first n characters from a string

public class Challenge_Questions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey What is the string ? : -");
        String The_Sentence = input.nextLine();
        System.out.println("Hey What is the string ? : -");
        Integer The_size = input.nextInt();

        System.out.println(The_Sentence.substring(The_size));
    }    
}

