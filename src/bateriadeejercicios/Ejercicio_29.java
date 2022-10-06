package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_29 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Digite el numero 1");
		n1=lec.nextInt();
		System.out.println("Digite el numero 2");
		n2=lec.nextInt();
		System.out.println("Digite el numero 3");
		n3=lec.nextInt();
		
		if(n1+n2==n3) {
			System.out.println("iguales");
		}if(n1+n3==n2) {
			System.out.println("iguales");
		}if(n3+n2==n1) {
			System.out.println("iguales");
		}if(n1+n2!=n3 && n1+n3!=n2 && n3+n2!=n1){
			System.out.println("Distintos");
		}
	}
}
