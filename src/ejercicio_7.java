import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {

        float tall_1, tall_2, prom;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite su estatura");
        tall_1 = input.nextFloat();

        Scanner input_2 = new Scanner(System.in);
        System.out.println("Digite otra estatura");
        tall_2 = input.nextFloat();

        if (tall_1 > 1.70 && tall_2 > 1.70) {
            prom = (tall_1+ tall_2) / 2;
            System.out.println("El promedio de las estaturas es: " + prom);
        }
        else {
            System.out.println("\n:1 La primera estatura es de: " + tall_1 + " \n2: La segunda estatura es de: "+ tall_2);
        }


    }
}
