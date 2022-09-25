package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_02 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int a, b;
		do{System.out.println("Ingrese el valor de a");
		a=lec.nextInt();}while(a<0);
		do{System.out.println("Ingrse el valor de b");
		b=lec.nextInt();}while(b<0);
		
		if(a > b) {
			System.out.println("El numero mayor es a="+a);
		} else {
			System.out.println("El numero mayor es b="+b);
		}
		if(a == b) {
			System.out.println("Ambos numero son iguales ");
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
	}
}