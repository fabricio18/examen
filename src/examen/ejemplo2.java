package examen;
import java.util.Scanner;

public class ejemplo2 {
	
	public static void main(String args[]){
		// los codigos usados fueron empleados en clase y se uso el int para introducir las variables empleadas

		Scanner lea = new Scanner(System.in);
		System.out.print("Ingrese un numero ");
		
		
		int numero=0; 
	    numero=lea.nextInt(); 
	    System.out.println("Escriba un Texto:  ");
		String texto = lea.next();
		int x=0;
		while (x<=numero)
		{
			System.out.print(texto);
			x+=1;
		}
	}
}
