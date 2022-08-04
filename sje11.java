package Tp34;

import java.util.Scanner;

public class sje11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
  * 
  */
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero A: ");
		int num1 = sc.nextInt();
		System.out.println("Ingrese un numero B: ");
		int num2 = sc.nextInt();
		System.out.println("Ingrese un numero C: ");
		int num3 = sc.nextInt();
		
		 if (num1 == num2 && num2 == num3) {
			 System.out.println("es un triangulo equilatero");
			 
			
		}else if (num1 != num2 && num2 != num3) {
			System.out.println("es un triangulo escaleno");
		}else {
			System.out.println("es un triangulo isósceles");
		}
	
	}

}
