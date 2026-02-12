
import java.util.Scanner;

public class DayOfTheWeekFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day;
        String dayName;

        while (true) {
            System.out.print("Enter day: ");

            if (scanner.hasNextInt()) {
                day = scanner.nextInt();

                switch (day) {
                    case 1:
                        dayName = "Monday";
                        break;
                    case 2:
                        dayName = "Tuesday";
                        break;
                    case 3:
                        dayName = "Wednesday";
                        break;
                    case 4:
                        dayName = "Thursday";
                        break;
                    case 5:
                        dayName = "Friday";
                        break;
                    case 6:
                        dayName = "Saturday";
                        break;
                    case 7:
                        dayName = "Sunday";
                        break;
                    default:
                        dayName = "Invalid day";
                }

                System.out.println("The day is: " + dayName);
                return;
            
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // clear invalid input
            }
        }
    }
}


