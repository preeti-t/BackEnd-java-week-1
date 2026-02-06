/**
 * Exercises:
 * ----------------------------------------------------------------
 * 1. Create a short variable with any value and assign it to an int (implicit).
 * 2. Create an int variable with a large value and assign it to a long (implicit).
 * 3. Create a long variable and assign it to a float (implicit).
 *
 * 4. Create a double variable and cast it to a float (explicit).
 * 5. Create an int variable and cast it to a short (explicit).
 * 6. Create a long variable and cast it to a byte (explicit).
 *
 * Bonus:
 * 7. Try converting a large int (e.g., 1000) to a byte and observe what happens (overflow).
 * 8. Convert a char (e.g., 'Z') into an int and print its ASCII value.
 * 9. Convert an int into a char and print the resulting character.
 * 10. Create a double with decimals, convert it to int, and explain what happens.
 * ----------------------------------------------------------------
 */

public class ConversionE
{
    public static void main(String[] args)
    {
        // --- Implicit Conversions (Widening) ---
        int intValue = 100;
        double widenedDouble = intValue; // int to double
        char letter = 'A';
        int widenedInt = letter;         // char to int (ASCII/Unicode value)

        System.out.println("=== Implicit (Widening) Conversions ===");
        System.out.println("int (" + intValue + ") → double: " + widenedDouble);
        System.out.println("char ('" + letter + "') → int: " + widenedInt);

        // --- Explicit Conversions (Narrowing) ---
        double doubleValue = 9.78;
        int narrowedInt = (int) doubleValue; // double to int (fraction lost)
        float floatValue = 130.75f;
        byte narrowedByte = (byte) floatValue; // float to byte (overflow possible)

        System.out.println("\n=== Explicit (Narrowing) Conversions ===");
        System.out.println("double (" + doubleValue + ") → int: " + narrowedInt);
        System.out.println("float (" + floatValue + ") → byte: " + narrowedByte);

        // -------------------- Student Exercises --------------------
       // 1. Create a short variable with any value and assign it to an int (implicit)
        short shortValue = 25;
        int intFromShort = shortValue;
        System.out.println("short (" + shortValue + ") → int: " + intFromShort);


        // 2. Create an int variable with a large value and assign it to a long (implicit)
        int bigIntValue = 2000000000;  
        long widenedLong = bigIntValue; 
        System.out.println("int (" + bigIntValue + ") → long: " + widenedLong);

        

        // 3. Create a long variable and assign it to a float (implicit)
        long longValue = 123459989L;
        float widenedFloat = longValue;
        System.out.println("long (" + longValue + ") → float: " + widenedFloat);


        // 4. Create a double variable and cast it to a float (explicit)
        double doubleNumber = 45.6766;
        float narrowedFloat = (float) doubleNumber;
        System.out.println("double (" + doubleNumber + ") → float: " + narrowedFloat);


        // 5. Create an int variable and cast it to a short (explicit)
        int intNumber = 150;
        short narrowedShort = (short) intNumber; 
        System.out.println("int (" + intNumber + ") → short: " + narrowedShort);


        // 6. Create a long variable and cast it to a byte (explicit)
        long longNumber = 150L;
        byte byteFromLong = (byte) longNumber; // explicit cast

        System.out.println("long (" + longNumber + ") → byte: " + byteFromLong);
    
        // 7. Try converting a large int (e.g., 1000) to a byte and print the result
        int largeInt = 1000;
        narrowedByte = (byte) largeInt; 

        System.out.println("int (" + largeInt + ") → byte: " + narrowedByte);



        // 8. Convert a char (e.g., 'Z') into an int and print its ASCII value
    
        int asciiValue = letter; // implicit widening conversion

        System.out.println("char ('" + letter + "') → int (ASCII): " + asciiValue);


        // 9. Convert an int into a char and print the resulting character
        int number = 65;
        char character = (char) number; // explicit cast

        System.out.println("int (" + number + ") → char: '" + character + "'");


        // 10. Create a double with decimals, convert it to int, and print the result
        double decimalNumber = 12.78;
       int intFromDouble = (int) decimalNumber; // new variable name

        System.out.println("double (" + decimalNumber + ") → int: " + intFromDouble);
    }
}
