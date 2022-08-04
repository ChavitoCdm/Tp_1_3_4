package Tp34;

import java.util.Scanner;

public class eje10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*Declare dos variables base y altura,que representan la base y la altura 
			 * de un triangulo.Asigne un valor cualquiera 
			 *  a cada una y muestre la superficie del mismo.
			 */ 
		System.out.println("Calculo de la sup. de un triangulo");
		System.out.println("ingrese la base:");
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		System.out.println("Ingrese la altura");
		double altura = sc.nextDouble();
		
		double resul = (base*altura)/2;
		
		System.out.println("La superficie es: " + resul);
		
		
		//* double base1 = 7;
		//double altura1 = 5;
		//double resul = (base*altura)/2; 
		//System.out.println(resul);// 
			
	}

}
