import java.util.*;

public class ejercicio_2 {
    public static void main(String[] args) {

        int num, mul;

        //mul = 1;

        Scanner number = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        num = number.nextInt();

        if (num > 0) {
            System.out.println("Es correcto");

            for (int i = 1; i <= 9; i++ ) {
                System.out.println( num +" x "+ i + " es igual a: " + num*i);
            }



        }
        else  {
            System.out.println("El numero ingresado es incorrecto");
        }


    }
}
