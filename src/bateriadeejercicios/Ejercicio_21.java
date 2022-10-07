package bateriadeejercicios;
import java.util.Scanner;
public class Ejercicio_21 {
	public static void main(String[] args) {
		int nf, sp, simb;
		Scanner lec=new Scanner(System.in);
        System.out.print("Dgite el numero de filas: ");
        nf=lec.nextInt();

        System.out.println();
        for(sp = 0,simb = (nf*1+1)-1; simb>0; sp++, simb-= 1){
            for(int i=0; i < sp; i++){
                System.out.print(" ");
            }
            for(int j=simb; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        lec.close();
	}
}
