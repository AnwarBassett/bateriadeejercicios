package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_35 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int x;
		double p1, p2, p3, pf;
		System.out.println("Dgite el valor de x");
		x=lec.nextInt();
		if(x>0) {
			p1=Math.pow((x-2), 2)/2;
			p2=Math.pow((x-4), 4)/4;
			p3=Math.pow((x-6), 6)/6;
			pf=p1+p2+p3;
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println("F(X)=(x-2)^2/2+(x-4)^4/4+(x-6)^6/6="+pf);
		}else {
			p1=Math.pow((x+2), 2)/2;
			p2=Math.pow((x+4), 4)/4;
			p3=Math.pow((x+6), 6)/6;
			pf=p1+p2+p3;
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println("F(X)=(x-2)^2/2+(x-4)^4/4+(x-6)^6/6="+pf);
		}
	}
}
