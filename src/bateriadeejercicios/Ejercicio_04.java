package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_04 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int a, b, c;
		System.out.println("Ingrese el valor de a");
		a=lec.nextInt();
		System.out.println("Ingrese el valor de b");
		b=lec.nextInt();
		System.out.println("Ingrese el valor de c");
		c=lec.nextInt();
		
		if(a<0) {
			System.out.println("Se realizara una multiplicacion, el producto de los 3 numeros es igual a:"+(a*b*c));
		}else {
			System.out.println("Se realizara una suma, el resultado es igual a:"+(a+b+c));
		}
	}
}
