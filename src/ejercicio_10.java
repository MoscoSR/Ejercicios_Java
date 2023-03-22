import java.util.*;
public class ejercicio_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
         int num = input.nextInt();

        int contador=1;

        while (num != 0 ) {
            contador = contador * num;
            num = num - 1;
        }
        System.out.println("EL factorial de: " + num + " es: " + contador);
    }
}
