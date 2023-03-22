import java.util.*;
public class ejercicio_9 {
    public static void main(String[] args) {
        int num;
        Scanner input =  new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = input.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(num + "x" + i + " Es igual a: "+ num * i);
        }
    }
}
