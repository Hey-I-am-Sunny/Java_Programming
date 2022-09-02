import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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

/*
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
*/

//Question 5 - Check if the first and last number in a list is the same 
/*
public class Challenge_Questions {
    public static void main(String[] args) {
        List<Integer> Numbers_List = Arrays.asList(1,2,3,4,5,2);
    if (Numbers_List.get(0) == Numbers_List.get(Numbers_List.size()-1)){
        System.out.println("Its the same");
        } else {
        System.out.println("They are not the same");
        }
    }    
}
*/

//Question 6 - Give the numbers which are divisible by 5 in the given list.
/*
public class Challenge_Questions {
    public static void main(String[] args) {
        List<Integer> Numbers_List = Arrays.asList(1,2,3,4,5,2);
    for(int i = 0 ; i <= Numbers_List.size()-1; i++){
        if (Numbers_List.get(i) % 5 == 0){
            System.out.println(Numbers_List.get(i) );
            } else {
            System.out.print("");
            }
        }
    }    
}
*/
//Question 7 - How many times did a substring appear in a string ?

/*
public class Challenge_Questions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey What is the string ? : -");
        String The_Sentence = input.nextLine();
        System.out.println("Hey What is the substring ? : -");
        String Sub_String2 = input.nextLine();
        Pattern p = Pattern.compile(Sub_String2 , Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(The_Sentence);

        int count = 0;       
        while (m.find()){
            count +=1;
        }
        System.out.println(count);
    }
}
*/
