import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] args) {
        int num;
        float resul = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero  entero positivo");
        num = input.nextInt();


        while (true) {
            if (num > 0) {
                System.out.println("Es correcto");

                for (int i = 1; i <= num; i++) {
                     resul += (1 / (float) i);
                }

                System.out.println("El resultado es: " + resul);
                {break;}

            }

            else {
                System.out.println("No es correcto, intentelo nuevamente");
            }
        }
    }
}
