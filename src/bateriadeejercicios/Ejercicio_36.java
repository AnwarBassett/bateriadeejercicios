package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_36 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		String nombre;
		int salario, horas,horasext;
		double salarecargo,salarioneto, ff;
		System.out.println("Cual es su nombre?");
		nombre=lec.next();
		System.out.println("Cual es su salario basico por hora?");
		salario=lec.nextInt();
		System.out.println("Cuantas horas trabajo?");
		horas=lec.nextInt();
		
		salarioneto=salario*horas;
		if(horas>48) {
			horasext=horas-48;
			salarecargo=salarioneto*0.35;
			ff=salarioneto+salarecargo;
			System.out.println("\nNombre:"+nombre
					+"\nSalario Basico:C$"+salario
					+"\nHoras trabajadas:"+horas
					+"\nHoras Extra:"+horasext
					+"\nRecargo:C$"
					+ "\nSalario Neto:C$"+ff);
		}else {
			System.out.println("\nNombre:"+nombre
					+"\nSalario Basico:C$"+salario
					+"\nHoras trabajadas:"+horas
					+ "\nSalario Neto:C$"+salarioneto);
			
		}
		
	}
}
