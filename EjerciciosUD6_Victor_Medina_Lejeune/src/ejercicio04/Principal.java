package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		double a, b, suma;
		boolean repetir = false;

		do {
			try {
				System.out.println("Introduzca el primer sumando");
				aux = sc.nextLine();
				a = Double.parseDouble(aux);
				System.out.println("Introduzca el segundo sumando");
				aux = sc.nextLine();
				b = Double.parseDouble(aux);
				suma = a + b;
				if (suma >= 10) {
					throw new ExceptionSuma("La suma no puede ser mayor que 10");
				} else {
					System.out.printf("El resultado de las suma es: %.2f \n", suma);
				}

			} catch (ExceptionSuma e) {
				System.out.println("Introduzca otra vez los números ");
			} catch (Exception e) {
				System.out.println("Error inesperado");
			}
		} while (!repetir);

	}

}
