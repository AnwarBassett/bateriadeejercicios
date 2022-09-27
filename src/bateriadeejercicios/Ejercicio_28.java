package bateriadeejercicios;

import java.util.Scanner;

public class Ejercicio_28 {
	public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int a, b;
        b=0;
		for(int i =10;i >= 0;i--) {
	        System.out.print("Digite un numero ");
	        a=lec.nextInt();
	        if(a % 2 == 0) {
	            System.out.println(a+" es par ");
	        } else {
	            System.out.println(a+" es impar");
	            b=a+b;
	            a=b;
	    		for(int j =10;j > 1;j--) {
	    			System.out.println("j="+j);
	    		}
	        }
		}
		System.out.println("La suma de impares es:"+b);
	}
}
