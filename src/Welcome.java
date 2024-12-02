import java.util.Scanner;

//Inicializa la clase Welcome
public class Welcome {

    //Tarea 1
    /* Define el método greeting que imprima en terminal ¡Hola Coders! */
    static void greeting() {
        System.out.println("¡Hola, Coders!");
    }

    //Tarea 2
    /* Define el método greetingCoder que reciba un nombre y que imprima en terminal ¡Hola <name>! */
    static void greetingCoder() {
        System.out.println("¿Cuál es tu nombre, coder?");
        Scanner coderScanner = new Scanner(System.in);
        String coderName = coderScanner.nextLine();
        System.out.println("¡Hola, " + coderName + "!");
    }

    //Crea el método main
    public static void main(String[] args) {

        // Tarea 1 - Ejecuta el método greeting
        greeting();

        // Tarea 2 - Ejecuta el método greetingCoder
        greetingCoder();
        }
}








//Define el método greetingCoder que reciba un nombre y que imprima en terminal ¡Hola <name>!
//Ejecuta el método greetingCoder 

//¿Sabes donde definir el método y en dónde lo has de ejecutar? Si no lo sabes vuelve al archivo de Resources.md
