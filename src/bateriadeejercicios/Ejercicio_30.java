package bateriadeejercicios;

import java.util.Scanner;

public class Ejercicio_30 {
	public static void main(String[] args) {
		Scanner lec = new Scanner(System.in);
			int  []arreglo;
			int numero, a;
			a=0;
			arreglo = new int[10];
				System.out.println("Relle el arreglo");
				for (int i = 0; i < 10; i++) {
					a=a+1;
					System.out.println(a+".Digite un numero: ");
					arreglo[i]=lec.nextInt();	
				}
			System.out.print("\nDigite el numero a buscar en el arreglo :\n");
			numero=lec.nextInt();
			int i=0;
			while(i<10 && arreglo[i]<numero) {
				i++;
			}
			if (i==10) {
				System.out.println("\nNumero no encontrado");
			}
			else if (arreglo[i] ==numero){
				System.out.println("El numero a sido encontrado en la posicion " + i);	
			}
			else {
				System.out.println("No se pudo encontrar");
			}
	}
}
