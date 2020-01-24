package Libros;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String titulo, autor;
		int ejemplares, opcion, devolucion, prestamo, a = 2;
//		Libros l1 = new Libros();
		Libros l1 = new Libros("Don Quijote", "Cervantes", 20, 2);
		Libros l2 = new Libros("Blacksad", "Juanjo Guarnido", 20, 0);

		switch (a) {
		case 1:
			/*
			 * Es un registro: parte 1 Escribir el nombre del libro parte 2 Escribir el nombre
			 * del autor parte 3 Escribir numeros de ejemplares
			 */
			System.out.println("Ongi etorri zure liburutegiko errepublikara");
			System.out.print("Nombre del libro: ");
			titulo = in.nextLine();
			System.out.println("Nombre del autor: ");
			autor = in.nextLine();
			System.out.println("Numeros de ejemplares: ");
			ejemplares = in.nextInt();

			// Se almacenará los datos para que el usuario pueda introducir el teclado
			l1.setLibro(titulo);
			l1.setAutor(autor);
			l1.setCantidad(ejemplares);

			System.out.println(l1.toString());

		case 2:

			// Es una consulta para pedir numero ejemplares del libro y devolver el libro
			String nombre;
			System.out.print("Escribe el nombre del libro o el autor: ");
			nombre = in.nextLine();
			if (nombre.equalsIgnoreCase(l1.getLibro()) || nombre.equalsIgnoreCase(l1.getAutor())) {
				System.out.println(l1.toString());
				System.out.println("1. Pedir el libro" + "\n2. Devolver el libro");

				opcion = in.nextInt();
				switch (opcion) {
				case 1:// Recoger libro
					System.out.println("Cantidad de prestamos: ");
					prestamo = in.nextInt();
					l1.setPrestada(prestamo);
					if (l1.prestamo()) {
						System.out.println(l1.toString());
					}else {
						
					}
					break;
				case 2: // devolver libro
					System.out.print("Nº devuelto: ");
					devolucion = in.nextInt();
					l1.setPrestada(devolucion);
					l1.devolucion();
					System.out.println(l1.toString());
					break;
				default:
					break;
				}

			} else if (nombre.equalsIgnoreCase(l2.getLibro()) || nombre.equalsIgnoreCase(l2.getAutor())) {
				System.out.println(l2.toString());
				System.out.println("1. Pedir el libro" + "\n2. Devolver el libro");

				opcion = in.nextInt();
				switch (opcion) {
				case 1:// Recoger libro
					System.out.println("Cantidad de prestamos: ");
					prestamo = in.nextInt();
					l2.setPrestada(prestamo);
					l2.prestamo();
					System.out.println(l2.toString());
					break;
				case 2: // Devolver libro
					System.out.print("Nº devuelto: ");
					devolucion = in.nextInt();
					l2.setPrestada(devolucion);
					l2.devolucion();
					System.out.println(l2.toString());
					break;
				default:
					break;
				}

			} else {
				System.err.println("No existe");
			}

			break;

		default:
			System.err.println("ERROR");
			break;
		}

	}

}
