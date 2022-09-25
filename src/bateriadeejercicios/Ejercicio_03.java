package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_03 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int a, b, c;
		do{System.out.println("Ingrese el valor de a");
		a=lec.nextInt();}while(a<0);
		do{System.out.println("Ingrese el valor de b");
		b=lec.nextInt();}while(b<0);
		do{System.out.println("Ingrese el valor de c");
		c=lec.nextInt();}while(c<0);
		
		if(b>a && b>c) {
			System.out.println("B es el mayor de todos");
		}
		if(a>b && a>c) {
			System.out.println("A es el mayor de todos");
		}
		if(c>a && c>b) {
			System.out.println("C es el mayor de todos");
		}
	}
}
