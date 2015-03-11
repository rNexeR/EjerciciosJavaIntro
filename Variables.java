public	class Variables{
	public static void main(String[] args) {
		//Tipo de la variable + nombre de la variable;
		//Nombre y Edad

		//Declaro
		String nombre;
		String apellido;
		int anio_nacimiento = 1995;
		int anio_actual = 2015;
		char letra_inicio_nombre;
		Boolean esta_matriculado;
		Double promedio;

		//Inicializar o Asignarle un valor, usamos =
		//String inicializo o asigno con comillas dobles ""
		nombre = "Nexer";
		apellido = "Rodriguez";
		//Caracteres inicializo o asigno con comillas simples ''
		letra_inicio_nombre = 'N';
		int edad = anio_actual - anio_nacimiento;
		//Boolean solo permite dos valores: True o False
		esta_matriculado = true;
		//Double para decimales: con punto decimal
		promedio = 87.87;


		//Caracteres de Escape
		// \n Inserta un Enter o Salto de Linea
		// \t Inserta una Tabulacion

		//System.out.print(1+1); = 2

		//Imprimir: Nombre: Nexer Edad: 19 
		//Nombre: Nexer Rodriguez
		//Anio Nacimiento: 1995
		//Anio Actual: 2015
		//Edad: 20
		System.out.print("Esta Matriculado: " + esta_matriculado + "\n");
		System.out.print("Letra de Inicio: " + letra_inicio_nombre + "\n");
		System.out.print("Nombre: " + nombre + " " + apellido + 
			"\nAnio de Nacimiento: " +anio_nacimiento + 
			"\nAnio Actual: " +anio_actual + 
			"\nEdad: " + edad + "\n");
		System.out.print("Promedio: " + promedio + "\n");
	}
}