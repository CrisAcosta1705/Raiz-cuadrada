package Ejercicio;
import java.util.Scanner;
public class RaizCuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		double r;
		int n=0;
		
		System.out.println("Ingrese un numero al azar");
		n = tc.nextInt();
		
		r = Math.sqrt(n);
		
		System.out.println("La raiz de:"+n);
		System.out.println("Es igual a:"+r);
	}

}
