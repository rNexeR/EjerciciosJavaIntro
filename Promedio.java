import java.util.Scanner;

public class Promedio{
	public static void main(String [] args){
		//Programa donde almaceno dos notas y luego calculo su promedio, imprimiendolo
		Double nota1, nota2, promedio;
		Scanner rd = new Scanner(System.in);
		//lea (Nombre de la Variable Scanner).next(Tipo que quiero leer)();
		System.out.print("Ingrese nota1: ");
		nota1 = rd.nextDouble();
		System.out.print("Ingrese nota2: ");
		nota2 = rd.nextDouble();

		//Calculo del Promedio
		promedio = (nota1 + nota2)/2;

		System.out.print("Promedio:" + promedio);
		
	}
}