package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_20 {
	public static void main(String[] args) {
		int x;
		Scanner lec=new Scanner(System.in);
		System.out.println("Ingrese el numero :");
	    x=lec.nextInt();
		for (int i = 0; i <x; i++) {
			for (int j = 0; j <4; j++) {
			  System.out.print("*");
			}
		  System.out.println("");
		}
		lec.close();
	}
}
