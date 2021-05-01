package ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cantProducto1=0;
		int cantProducto2=0;
		
		double precioUnidad1=0;
		double precioTotal1=0;
		
		
		double precioUnidad2=0;
		double precioTotal2=0;
		
		double total=0;
		double totalSinIva=0;
		double iva=0;
		

		
		boolean unProducto=false;
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
			
			precioTotal1 = precioUnidad1 * cantProducto1;
			totalSinIva = precioTotal1;
			iva = iva + (precioTotal1 * 0.21);
			
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
			
				precioTotal2 = precioUnidad2 * cantProducto2;
			
				totalSinIva = precioTotal1 + precioTotal2;
				iva=0;
				iva = (iva + ((precioTotal1 + precioTotal2) * 0.21));
				
				unProducto=true;
			
				}else {
					//iva = iva + (subTotal * 0.21);
					total = (iva + precioTotal1);
					totalSinIva = precioTotal1;
					unProducto=true;
				}
		}else {
			unProducto = false;
		}
		
		//subTotal = (subTotal1 + subTotal2);
		//iva = iva + (subTotal * 0.21);
		total =(totalSinIva + iva);
		
	
		System.out.println("Razon Social: ");
		razonSocial = scan.nextLine();
		scan.nextLine();
		
		System.out.println("Domicilio: ");
		domicilio = scan.nextLine();
		System.out.println("\n");
		
		System.out.println("Imprimiendo Ticket....\n");
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
		if(unProducto) {
			System.out.println(cantProducto1 + "\t| " + descripcion1.toString() + "\t\t\t| $" + precioUnidad1 + "\t\t| $" + precioTotal1);
			System.out.println("-------------------------------------------------------------------------------------");
		}
		if("s".equals(hayProductos)) {
		  System.out.println(cantProducto2 + "\t| " + descripcion2.toString() + "\t\t\t| $" + precioUnidad2 + " \t\t| $" + precioTotal2);
		}
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("IVA: $" + iva);
		System.out.println("Subtotal sin IVA: $" + (totalSinIva));
		System.out.println("Total: $" + (total));
		System.out.println("*************************************************************************************");
		
	}

}
