package Tp34;

import java.util.Scanner;

public class eje9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Dados tres números, mostrarlos ordenados ascendentemente
 */
		System.out.println("Ingrese un valor a: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Ingrese un Valor b: ");
		int b = sc.nextInt();
		System.out.println("Ingrese un valor c: ");
		int c = sc.nextInt();
		
		boolean z = (a > b && a >c && b>c);// b<a>c
		boolean h = ( a > b && a >c && c>b);
		boolean x = (b>a && b>c && c>a ) ; //a<b>c
		boolean j = (b>a && b>c && a>c);
		boolean d = (c>a && c>b && a>b);// a<c>b 
		boolean k = (c>a && c>b && b>a);
		
		if (z)  {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} 
		if (x) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);}
				
		if (d) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}
		if (h) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}
		if(k) {
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);}
		if (j) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}else {System.out.println("ordenado pa");}
								
						
			} 
	}


