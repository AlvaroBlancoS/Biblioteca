package Libros;

public class Libros {
	String libro;
	String autor;
	int cantidad;
	int prestada;

	public Libros() {
		// Constructor por defecto
	}

	public Libros(String libro, String autor, int cantidad, int prestada) {
		// Contructor con parámetros
		this.libro = libro;
		this.autor = autor;
		this.cantidad = cantidad;
		this.prestada = prestada;
	}

	// Métodos de get y set
	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrestada() {
		return prestada;
	}

	public void setPrestada(int prestada) {
		this.prestada = prestada;
	}

	// Los métodos de prestamo y devolucion

	public boolean prestamo() {
		boolean prestado = true;
		// Si podemos hacer el prestamo
		if (prestada < cantidad) {
			prestada++;
			prestada -= 1;
			cantidad -= prestada;
			System.out.println("Correcto!!");
		} else if (prestada == cantidad) {
			prestada++;
			prestada -= 1;
			cantidad = 0;
		} else if (cantidad < prestada) {
			prestado = false;
			System.err.println("Solo tenemos " + cantidad + " libros");
		}
		return prestado;

	}

	public boolean devolucion() {
		boolean devuelto = true;
		if (prestada == 0) {
			devuelto = false;
//			prestada--;
//			prestada -= 1;
//			cantidad++;
//			cantidad += 1;
			System.err.println("ERROR");

		}else{
			prestada--;
			prestada -= 1;
			cantidad+= prestada;
			cantidad +=1;
			System.out.println("Se ha devuelto el libro");
		}
//		else if (prestada == cantidad) {
//			prestada = 0;
//			cantidad++;
//			cantidad += 1;
//		}
		return devuelto;
	}
	
	public boolean Comprobar(String nombre) {
		boolean repetido = true;
		if (nombre.equals(libro)) {
			System.out.println("No se puede repetir el nombre");
		}else {
			repetido=false;
			System.out.println("Ok");
				
		}
		
		
		return repetido; 
	}

	public String toString() {
		return libro + ", autor: " + autor + ", cantidad: " + cantidad + ", prestada: " + prestada;
	}

}
