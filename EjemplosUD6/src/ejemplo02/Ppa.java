package ejemplo02;

import java.time.LocalDate;
import java.util.Scanner;

public class Ppa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		boolean repetir = false;
		LocalDate fecha = LocalDate.now();
		LocalDate fechaReserva;
		GestionReserva gestionReserva = new GestionReserva(fecha);

		do {
			try {

				System.out.println("Introduzca la fecha de la reseva");
				aux = sc.nextLine();
				fechaReserva = LocalDate.parse(aux);
				gestionReserva.hacerReserva(fechaReserva);

			} catch (Exception e) {

			}

		} while (!repetir);

	}

}
