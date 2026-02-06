import java.util.Scanner;

public class ExerciseByBora
{
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);

         
     int number;
     double decimal;
     String word;
     while (true)
       {
         System.out.print("Enter a value: ");
         if (scanner.hasNextInt())
         {
           number = scanner.nextInt();
           scanner.nextLine(); // consume leftover newline
           System.out.println ("The value is Integer.");
           break;
         }
           else if (scanner.hasNextDouble())
                
         {
           decimal = scanner.nextDouble();
           scanner.nextLine(); // consume leftover newline
           System.out.println ("The value is Double.");
           break;
         }
           else if (scanner.hasNextLine())
           {
            word = scanner.nextLine();
           scanner.nextLine(); // consume leftover newline
           System.out.println ("The value is string.");
           break;
           }   
          else

          System.out.println("Invalid input. Please enter something.");

        }
        
    }
}




           
            
