package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_18 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int mes, dia, ano;
		do{System.out.println("Digite el dia");
		dia=lec.nextInt();}while(dia<0 || dia>31);
		do{System.out.println("Digite el mes");
		mes=lec.nextInt();}while(mes<0 || mes>12);
		do{System.out.println("Digite el año");
		ano=lec.nextInt();}while(ano<=0);
		
		switch(mes) {
		case 1:
			System.out.println(dia+" de enero del "+ano);
			break;
		case 2:
			System.out.println(dia+" de febrero del "+ano);
			break;
		case 3:
			System.out.println(dia+" de marzo del "+ano);
			break;
		case 4:
			System.out.println(dia+" de abril del "+ano);
			break;
		case 5:
			System.out.println(dia+" de mayo del "+ano);
			break;
		case 6:
			System.out.println(dia+" de junio del "+ano);
			break;
		case 7:
			System.out.println(dia+" de julio del "+ano);
			break;
		case 8:
			System.out.println(dia+" de agosto del "+ano);
			break;
		case 9:
			System.out.println(dia+" de septiembre del "+ano);
			break;
		case 10:
			System.out.println(dia+" de octubre del "+ano);
			break;
		case 11:
			System.out.println(dia+" de noviembre del "+ano);
			break;
		case 12:
			System.out.println(dia+" de diciembre del "+ano);
			break;
		}
	}
}
