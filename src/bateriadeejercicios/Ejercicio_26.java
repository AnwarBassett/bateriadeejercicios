package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_26 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int Producto,n;
		System.out.println("Ingrese N numeros :");
		n=lec.nextInt();
		Producto=1;
		for(int i=1;i<=n;i++) {
			System.out.print(i + " ");
			Producto=i;
		}
		System.out.println("");
		System.out.println("El Producto de "+n+":"+Producto);
		lec.close();
	}
}
