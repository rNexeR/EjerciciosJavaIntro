import java.util.Scanner;
public class Ejercicio1{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);
		String nombre;
		int precio = 17;
		int edad, cant, tipo, total;

		System.out.print("Nombre: ");
		nombre = lea.next();
		System.out.print("Edad: ");
		edad = lea.nextInt();
		System.out.print("Cantidad de Baleadas: ");
		cant = lea.nextInt();
		System.out.print("Llevar(1) o Comer(0)? ");
		tipo = lea.nextInt();

		total = (cant*precio) + (tipo*cant*2);

		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Cantidad de Baleadas: " + cant);
		System.out.println("Tipo: " + tipo);
		System.out.println("\tPrecio de la Baleada: " + precio);
		System.out.println("Total a Pagar: " + total);
	}
}