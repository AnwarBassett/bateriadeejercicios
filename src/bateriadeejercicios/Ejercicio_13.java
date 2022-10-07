package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_13 {
	public static void main(String[] args) {
		  Scanner lec= new Scanner(System.in);
		  int num, res,total, i;
		  System.out.println("Ingrese un numero");
		  num=lec.nextInt();
		  res=0;
		  total=2*num;
		  for(i=0; i<=total;i=i+2) {
			  res=res+i;
			  System.out.println(i);
		  }
		  System.out.println(res);
	}
}

