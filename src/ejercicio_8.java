import javax.swing.*;
public class ejercicio_8 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
        for (int i = 0;  i < num; i++) {
            if ( i % 2 == 0) {
                System.out.println( i + " Es un numero par");
            } else  {
                System.out.println( i + " Es un numero impar");
            }
        }
    }
}
