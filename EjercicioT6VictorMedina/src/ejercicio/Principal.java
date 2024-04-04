package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String aux, codigo;
		double recaudado, totalRecaudado = 400;
		int operaciones;
		boolean repetir = false;

		Caja caja = new Caja(totalRecaudado);

		do {
			try {

				System.out.println("Introduzca el codigo del trabajador");
				codigo = sc.nextLine();
				caja.comprobarCodigo(codigo);

				System.out.println("Introduzca lo recaudado hoy");
				aux = sc.nextLine();
				recaudado = Double.parseDouble(aux);
				caja.comprobarRecaudado(recaudado);

				System.out.println("Introduzca cuantas operaciones se han hecho hoy");
				aux = sc.nextLine();
				operaciones = Integer.parseInt(aux);
				caja.comprobarOperaciones(operaciones);

				repetir = true;
			} catch (ExceptionCodigo e) {
				System.err.println("Error en el codigo del trabajador, introduzca su codigo ");

			} catch (ExceptionRecaudado e) {

				System.err.println("Debe ser igual a lo recaudado, no robes pillin");
			} catch (ExceptionOperaciones e) {

				System.err.println("No puedes hacer operaciones negativas");
			} catch (RuntimeException e) {

				System.err.println("Errror inesperado, introduzca los datos validos");
			}
		} while (!repetir);
		sc.close();
	}

}
