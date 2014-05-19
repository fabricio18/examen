package examen;

import java.util.Scanner;

public class examen {
	public static void main(String[] args) {
		// se uso switch para hacer o tener desiciones multiples
	informacion obtenida de:https://github.com/IvethS/Examen/blob/master/src/Ejercicio1.java
		Scanner s= new Scanner(System.in);
		System.out.print("Con cuantas Estrellas Califica esta Pelicula 1 a 5: ");
		int num = s.nextInt();
		switch (num)
		{
		case 1 :
			System.out.print("Resultado: "+("Pesima"));
		break;
		
		case 2 :
			System.out.print("Resultado: "+("Mala"));
		break;
		
		case 3 :
			System.out.print("Resultado: "+("Regular"));
		break;
		
		case 4 :
			System.out.print("Resultado: "+("Buena"));
		break;
		case 5 :
			System.out.print("Resultado: "+("Excelente"));
		break;
		
		default:
			System.out.print("Numero Desconocido");
			break;
		}
		}
		  
		}

	
