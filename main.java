package Proyecto;

import java.time.LocalDateTime;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		String TC;
		String cOrigen;
		String cDestino;

		LocalDateTime locaDate = LocalDateTime.now();
		int hours  = locaDate.getHour();
		int minutes = locaDate.getMinute();
		int seconds = locaDate.getSecond();
		
		System.out.println("**** -Trenes cafran- ***" + "Hora actual: "+ hours  + ":" + minutes + ":" + seconds + "****");
		System.out.println("Destinos: Barcelona / Madrid / Sevilla / Valencia");
		System.out.println("1: Entrar como trabajador");
		System.out.println("2: Realizar reserva");

		String n = tec.nextLine();

		switch (n) {

		case "1":
			System.out.println("Lo sentimos pera esta opcion no esta disponible, estamos trabajando en ello");
			break;

		case "2":

			trayectos t = new trayectos();

			// ciudad origen

			int salir = 0;

			do {

				System.out.println("Introducir ciudad de origen:");

				cOrigen = tec.nextLine();

				if (cOrigen.equals("Valencia") || cOrigen.equals("valencia") || cOrigen.equals("Madrid")
						|| cOrigen.equals("madrid") || cOrigen.equals("Sevilla") || cOrigen.equals("sevilla")
						|| cOrigen.equals("Barcelona") || cOrigen.equals("barcelona")) {
					System.out.println("Ciudad valida");
					salir = 1;

				} else {
					System.out.println("Ciudad no valida");
				}

			} while (salir == 0);

			// ciudad destino

			do {
				System.out.println("Introducir ciudad de destino:");

				cDestino = tec.nextLine();

				if (cDestino.equals("Valencia") || cDestino.equals("valencia") || cDestino.equals("Madrid")
						|| cDestino.equals("madrid") || cDestino.equals("Sevilla") || cDestino.equals("sevilla")
						|| cDestino.equals("Barcelona") || cDestino.equals("barcelona")) {
					System.out.println("Ciudad valida");
					salir = 0;

				} else {
					System.out.println("Ciudad no valida");
				}

			} while (salir == 1);

			// mostrar trayectos

			t.mostrarMenuTrayectos(cOrigen, cDestino);

			// Elegir clase de viaje

			System.out.println();
			System.out.println("En que clase desea viajar:");
			System.out.println("1.First class (Precio doble que economy)");
			System.out.println("2.Economy class (Precio adaptado a todo el mundo)");

			int tipoClase = tec.nextInt();

			System.out.println("****************-Confirmar billete-****************");
			t.generarprebillete(cOrigen, cDestino, tipoClase);

			System.out.println();
			System.out.println("1. Continuar con la reserva y realizar pago. ");
			System.out.println("2. Cancelar reserva.");

			int cc = tec.nextInt();

			switch (cc) {

			case 1:

				precio p = new precio();

				p.realizarpago();

				break;

			case 2:

				System.out.println("Reserva cancelada");

				break;

			}

			precio precio = new precio();

			System.out.println();

			System.out.println();

			System.out.println();
			precio.mostrarReservaCompleta();

			System.out.println();
			System.out.println("Son los datos corectos?");
			int S = 1;
			do {

				System.out.println("1.Continuar.");
				System.out.println("2.Volver a introducir los datos.");

				int c = tec.nextInt();

				if (c == 1) {

					System.out.println("****************-Billete-****************");
					t.generarprebillete(cOrigen, cDestino, tipoClase);
					System.out.println();
					precio.mostrarReservaCompleta();

					S = 0;

				}

				if (c == 2) {

					precio.realizarpago();

				} else {

					System.out.println("Introduzca una opcion valida.");

				}

			} while (S == 1);

			System.out.println("Fin del programa");

		}

	}

}
