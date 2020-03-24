package Proyecto;

import java.util.Scanner;

public class precio {

	Scanner tec = new Scanner(System.in);
	
	String NombreP;
	String ApellidoP1;
	String ApellidoP2;
	String dni;
	
	String NPago;
	String A1Pago;
	String A2Pago;
	
	int Ncuenta;
	int CVV;
	
   vaidarDNI D = new validarDNI();
	
	public void realizarpago() {
		
		System.out.println("******** -Datos pasajero- ********");
		
		System.out.println("Nombre pasajero:");
		
		NombreP = tec.nextLine();
		
		System.out.println("Primer apellido:");
		
		ApellidoP1 = tec.nextLine();
		
		System.out.println("Segundo apellido:");
		
		ApellidoP2 = tec.nextLine();
		
		System.out.println("DNI pasajero:");
		
		dni = tec.nextLine();
		
		System.out.println("********* -Realizar pago- *********");
		System.out.println();
		System.out.println("Nombre titular de la targeta:");
		
		NPago = tec.nextLine();
		
		System.out.println("Primer apellido del titular de la targeta: ");
		
		A1Pago= tec.nextLine();
		
		System.out.println("Segundo apellido del titular de la targeta: ");
		
		A2Pago = tec.nextLine();
		
		System.out.println("Introducir el numero de targeta:");
		
		Ncuenta = tec.nextInt();
		
		System.out.println("Introduzca el CVV:");
		
		CVV = tec.nextInt();
		
	}
	
	public void mostrarReservaCompleta() {
		
		
		System.out.println("************* -Datos pasajero- *************");
		System.out.println("Nombre pasajaro: " + NombreP + " " + ApellidoP1 + " " + ApellidoP2);
		System.out.println("DNI pasajero: " + dni);
		System.out.println();
		System.out.println("************* -Datos titular targeta- *************");
		System.out.println("Nombre titular: " + NPago + " " + A1Pago + " " + A2Pago);
		System.out.println("Numero targeta:" + Ncuenta + " --/-- CVV: Correcto");
	}
	
	
	
	
}
