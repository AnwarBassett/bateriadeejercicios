package bateriadeejercicios;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  //Ejercicio 16
		  
		  int []datos = new int[10];
		  int maximo,minimo,suma=0;
		  
			  
			  for (int i = 0; i < 10; i++) {
				  System.out.println("Dime el dato "+ (i+1)+ "");
				  datos[i] = s.nextInt();
				 
			
				  
			  }
			  for (int i = 0; i < 10; i++) {
				  suma+= datos[i] ;
				
			}
			 
			   {
				   suma+= datos[0] ;
				   maximo = minimo = datos[0];
			       for (int i = 1; i<10 ; i++) {
					
				
					  
				if (datos[i]>maximo) {
					   maximo = datos[i];
					   
				   }
				   if(datos[i]<minimo){
					   minimo = datos[i];
					   
				   }
			
		}
			  System.out.println("El maximo es :"+maximo);
			  System.out.println("El minimo es :"+minimo);
			  System.out.println("La media es :" +(suma/10.0));
			  
		
			
			}
	}
}
