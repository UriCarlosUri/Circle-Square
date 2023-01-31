package CIRCLE;

import java.util.Scanner;

public class menu1 {
	
	public static void main(String[] args) {
	}
	
	Scanner sc = new Scanner(System.in);{
	int desicion;
	
	System.out.println("1. calcular area y circunferencia de un circulo");
	System.out.println("2. Calcular area, perimetro y diagonal de un cuadrado");
	System.out.println("3. SALIR");
	desicion = sc.nextInt();
	double lado , diagonal, perimetro, acuadrado;
	double radio, circunferencia, acirculo;
	double pi = 3.1416;
	
	switch (desicion) {
	case 1:
		System.out.println("¿Cual es el radio del circulo?");
		radio = sc.nextDouble();
		acirculo = (pi*radio*radio);
		circunferencia = (2*pi)*radio;
		System.out.println("El area del circulo es: " + acirculo);
		System.out.println("La circunferencia es: " + circunferencia);
		break;
	case 2: 
		System.out.println("¿Cuanto vale el lado del cuadrado?");
		lado = sc.nextDouble();
		diagonal = sqrt((lado*lado)+(lado+lado));
		perimetro = 4*lado;
		acuadrado = lado*lado;
		System.out.println("La diagonal del cuadrado es: " + diagonal);
		System.out.println("El perimetro es: " + perimetro);
		System.out.println("El area es: " + acuadrado);
		break;
	case 3:
		System.out.println("SALIENDO...");
		System.exit(0);
		break;
	default:
		System.out.println("Esa no es una opcion, escoge otra :)");
		break;
		
		
		
	}
	
	
	}
	private double sqrt(double d) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	
