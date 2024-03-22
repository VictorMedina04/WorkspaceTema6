package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String aux, codigo, codigoTrabajador = "A1234";
		double recaudado, totalRecaudado = 400;
		int operaciones, operacionesTotales = 50;
		boolean repetir = false;

		Caja caja = new Caja(totalRecaudado, operacionesTotales, codigoTrabajador);

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
				System.out.println("Errror inesperado, introduzca los datos validos");

			} catch (ExceptionRecaudado e) {

				System.out.println("Errror inesperado, introduzca los datos validos");
			} catch (ExceptionOperaciones e) {

				System.out.println("Errror inesperado, introduzca los datos validos");
			} catch (RuntimeException e) {

				System.out.println("Errror inesperado, introduzca los datos validos");
			} catch (Exception e) {

				System.out.println("Errror inesperado, introduzca los datos validos");
			}
		} while (!repetir);
		sc.close();
	}

}
