package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_07 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		String mes;
		double precio, descuento, fp;
		System.out.println("Bienvenido a la tienda UNI");
		System.out.println("Cuanto va a pagar?");
		precio=lec.nextDouble();
		System.out.println("En que mes estamos?");
		mes=lec.next();
		switch(mes) {
		case "Enero":
			System.out.println("El precio final es:"+precio+"C$");
			break;
		case "Febrero":
			descuento=precio*0.15;
			fp=precio-descuento;
			System.out.println("El precio final es:"+fp+"C$");
			break;
		case "Marzo":
		case "Abril":
		case "Junio":
		case "Julio":
		case "Agosto":
		case "Septiembre":
		case "Octubre":
		case "Noviembre":
		case "Diciembre":
			System.out.println("El precio final es:"+precio+"C$");
			break;
		}
System.out.println("Gracias por su compra");
	}		
}
