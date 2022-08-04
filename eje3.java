package Tp34;

public class eje3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar el mayor y el
		//menor
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		System.out.println("Los numeros asignados son :" );
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("*********");
		if (num1 <= num2 && num1 <= num3 ) {
			System.out.println( "el numero " + num1 );
				} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("el numero " + num2);
				} else { 
					System.out.println("el numero " + num3);
				} 
					
				
		System.out.println("***************");
		
		if (num1 >= num2 && num1 >= num3 ) {
			System.out.println( "el numero " + num1 );
				} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("el numero " + num2);
				} else { 
					System.out.println("el numero " + num3);
				} 
					
	}
		
}
