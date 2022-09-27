package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_40 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in );
		double factorialA, factorialB, fctlab, fctla, fctlb, denominador, ttl;
		 int num1, num2, ab;
		 System.out.print("Introduce a: ");
		 num1=teclado.nextInt();
		 System.out.print("Introduce b: ");
		 num2=teclado.nextInt();
		 ab=num1-num2;
		 fctla=1;
		 for (int i=num1;i>0;i--){
			 fctla=fctla*i;
		 }
		 fctlb=1;
		 for (int i=num2;i>0;i--){
			 fctlb=fctlb*i;
		 }
		 fctlab=1;
		 for (int i=ab;i>0;i--){
		  fctlab=fctlab*i;
		 }
		 denominador=fctlab*fctlb;
		 ttl=fctla/denominador;
		 System.out.println("La respuesta de a!/((a-b)!*b!) es:"+ttl);
	}
}
