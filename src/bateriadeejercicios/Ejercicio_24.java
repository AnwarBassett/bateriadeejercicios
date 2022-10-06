package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_24 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int a, b, c;
		double x1, x2;
		
		System.out.println("Ingrese a");
		a=lec.nextInt();
		System.out.println("Ingrese b");
		b=lec.nextInt();
		System.out.println("Ingrese c");
		c=lec.nextInt();
		
        x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
        if((Double.isNaN(x1)== true)||((Double.isNaN(x2)== true))){
        	System.out.println("Solucion con numeros imaginarios");
        }else{
            System.out.println("La solucion de x1: "+x1);
            System.out.println("La solucion de x2: "+x2);
        }
	}
}
