package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_12 {
	public static void main(String[] args) {
		Scanner lec = new Scanner(System.in);
		int n;
		do{System.out.println("Ingrese una cantidad");
		n=lec.nextInt();}while(n<=0);
		for(int i=0;i<=n;i++) {
			i=i+1;	
			System.out.println("La primeras sumas de "+n+" es: "+i);
		}
	}
}
