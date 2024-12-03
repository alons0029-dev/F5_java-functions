import java.util.Scanner;

public class Calculator {

    public void main() {

        Scanner optionScanner = new Scanner(System.in);

        // Greeting + Gathering user interaction
        System.out.println("Select operation: ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int userAnswer = optionScanner.nextInt();

        if (userAnswer == 1) { System.out.println(); add(); } else
            if (userAnswer == 2) { System.out.println(); subtract(); } else
                if (userAnswer == 3) { System.out.println(); multiply(); } else
                    if (userAnswer == 4) { System.out.println(); divide(); }
                        else { System.out.println("Give a number from the ones provided!"); }
    }

    //Define los métodos basándote en su doc comment.
    static Scanner numberScanner = new Scanner(System.in);

    // ADD NUMBERS
    public void add() {

        // Gathering Numbers
        System.out.println("ADD NUMBERS");

        System.out.println("Enter first number:");
        double number1 = numberScanner.nextDouble();

        System.out.println("Enter last number:");
        double number2 = numberScanner.nextDouble();

        // Logic
        System.out.println();
        System.out.println(number1 + number2);
    }

    // SUBTRACT NUMBERS
    public void subtract() {

        // Gathering Numbers
        System.out.println("SUBTRACT NUMBERS");

        System.out.println("Enter first number:");
        double number1 = numberScanner.nextDouble();

        System.out.println("Enter last number:");
        double number2 = numberScanner.nextDouble();

        // Logic
        System.out.println();
        System.out.println(number1 - number2);
    }

    // MULTIPLY NUMBERS
    public void multiply() {

        // Gathering Numbers
        System.out.println("MULTIPLY NUMBERS");

        System.out.println("Enter first number:");
        double number1 = numberScanner.nextDouble();

        System.out.println("Enter last number:");
        double number2 = numberScanner.nextDouble();

        // Logic
        System.out.println();
        System.out.println(number1 * number2);
    }

    // DIVIDE NUMBERS
    public void divide() {

        // Gathering Numbers
        System.out.println("DIVIDE NUMBERS");

        System.out.println("Enter first number:");
        double number1 = numberScanner.nextDouble();

        System.out.println("Enter last number:");
        double number2 = numberScanner.nextDouble();

        // Logic
        System.out.println();
        System.out.println(number1 / number2);
    }

    /**
     * Function name: add
     * 
     * @param number1 (double) 
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. sum 2 numbers
     */
    

    /**
     * Function name: subtract
     *
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. subtract 2 numbers
     */
    

    /**
     * Function name: multiply
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. multiply 2 numbers
     */
    

    /**
     * Function name: divide
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. divide 2 numbers
     */
    
}


