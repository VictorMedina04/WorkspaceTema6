package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String aux;
		int op, num1, num2, resultado;

		do {
			System.out.println("""
					1-Sumar
					2-Restar
					3-Multiplicar
					4-Dividir
					5-Raiz cuadrada
					""");

			aux = sc.nextLine();
			op = Integer.parseInt(aux);
			switch (op) {
			case 1:

				try {
					System.out.println("Introduzca el primero número");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					System.out.println("Introduzca el segundo número");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);
					resultado = num1 + num2;
				} catch (RuntimeException error) {
					System.out.println("Introduzca un número correcto");
				}
				break;
			case 2:
				try {
					System.out.println("Introduzca el primero número");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					System.out.println("Introduzca el segundo número");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);
					resultado = num1 - num2;
				} catch (RuntimeException error) {
					System.out.println("Introduzca un número correcto");
				}
				break;
			case 3:
				try {
					System.out.println("Introduzca el primero número");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					System.out.println("Introduzca el segundo número");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);
					resultado = num1 * num2;
				} catch (RuntimeException error) {
					System.out.println("Introduzca un número correcto");
				}
				break;
			case 4:
				try {
					System.out.println("Introduzca el primero número");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					System.out.println("Introduzca el segundo número");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);
					resultado = num1 / num2;
				} catch (RuntimeException error2) {
					System.out.println("Introduzca un número correcto");
				}
				break;
			case 5:
				try {
					System.out.println("Introduzca el primero número");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					Math.sqrt(num1);
				} catch (RuntimeException error2) {
					System.out.println("Introduzca un número correcto");
				}
				break;
			case 0:
				break;
			default:
				break;
			}

		} while (op != 0);

	}

}
