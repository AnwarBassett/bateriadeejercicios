package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_23 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			double BDJ, R, C, total;
			System.out.println("Menu del restaurante");
			do{System.out.println("Cuantos bocadillos de jamon va a querer?");
			BDJ=s.nextDouble();}while(BDJ<0);
			do{System.out.println("Cuantos refrescos ordenara?");
			R=s.nextDouble();}while(R<0);
			do{System.out.println("Cuantas cervezas tomara?");
			C=s.nextDouble();}while(C<0);
			total=((BDJ*1.5) + (R*1.05) + (C*0.75));
			System.out.println("La factura es de : C$" +total);
		}
	}
}
