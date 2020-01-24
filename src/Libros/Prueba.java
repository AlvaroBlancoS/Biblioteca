package Libros;
import java.util.Scanner;

public class Prueba {
	private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    //constructor por defecto
    public Prueba() {
    }

    //constructor con par�metros
    public Prueba(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    //getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //m�todo para realizar el prestamo de un libro
    public boolean prestamo() {
        boolean prestado = true;
        if (prestados < ejemplares) {
            prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    //m�todo para realizar la devoluci�n de un libro
    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    //m�todo toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nejemplares: " + ejemplares + "\nprestados: " + prestados;
    }
	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
	        String titulo, autor;
	        int ejemplares;

	        //se crea el objeto libro1 utilizando el constructor con par�metros
	        Prueba libro1 = new Prueba("El quijote", "Cervantes", 1, 0);
	        
	        //se crea el objeto libro2 utilizando el constructor por defecto
	        Prueba libro2 = new Prueba();

	        System.out.print("Introduce titulo: ");
	        titulo = sc.nextLine();
	        System.out.print("Introduce autor: ");
	        autor = sc.nextLine();
	        System.out.print("Numero de ejemplares: ");
	        ejemplares = sc.nextInt();

	        //se asigna a libro2 los datos pedidos por teclado.
	        //para ello se utilizan los m�todos setters
	        libro2.setTitulo(titulo);
	        libro2.setAutor(autor);
	        libro2.setEjemplares(ejemplares);
	        
	        
	        System.out.println("Libro 1:");
	        System.out.println("Titulo: " + libro1.getTitulo());
	        System.out.println("Autor: " + libro1.getAutor());
	        System.out.println("Ejemplares: " + libro1.getEjemplares());
	        System.out.println("Prestados: " + libro1.getPrestados());
	        System.out.println();
	        
	        //se realiza un pr�stamo de libro1. El m�todo devuelve true si se ha podido
	        //realizar el pr�stamo y false en caso contrario
	        if (libro1.prestamo()) {
	            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	        } else {
	            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
	        }

	        //se realiza una devoluci�n de libro1. El m�todo devuelve true si se ha podido
	        //realizar la devoluci�n y false en caso contrario
	        if (libro1.devolucion()) {
	            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
	        } else {
	            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
	        }

	        //se realiza otro pr�stamo de libro1
	        if (libro1.prestamo()) {
	            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	        } else {
	            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
	        }

	        //se realiza otro pr�stamo de libro1. En este caso no se podr� realizar ya que
	        //solo hay un ejemplar de este libro y ya est� prestado. Se mostrar� por
	        //pantalla el mensaje No quedan ejemplares del libro�
	        if (libro1.prestamo()) {
	            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	        } else {
	            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
	        }
	        //mostrar los datos del objeto libro1
	        System.out.println("Libro 1:");
	        System.out.println("Titulo: " + libro1.getTitulo());
	        System.out.println("Autor: " + libro1.getAutor());
	        System.out.println("Ejemplares: " + libro1.getEjemplares());
	        System.out.println("Prestados: " + libro1.getPrestados());
	        System.out.println();

	        //mostrar los datos del objeto libro2
	        System.out.println("Libro 2:");
	        System.out.println("Titulo: " + libro2.getTitulo());
	        System.out.println("Autor: " + libro2.getAutor());
	        System.out.println("Ejemplares: " + libro2.getEjemplares());
	        System.out.println("Prestados: " + libro2.getPrestados());
	        System.out.println();
	    
	        

	}

}
