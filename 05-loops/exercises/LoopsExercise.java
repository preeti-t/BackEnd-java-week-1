/**
 * Loops Exercises
 * -------------------------------------------------------------
 * 1- For Loop
 * 2- While Loop
 * 3- Do-While Loop
 * 4- For-Each Loop
 * 5- Nested Loops
 * 6- Break and Continue Statements
 *
 * Each exercise is designed to help students practice loops.
 */

public class LoopsExercise
{
    public static void main(String[] args)
    {
        // -------------------- 1. For Loop --------------------
         // Exercise 1:
        // - Create a for loop to print numbers from 10 to 1 (reverse order).

        for (int i = 10; i >= 1; i--) {
        System.out.println(i);
        }


        // Exercise 2:
        // - Use a for loop to print the multiplication table of 7 (1 to 10).
        for (int i = 1; i <= 10; i++) {
        System.out.println("7 x " + i + "="+(7* i) );
        }


        // -------------------- 2. While Loop --------------------
        // Exercise 3:
        // - Create a while loop to sum numbers from 1 to 100 and print the total.
        int i = 1;
        int sum = 0;

        while (i <= 100) {
        sum += i; 
        i++;      
        }

        System.out.println("The sum of numbers from 1 to 100 is: " + sum);


        // Exercise 4:
        // - Use a while loop to print all odd numbers between 1 and 20.
        //int i = 1;  //already declared

        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

         



        // -------------------- 3. Do-While Loop --------------------
        // Exercise 5:
        // - Create a do-while loop that asks the user to enter a number (simulate with a variable)
        //   and repeats until the number is negative.
        int number;

        int[] simulatedInputs = {5, 10, 3, -1};
        int index = 0;

        do {
            number = simulatedInputs[index];
            System.out.println("Entered number: " + number);
            index++;
        } while (number >= 0);

        // -------------------- 4. For-Each Loop --------------------
        // Exercise 6:
        // - Create an array of colors: {"Red", "Green", "Blue", "Yellow"}.
        //   Use a for-each loop to print each color in uppercase.
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        for (String color : colors) {
            System.out.println(color.toUpperCase());
        }

        // Exercise 7:
        // - Create an int array {2, 4, 6, 8, 10} and use for-each to calculate the sum.
        int[] numbers = {2, 4, 6, 8, 10};
        int sumNew = 0; 

        for (int num : numbers) {
            sumNew += num;
        }

        System.out.println("Sum = " + sumNew);

        // -------------------- 5. Nested Loops --------------------
        // Exercise 8:
        // - Use nested loops to print a 3x3 multiplication table (1*1 to 3*3).
        for (int k = 1; k <= 3; k++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(k + "*" + j + "=" + (k * j) + "\t");
            }
            System.out.println(); 
            }

        // Exercise 9:
        // - Use nested loops to print the following pattern:
        //   *
        //   **
        //   ***
        //   ****
           for (int r = 1; r <= 4; r++) {          // rows
            for (int t = 1; t <= r; t++) {      // stars per row
                System.out.print("*");
            }
            System.out.println();               // move to next line
        }

        // -------------------- 6. Break and Continue --------------------
        // Exercise 10:
        // - Create a for loop from 1 to 20.
        //   - Skip multiples of 3 using continue.
        //   - Stop the loop if the number is greater than 15 using break.

         for (int num2 = 1; num2 <= 20; num2++) {

            if (num2 % 3 == 0) {
                continue;   // skip multiples of 3
            }

            if (num2 > 15) {
                break;      // stop the loop if number is greater than 15
            }

            System.out.println(num2);
        }

        // Exercise 11:
        // - Use a while loop to print numbers 1 to 10, but stop when a number divisible by 7 is reached.
         int num1 = 1;
         while (num1 <= 10) {
            if (num1 % 7 == 0) {
                break;   
            }
            System.out.println(num1);
            num1++;
        }
    }
}
