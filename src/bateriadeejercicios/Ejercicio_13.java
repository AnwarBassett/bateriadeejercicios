package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_13 {
	public static void main(String[] args) {
		Scanner lec=ne Scanner(System.in);
		int numero, veces;
		System.out.println("Ingrese un numero :");
		numero=lec.nextInt();
        if(numero % 2 == 0) {
            System.out.println(numero+" es par ");
    		for(int i=0;i<=numero;i++) {
    			i=i+2;	

    		}
        } else {
            System.out.println(numero+" es impar");
            numero=numero+1;
            
        }
	}
}

