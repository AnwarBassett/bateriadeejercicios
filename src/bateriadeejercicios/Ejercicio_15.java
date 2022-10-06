package bateriadeejercicios;

import java.util.Scanner;

public class Ejercicio_15 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		String clave;
		int intentos;
		System.out.println("Ingrese la clave, tiene solo 3 intentos");
		clave=lec.next();
		intentos=2;
		switch(clave) {
		case "tuani":
			System.out.println("lo conseguiste");
			System.exit(0);
			break;
		}
		do{
			System.out.println("Incorrecto, intente de nuevo, le quedan "+intentos+" intentos");
			clave=lec.next();
			switch(clave) {
			case "tuani":
				System.out.println("lo conseguiste");
				System.exit(0);
				break;
			}
			intentos=intentos-1;

		}while(intentos>0);
		
	}
}
