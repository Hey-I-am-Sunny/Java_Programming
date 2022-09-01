/**
 * Salary_Claci_Challenge
 */

import java.util.Scanner;

public class Salary_Claci_Challenge {

    public static Integer Sal_Calci(Integer Weeks_worked,
                                    Integer Vacation,
                                    Integer Payscale)/*Get the Weeks , vacation and the payscale from the call. Used interger as a return function */
                                    {

        Integer Days_Worked = Weeks_worked * 5; // The number of days worked
        Integer Hours_Worked = (Days_Worked * 8 ) - (Vacation * 8); // The number of hours worked
        

        return Hours_Worked * Payscale; // Retunr the gross salary


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the calculator! Please Give the number of employees you want to calculate."); 
        Integer Employee_count = input.nextInt(); // Number of employees to avoid running the program again and again
        
        for (int i = 0 ; i < Employee_count ; i++)// Looping the employee count till using the number given by the user
        { 
            // getting the input from the user about the employee details
            input.nextLine();
            System.out.println("What is the employee name ? ");
            String Employee_name = input.nextLine();
            System.out.println("What is the pay scale of the employee ? ");
            Integer Pay_scale = input.nextInt();
            System.out.println("How many weeks ?");
            Integer Weeks = input.nextInt();
            System.out.println("How many vacation days did the person take ?");
            Integer Vacation_taken = input.nextInt();
            
            // Final call function in the print line.

            System.out.println("The gross income of " + Employee_name + " is " + Sal_Calci(Weeks, Vacation_taken, Pay_scale));

        }

        input.close();

    }
}