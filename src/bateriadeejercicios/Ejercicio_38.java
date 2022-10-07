package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_38 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int i,j,k,m,n;
		m=0;
		n=10;
		for (i = 0; i < n; i++) {
			   System.out.println(i);
			 for (k = 0; k <n; k++) {
				   System.out.println(k);
				   for (j= 0; j< n; j++) {
					   System.out.println(j);
					   m=m+1;
					   System.out.println(m);
				   }
			 }
		}
	}
}
