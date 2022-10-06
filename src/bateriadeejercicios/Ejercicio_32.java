package bateriadeejercicios;

import java.util.Scanner;

public class Ejercicio_32 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
        int n1, n2, mcd;
		do{System.out.println("Digite el primer numero");
		n1=lec.nextInt();}while(n1<=0);
		do{System.out.println("Digite el segundo numero");
		n2=lec.nextInt();}while(n2<=0);
        mcd=1;
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i==0 && n2 % i==0)
                mcd = i;
        }
 
        System.out.printf("El MCD de "+n1+" y de "+n2+" es "+mcd);
	}
}
