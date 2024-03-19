package ejercicio02;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		double celsius, fahrenheit;
		boolean repetir = false;
		do {
			try {
				System.out.println("Introduzca los grados celsius que quiere pasar a fahrenheit");
				aux = sc.nextLine();
				celsius = Integer.parseInt(aux);

				if (celsius < -273) {
					throw new TemperaturaException("Error de temperatura");
				}
				fahrenheit = celsius * 9.0 / 5.0 + 32;
				System.out.printf("%.2f ºC son %.2f ºF", celsius, fahrenheit);
				repetir = true;
			} catch (TemperaturaException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

		} while (!repetir);
		sc.close();
	}
}
