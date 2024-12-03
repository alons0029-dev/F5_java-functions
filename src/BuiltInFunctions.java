import java.util.Random;
import java.util.Scanner;

public class BuiltInFunctions {
    public void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal. 
        System.out.println("JAVA BUILT-IN FUNCTIONS SHOWCASE");

        // Ex.1 - Print Message
        System.out.println();
        System.out.println("Ex. 1 - Print Message");

        // Ex.2 - Get Length
        System.out.println();
        System.out.println("Ex. 2 - Get String Length");

        // Ex.3 - Convert to Lowercase
        System.out.println();
        System.out.println("Ex. 3 - Lowercase Conversion");

        // Ex.4 - Find Prefix
        System.out.println();
        System.out.println("Ex. 4 - Prefix finder");

        // Ex.5 - Replace Characters
        System.out.println();
        System.out.println("Ex. 5 - Character Manipulation");

        // Ex.6 - Get Square Root
        System.out.println();
        System.out.println("Ex. 6 - Square Root Calculator");

        // Ex.7 - Get Power
        System.out.println();
        System.out.println("Ex. 7 - Powered Numbers");

        // Ex.8 - Random Number
        System.out.println();
        System.out.println("Ex. 8 - Random");
        getRandomNumber();

        // Ex.9 - Max Number
        System.out.println();
        System.out.println("Ex. 9 - Max Number");
        maxNumber();
    }

    /**
         * Function name: printMessage
         * 
         * @param message (String)
         * 
         * Inside the function:
         * 1. Find a java built-in function that prints the message on the console.
         */

        // Escribe tu código aquí
        

        /**
         * Function name: getLength
         * 
         * @param message (String)
         * @return (int)
         * 
         * Inside the function:
         * 1. Find a built-in function that returns the length of a string.
         */

        // Escribe tu código aquí


        /**
         * Function name: convertToLowercase
         * 
         * @param message (String)
         * @return (String)
         * 
         * Inside the function:
         * 1. Find a built-in function that converts a string to lowercase.
         */

        // Escribe tu código aquí


        /**
         * Function name: findPrefix
         * 
         * @param message (String)
         * @param prefix (String)
         * @return (boolean)
         * 
         * Inside the function:
         * 1. Find a built-in function that checks if a string starts with a specified prefix.
         */

        // Escribe tu código aquí


        /**
         * Function name: replaceCharacters
         * 
         * @param message (String)
         * @param oldChar (char)
         * @param newChar (char)
         * @return (String)
         * 
         * Inside the function:
         * 1. Find a built-in function that replaces all occurrences of a specified character in a string with another character.
         */

        // Escribe tu código aquí

        
        /**
         * Function name: getsSquareRoot
         * 
         * @param number (double)
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that calculates the square root of a number.
         */

        // Escribe tu código aquí


        /**
         * Function name: getPower
         * 
         * @param base (double)
         * @param exponent (double)
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that calculates the power of a number.
         */

        // Escribe tu código aquí




        // Escribe tu código aquí





        static Scanner numScan = new Scanner(System.in);

        public static void getRandomNumber() {

            // Logic
            Random randomCalc = new Random();
            double randDouble = randomCalc.nextDouble();

            // Return
            System.out.println(randDouble);

            /**
             * Function name: getRandomNumber
             *
             * @return (double)
             *
             * Inside the function:
             * 1. Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
             */
        }

        // MAX NUMBER
        public static void maxNumber() {

            // Gathering Data
            System.out.println("Enter first number:");
            double number1 = numScan.nextDouble();

            System.out.println();

            System.out.println("Enter first number:");
            double number2 = numScan.nextDouble();

            // Logic
            if (number1 > number2) { System.out.println(number1 + " is bigger than " + number2); } else
                if (number1 < number2) { System.out.println(number2 + " is bigger than " + number1); } else
                    if (number1 == number2) { System.out.println("Both numbers are equal."); }
                        else { System.out.println("Something went wrong!"); }
            }

            /**
             * Function name: maxNumber
             *
             * @param number1 (int)
             * @param number2 (int)
             * @return (int)
             *
             * Inside the function:
             * 1. Find a built-in function that returns the larger of two numbers.
             */
        }