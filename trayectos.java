package Proyecto;

import java.util.Scanner;

public class trayectos {
	Scanner tec = new Scanner(System.in);

	String cOrigen;
	String cDestino;
	String Salida;
	String Llegada;
	int DV;
	int horas = 13;
	int minutos = 00;
	int precio;

	public void mostrarMenuTrayectos(String cOrigen, String cDestino) {

		// Valencia
		if (cOrigen.equals("Valencia") || cOrigen.equals("valencia")) {

			if (cDestino.equals("Madrid") || cDestino.equals("madrid")) {

				precio = 50;
				DV = 2;
				System.out.println();
				System.out.println("Valencia ----- Madrid");
				System.out.println("Duracion viaje: " + DV + "h");
				System.out.println("Horario Salidas:");
				System.out.println("1: 13:00 / 2: 14:00 / 3: 15:00");
				System.out.println();

				int q = 1;

				do {
					System.out.println("Seleccione hora de salida:");

					int salida = tec.nextInt();
					if (salida == 1 || salida == 2 || salida == 3) {

						q = 0;
						switch (salida) {

						case 1:
							horas = 13;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 2:
							horas = 14;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 3:
							horas = 15;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						}

					} else {
						System.out.println("Hora no valida seleccione una valida.");
					}
				} while (q == 1);

			}

			if (cDestino.equals("Barcelona") || cDestino.equals("barcelona")) {

				precio = 20;
				DV = 1;
				System.out.println();
				System.out.println("Valencia ----- Barcelona");
				System.out.println("Duracion viaje: " + DV + "h");
				System.out.println("Horario Salidas:");
				System.out.println("1: 13:00 / 2: 14:00 / 3: 15:00");
				System.out.println();
				int q = 1;

				do {
					System.out.println("Seleccione hora de salida:");

					int salida = tec.nextInt();
					if (salida == 1 || salida == 2 || salida == 3) {

						q = 0;
						switch (salida) {

						case 1:
							horas = 13;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 2:
							horas = 14;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 3:
							horas = 15;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						}

					} else {
						System.out.println("Hora no valida seleccione una valida.");
					}
				} while (q == 1);

			}

			if (cDestino.equals("Sevilla") || cDestino.equals("sevilla")) {

				precio = 30;
				DV = 3;
				System.out.println();
				System.out.println("Valencia ----- Sevilla");
				System.out.println("Duracion viaje: " + DV + "h");
				System.out.println("Horario Salidas:");
				System.out.println("1: 13:00 / 2: 14:00 / 3: 15:00");
				System.out.println();
				int q = 1;

				do {
					System.out.println("Seleccione hora de salida:");

					int salida = tec.nextInt();
					if (salida == 1 || salida == 2 || salida == 3) {

						q = 0;
						switch (salida) {

						case 1:
							horas = 13;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 2:
							horas = 14;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 3:
							horas = 15;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						}

					} else {
						System.out.println("Hora no valida seleccione una valida.");
					}
				} while (q == 1);
			}
		}

		// Madrid
		if (cOrigen.equals("Madrid") || cOrigen.equals("madrid")) {

			if (cDestino.equals("Valencia") || cDestino.equals("valencia")) {

				precio = 50;
				DV = 2;
				System.out.println();
				System.out.println("Madrid ----- Valencia");
				System.out.println("Duracion viaje: " + DV + "h");
				System.out.println("Horario Salidas:");
				System.out.println("1: 13:00 / 2: 14:00 / 3: 15:00");
				System.out.println();
				int q = 1;

				do {
					System.out.println("Seleccione hora de salida:");

					int salida = tec.nextInt();
					if (salida == 1 || salida == 2 || salida == 3) {

						q = 0;
						switch (salida) {

						case 1:
							horas = 13;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 2:
							horas = 14;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 3:
							horas = 15;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						}

					} else {
						System.out.println("Hora no valida seleccione una valida.");
					}
				} while (q == 1);

			}

			if (cDestino.equals("Barcelona") || cDestino.equals("barcelona")) {

				precio = 20;
				DV = 3;
				System.out.println();
				System.out.println("Madrid ----- Barcelona");
				System.out.println("Duracion viaje: " + DV + "h");
				System.out.println("Horario Salidas:");
				System.out.println("1: 13:00 / 2: 14:00 / 3: 15:00");
				System.out.println();
				int q = 1;

				do {
					System.out.println("Seleccione hora de salida:");

					int salida = tec.nextInt();
					if (salida == 1 || salida == 2 || salida == 3) {

						q = 0;
						switch (salida) {

						case 1:
							horas = 13;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 2:
							horas = 14;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 3:
							horas = 15;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						}

					} else {
						System.out.println("Hora no valida seleccione una valida.");
					}
				} while (q == 1);
			}

			if (cDestino.equals("Sevilla") || cDestino.equals("sevilla")) {

				precio = 10;
				DV = 1;
				System.out.println();
				System.out.println("Madrid ----- Sevilla");
				System.out.println("Duracion viaje: " + DV + "h");
				System.out.println("Horario Salidas:");
				System.out.println("1: 13:00 / 2: 14:00 / 3: 15:00");
				System.out.println();
				int q = 1;

				do {
					System.out.println("Seleccione hora de salida:");

					int salida = tec.nextInt();
					if (salida == 1 || salida == 2 || salida == 3) {

						q = 0;
						switch (salida) {

						case 1:
							horas = 13;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 2:
							horas = 14;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 3:
							horas = 15;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						}

					} else {
						System.out.println("Hora no valida seleccione una valida.");
					}
				} while (q == 1);
			}

		}

		// Sevilla

		if (cOrigen.equals("Sevilla") || cOrigen.equals("sevilla")) {

			if (cDestino.equals("Valencia") || cDestino.equals("valencia")) {

				precio = 30;
				DV = 2;
				System.out.println();
				System.out.println("Sevilla ----- Valencia");
				System.out.println("Duracion viaje: " + DV + "h");
				System.out.println("Horario Salidas:");
				System.out.println("1: 13:00 / 2: 14:00 / 3: 15:00");
				System.out.println();
				int q = 1;

				do {
					System.out.println("Seleccione hora de salida:");

					int salida = tec.nextInt();
					if (salida == 1 || salida == 2 || salida == 3) {

						q = 0;
						switch (salida) {

						case 1:
							horas = 13;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 2:
							horas = 14;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 3:
							horas = 15;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						}

					} else {
						System.out.println("Hora no valida seleccione una valida.");
					}
				} while (q == 1);

			}

			if (cDestino.equals("Barcelona") || cDestino.equals("barcelona")) {

				precio = 10;
				DV = 1;
				System.out.println();
				System.out.println("Sevilla ----- Barcelona");
				System.out.println("Duracion viaje: " + DV + "h");
				System.out.println("Horario Salidas:");
				System.out.println("1: 13:00 / 2: 14:00 / 3: 15:00");
				System.out.println();
				int q = 1;

				do {
					System.out.println("Seleccione hora de salida:");

					int salida = tec.nextInt();
					if (salida == 1 || salida == 2 || salida == 3) {

						q = 0;
						switch (salida) {

						case 1:
							horas = 13;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 2:
							horas = 14;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 3:
							horas = 15;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						}

					} else {
						System.out.println("Hora no valida seleccione una valida.");
					}
				} while (q == 1);
			}

			if (cDestino.equals("Madrid") || cDestino.equals("madrid")) {

				precio = 30;
				DV = 3;
				System.out.println();
				System.out.println("Sevilla ----- Madrid");
				System.out.println("Duracion viaje: " + DV + "h");
				System.out.println("Horario Salidas:");
				System.out.println("1: 13:00 / 2: 14:00 / 3: 15:00");
				System.out.println();
				System.out.println("Seleccione hora de salida:");

				int q = 1;

				do {
					System.out.println("Seleccione hora de salida:");

					int salida = tec.nextInt();
					if (salida == 1 || salida == 2 || salida == 3) {

						q = 0;
						switch (salida) {

						case 1:
							horas = 13;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 2:
							horas = 14;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						case 3:
							horas = 15;
							minutos = 00;
							Salida = horas + ":" + minutos;

							break;

						}

					} else {
						System.out.println("Hora no valida seleccione una valida.");
					}
				} while (q == 1);
			}

		}

	}

	String TC;

	public void generarprebillete(String cOrigen, String cDestino) {

		int i = 1;
		
		// Elegir clase de viaje
		
		do {
		
			System.out.println();
			System.out.println("En que clase desea viajar:");
			System.out.println("1.First class (Precio doble que economy)");
			System.out.println("2.Economy class (Precio adaptado a todo el mundo)");
		int tipoClase = tec.nextInt();
		if (tipoClase == 1 || tipoClase == 2) {
			
		i = 0;
		
		switch (tipoClase) {

		case 1:
			TC = "First class";
			precio = precio * 2;

			break;

		case 2:
			TC = "Economy class";
			break;

		}
		}else {
			System.out.println("Clase no valida, seleccione una clase valida");
		}
		} while (i == 1);

		int codigotren = (int) (Math.random() * 999) + 1;

		horas = horas + DV;

		System.out.println("--- Origen: " + cOrigen + "   --/-- Hora salida: " + Salida);
		System.out.println();
		System.out.println("--- Destion: " + cDestino + " --/-- Hora llegada: " + horas + ":" + minutos);
		System.out.println();
		System.out.println("--- Duracion viaje: " + DV + " h. " + " --/-- Codigo tren" + " N." + codigotren + "/");
		System.out.println();
		System.out.println("--- Tipo Clase: " + TC + " --/-- " + " Precio: " + precio + "€");

	}

}