package bateriadeejercicios;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		Scanner lec= new Scanner(System.in);
		int serie, media, dv;
		double aritmetica;
		dv=0;
		do {
		System.out.println("Digite un numero, para acabar digite -1");
		serie=lec.nextInt();
		media=serie+serie;
		dv=dv+1;
		}while(serie==-1);
		aritmetica=media/dv;
		System.out.println("La media aritmetica es igual a: "+aritmetica);
	}

}
