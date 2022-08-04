package Tp34;

import java.util.Scanner;

public class El12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Dada un lista con las edades de N deportistas, 
 * se necesita informar la edad promedio de
los deportistas de la lista; cual es la menor y la mayor edad ingresada.

 */
		//* int edades[] = {2,4,6};
		Scanner sc = new Scanner (System.in);
		int edades2 []= new int [5];
		for (int posicion=0;posicion<=edades2.length-1; posicion++) {
			System.out.println("Ingrese un numero");
			int num =sc.nextInt();
			edades2 [posicion] = num;
			
		} 
		for (int posicion=0;posicion<edades2.length; posicion++) {
		System.out.print(edades2 [posicion]+ "\t");
		}
		System.out.println("**********");
		
		int menor = edades2[0];
		int mayor = edades2[0];
		double prom = 0 + edades2[0];
		for (int posicion=1;posicion<edades2.length; posicion++) {
			if (edades2[posicion]<menor) {
				menor = edades2[posicion];
			}
			if (edades2[posicion]>mayor) {
				mayor =edades2[posicion];			
			
			}
			prom = prom + edades2[posicion];
		}
		prom = prom/edades2.length;
		System.out.println("el mayor" + mayor );
		System.out.println("el menor " + menor );
		System.out.println("el promedio " + prom );
	}

}
