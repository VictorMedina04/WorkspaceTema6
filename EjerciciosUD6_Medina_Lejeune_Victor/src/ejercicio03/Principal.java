package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
<<<<<<< HEAD
		boolean repetir = false;
		do {

		} while (repetir);
=======
		int a, b, c, x = 5;
		boolean repetir = false;
		do {

			try {

				System.out.println("Dato a");
				aux = sc.nextLine();
				a = Integer.parseInt(aux);
				System.out.println("Dato b");
				aux = sc.nextLine();
				b = Integer.parseInt(aux);
				System.out.println("Dato c");
				aux = sc.nextLine();
				c = Integer.parseInt(aux);

				CEcuacion2Grado ce = new CEcuacion2Grado(a, b, c);

				if (b == 0 && a == 0) {
					throw new ExceptionEcuacion("A y B son 0. No se puede continuar");
				}

				if ((Math.sqrt(Math.pow(b, 2)) - 4 * a * c) < 0) {
					System.out.println(ce.formulaMas(x));
				} else {
					System.out.println(ce.formulaMenos(x));
				}

				repetir = true;

			} catch (ExceptionEcuacion e) {
				System.out.println(e.getMessage());
			}

		} while (!repetir);
		sc.close();
>>>>>>> 08d795913a0fcca32a152284264c5fb8292a4861
	}

}
