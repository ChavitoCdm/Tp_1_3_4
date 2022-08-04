package Tp34;

import java.util.Scanner;

public class eje8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *Calcular la cantidad de minutos que hay existen en una cantidad de segundos ingresada
por el usuario.
 */
		
		System.out.println("Ingrese los segundos: ");
		Scanner sc = new Scanner(System.in);
		int seg = sc.nextInt();
		double  min = (double)seg /60;
				
		System.out.println("La cantidad de minutos son " + min);
		
		
		/*
		 *  1 hs = 60 min = 3600 seg
		 *  1 ...60 seg
		 *  60
		 */
		
		
	}

}
