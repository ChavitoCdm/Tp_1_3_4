package Tp34;

import java.util.Random;

public class Eje12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n = 5;
  int lista [] = new int [n];
  int max = 42;
  int min = 15;
  
 Random r = new Random();
 r.nextInt();
 
   //carga de valores al array
 int numeroaleatorio;
 for (int i = 0; i < lista.length; i++) {
	 numeroaleatorio= r.nextInt(max - min) + min;
	 lista [i] = numeroaleatorio;
}
 //muestro un array
 for (int i = 0; i < lista.length; i++) {
		System.out.print(lista[i]+ " - ");	
	}
 System.out.println("****");
 // calculo promedio de edades 
  double suma = 0;
    for (int i = 0; i < lista.length; i++) {
	suma = suma + lista [i];
	//double promedio = suma / n;
	//System.out.println( "El promedio de edades es :" + promedio);
} 
  double promedio = (suma / n);
	
  System.out.print( "El promedio de edades es :" + promedio);
 
 
 
  
  
 
	}

}
