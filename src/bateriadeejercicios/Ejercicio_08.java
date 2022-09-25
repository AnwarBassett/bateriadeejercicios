package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_08 {
    public static void main(String args[]) {
        Scanner lec = new Scanner(System.in);
        int a;
        System.out.println("Digite un numero");
        a=lec.nextInt();
        if(a==0) {
        	System.out.println("No es par, ni impar");
        }
        if(a % 2 == 1) {
            System.out.println("Es impar");
        } else {
            System.out.println("Es par");
        }
    }
}
