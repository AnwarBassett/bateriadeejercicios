package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_09 {
    public static void main(String args[]) {
        Scanner lec = new Scanner(System.in);
        int a;
        do{System.out.println("Digite un numero");
        a=lec.nextInt();}while(a<=0);
        if(a % 2 == 2) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

}
