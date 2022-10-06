package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_25 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int menu, c, f;
		double r;
		System.out.println("Que desea calcular?");
		do{System.out.println("Para calcular °C -> °F ingrese 1 | Para calcular °F -> °C ingrese 2");
		menu=lec.nextInt();}while(menu<1 || menu>2);
		
		switch(menu) {
		case 1:
			System.out.println("Ingrese los °C");
			c=lec.nextInt();
			r=((c * 9/5) + 32);
			System.out.println("fahrenheit es igual a: "+r+"°F");
			break;
		case 2:
			System.out.println("Ingrese los °F");
			f=lec.nextInt();
			r=((f-32)*5/9);
			System.out.println("celsius es igual a: "+r+"°C");
			break;
		}

	}
}
