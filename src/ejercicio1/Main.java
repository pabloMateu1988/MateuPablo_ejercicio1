package ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cantProducto1=0;
		double precioUnidad1=0;
		double subTotal1=0;
		
		int cantProducto2=0;
		double precioUnidad2=0;
		double subTotal2=0;
		
		double subTotal=0;
		double iva=0;
		double total=0;
		
		
		String descripcion1 = null;
		String descripcion2 = null;	
		String razonSocial;
		String domicilio;
		String hayProductos="s";
		
		
		System.out.println("Hay productos en caja? s/n");
		
		hayProductos= scan.next();
		
		if ("s".equals(hayProductos)) {
			
			System.out.println("Descripcion del producto:");
			descripcion1 = scan.next();
			scan.nextLine();
			
			System.out.println("Cantidad de " + descripcion1.toString() + ": ");
			cantProducto1 = scan.nextInt();
			scan.nextLine();
			
			System.out.println("Precio Unidad: ");
			precioUnidad1 = (scan.nextDouble());
			
			
			subTotal1 = (precioUnidad1 * cantProducto1);
			
			System.out.println("Hay más productos en caja? s/n");
			
			hayProductos= scan.next();
			
			if ("s".equals(hayProductos)) {
				
				System.out.println("Descripcion del producto:");
				descripcion2 = scan.next();
				scan.nextLine();
				
				System.out.println("Cantidad de " + descripcion2.toString() + ": ");
				cantProducto2 = scan.nextInt();
				scan.nextLine();
				
				
				System.out.println("Precio Unidad: ");
				precioUnidad2 = (scan.nextDouble());
				
				
				subTotal2 = (precioUnidad2 * cantProducto2);
				
				
			}
			
		}
		
		subTotal = (subTotal1 + subTotal2);
		iva = subTotal * 0.21;
		total = subTotal1 + subTotal2 + iva;
		
		
	
		System.out.println("Razon Social: ");
		razonSocial = scan.nextLine();
		scan.nextLine();
		
		System.out.println("Domicilio: ");
		domicilio = scan.nextLine();
		
		System.out.println("\n\nImprimiendo Ticket...\n\n");
		
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
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Cant.\t| Descripcion\t\t\t| P. Unit\t\t|P. Total	 ");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(cantProducto1 + "\t| " + descripcion1.toString() + "\t\t\t| $" + precioUnidad1 + "\t\t| $" + subTotal1);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(cantProducto2 + "\t| " + descripcion2.toString() + "\t\t\t| $" + precioUnidad2 + " \t\t| $" + subTotal2);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("IVA: $" + iva);
		System.out.println("Subtotal sin IVA: $" + subTotal);
		System.out.println("Total: $" + total);
		System.out.println("*************************************************************************************");
		
	}

}
