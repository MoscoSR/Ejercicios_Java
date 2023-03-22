import java.util.*;
public class ejercicio_4 {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = input.nextInt();

        if (num % 2 == 0 ) {
            System.out.println( num + " Es un numero par");
        } else  {
            System.out.println(num + " Es un numero impar");
        }
    }
}
