package ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cantProducto=0;
		double precioUnidad=0;
		double precioTotal=0;
		final int iva = 21;
		
		
		String descripcion;	
		String razonSocial;
		String domicilio;
		String hayProductos="s";
		
		
		System.out.println("Hay productos en caja? s/n");
		
		hayProductos= scan.next();
		
		while ("s".equals(hayProductos)) {
			
			System.out.println("Cantidad de productos:");
			cantProducto = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Descripcion:");
			descripcion = scan.nextLine();
			
			System.out.print("Precio Unidad: ");
			precioUnidad = scan.nextDouble();
			
			precioTotal = ((precioUnidad * iva) / 100);
			
			System.out.println("Hay productos en caja? s/n");
			
			hayProductos= scan.next();
		}
	
		System.out.print("Razon Social: ");
		razonSocial = scan.nextLine();
		
		System.out.print("Domicilio: ");
		domicilio = scan.nextLine();
		
		System.out.println("*************************************************************************************");
		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
		System.out.print("Fecha: ");
		System.out.println(sdf.format(fecha));
		System.out.println("*************************************************************************************");
		System.out.print("Nombre: ");
		System.out.println(razonSocial);
		System.out.print("Domicilio:: ");
		System.out.println(domicilio);
		System.out.println("*************************************************************************************");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
	}

}
