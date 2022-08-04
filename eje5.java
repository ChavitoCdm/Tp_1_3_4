package Tp34;

import java.util.Scanner;

public class eje5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Declare un variable de tipo entero y asigne un valor cualquiera, determine si el numero es
par o impar y muestre un mensaje con esa informacion. mensaje: "El numero... es (par o
impar)"
		 */ 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un numero ramdom:");
		
		int num1 = sc.nextInt();
		int resto = num1 % 2;
		 
			//System.out.print("el numero " + resto + "es par");
			if ( resto == 0 ) {
				System.out.print("el numero " + num1 + " es par");
			} 
			else 
			{
				System.out.println("el numero " + num1 + " es impar");

			}
			
		
	
			
		
				// System.out.println("el numero " + num1 );
				
	
		
	}

}
