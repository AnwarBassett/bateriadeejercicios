package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_06 {
	public static void main(String[] args) {
		Scanner l=new Scanner(System.in);
		int alumnos, chicos, chicas, total, porcenVaron, porcenMujer, Th, Tm;
		System.out.println("Cuantos alumnos tiene?");
		alumnos=lec.nextInt();
		System.out.println("Cuantos chicos hay en el salon?");
		chicos=lec.nextInt();
		System.out.println("Cuantas chicas hay en el salon?");
		chicas=lec.nextInt();
		total=chicos=chicas;
		if(total == alumnos) {
			porcenMujer=chicos-alumnos;
			System.out.println("El "+porcenMujer+"% son mujeres");
		}else {
			System.out.println("Lo sentimos, los datos ingresados no son iguales");
		}
		
	}
}
