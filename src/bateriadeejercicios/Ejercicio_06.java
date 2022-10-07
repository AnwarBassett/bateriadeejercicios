package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_06 {
	public static void main(String[] args) {
		Scanner  lec=new Scanner(System.in);
		int ttl,no,na;
		double por1,por2;
		
		System.out.println("Cuantos alumnos tiene?");
		no=lec.nextInt();
		System.out.println("Cuantas alumnas tiene?");
		na=lec.nextInt();
		
		ttl=na+no;
		por1=no*100.0/ttl;
		por2=na*100.0/ttl;
		System.out.println("El porcentaje de alumnos es:"+por1+"%");
		System.out.println("El porcentaje de alumnas es:"+por2+"%");
	}
}
