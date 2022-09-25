package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String SioNo="Si";
		System.out.println("Usted quiere cursar un ciclo formativo de grado mayor");
		System.out.println("Posee titulo de bachiller?");
		SioNo=sc.next();
		if(SioNo.equalsIgnoreCase("No")) {
			System.out.println("Usted paso el examen de admision?");
			SioNo=sc.next();
			if(SioNo.equalsIgnoreCase("No")) {
				System.out.println("Lo sentimos, usted no puede cursar un ciclo formativo de grado mayor");
				System.exit(0);
			}else {
				System.out.println("Felicidades, usted puede cursar un ciclo formativo de grado mayor");
			}
		}else {
			System.out.println("Felicidades, usted puede cursar un ciclo formativo de grado mayor");
		}
	}
}