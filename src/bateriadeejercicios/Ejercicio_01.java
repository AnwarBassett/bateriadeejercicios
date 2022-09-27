package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_01 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int a, b;
		System.out.println("Digite el valor de A");
		a=lec.nextInt();
		System.out.println("Digite el valor de B");
		b=lec.nextInt();
		System.out.println("A tiene el valor de:"+a);
		System.out.println("B tiene el valor de:"+b);
		System.out.println("----------------------");
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A tiene el valor de:"+a);
		System.out.println("B tiene el valor de:"+b);
	}
}
