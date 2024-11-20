import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        
        System.out.println("Hola Sergio!");

        System.out.print('A');

        System.out.printf("Aqui va una cadena: %s y tengo %d años ", "Sergio",30);

        var entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese un número entero: ");
        var entero = entrada.nextInt();

        System.out.println(entero);

        entrada.close();
    }

}

