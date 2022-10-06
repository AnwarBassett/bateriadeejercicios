package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_27 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int km, estancia;
		double boleto, descuento, pf;
		System.out.println("Bienvenido a las aerolineas UNI");
		do{System.out.println("Porfavor, ingrese la distancia a viajar");
		km=lec.nextInt();}while(km <=0);
		do{System.out.println("Digite los dias de estancia");
		estancia=lec.nextInt();}while(estancia<0);
		
		if(km>=1000 && estancia>=7) {
			boleto=km*8.50;
			descuento=boleto*0.3;
			pf=boleto-descuento;
			System.out.println("Felicidades, acaba de recibir un descuento del 30%, el precio final es: C$"+pf);
		}else {
			boleto=km*8.50;
			System.out.println("Muy bien, el precio final es: C$"+boleto);
		}
		lec.close();
	}
}
