package Libros;
import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¿Cuántos libros quieres registrar?");
		int num = in.nextInt();
		in.nextLine();
		Libros arrayLibros[] = new Libros[num];
		String nombre, autor, complemento = null;
		int ejemplares = 0, i;

		//Pedir los datos de los libros
		for ( i = 0; i < arrayLibros.length; i++) {
			if (arrayLibros[i] == null) {
				// Pido los datos
				System.out.print("Titulo: ");
				nombre = in.nextLine();
				System.out.print("Autor: ");
				autor = in.nextLine();
				System.out.print("Numero de ejemplares: ");
				ejemplares = in.nextInt();
				in.nextLine();
				arrayLibros[i] = new Libros(nombre, autor, ejemplares, 0);
			}
		}
		
		//Comprobacion de nombres
		System.out.println("BUSQUEDA DE COPIAS");
		for (i =0; i<arrayLibros.length;++i) {
			
			String nombreABuscar = arrayLibros[i].libro;
			for (int j=0; j<arrayLibros.length; ++j) {
				System.out.println(arrayLibros[j].libro);
				System.out.print("i:"+ i + " j:"+j);
				if (j!=i) {
					if (arrayLibros[j].libro==nombreABuscar) {
						System.out.println(arrayLibros[j].libro);
						System.out.println("El libro "+arrayLibros[j].libro+" en la posicion " +j+" tiene el nombre duplicado");
					}
				}
			}
		}

		//Enseñamos los libros que tenemos
		for (i = 0; i < arrayLibros.length; i++) {
			// Guardo array
			complemento = arrayLibros[i].toString();
			// Muestra el resultado
			System.out.println("Hemos almacenado libro " + (i + 1) + ": " + complemento);
		}
		
		//Es un buscador de libros
		System.out.println("Escribe el nombre del libro o autor");
		String name = in.nextLine();
		
		
		for ( i = 1; i < arrayLibros.length; i++) {
			System.out.println("---Resultado---");
			System.out.println("");
			System.out.println("Libro "+ (i+1) +arrayLibros[i].toString());
			System.out.print("Cantidad de prestamo: ");
			int prestamo, devolucion;
			prestamo = in.nextInt();
			arrayLibros[i].setPrestada(prestamo);
			
			if (arrayLibros[i].prestamo()) {
				System.out.println(arrayLibros[i].toString());
			} 
			System.out.print("Numero de devolucion: ");
			devolucion = in.nextInt();
			if (arrayLibros[i].devolucion()) {
				System.out.println(arrayLibros[i].toString());
			}
		
		}
		
		System.out.println("No existe");
		
//		for (i = 0; i < arrayLibros.length; i++) {
//			System.out.println("Escribe el nombre del libro o autor:");
//			String name = in.nextLine();
//			int prestamo, devolucion;
//			
//				if (name.equalsIgnoreCase(arrayLibros[i].getLibro()) || name.equalsIgnoreCase(arrayLibros[i].getAutor())) {
//					System.out.print("Cantidad de prestamo: ");
//					prestamo = in.nextInt();
//					arrayLibros[i].setPrestada(prestamo);
//					
//					if (arrayLibros[i].prestamo()) {
//						System.out.println(arrayLibros[i].toString());
//					} 
//					System.out.print("Numero de devolucion: ");
//					devolucion = in.nextInt();
//					if (arrayLibros[i].devolucion()) {
//						System.out.println(arrayLibros[i].toString());
//					} 
//				}
//
//
//		}

	}
}
