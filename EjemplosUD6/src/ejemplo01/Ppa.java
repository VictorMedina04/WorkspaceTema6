package ejemplo01;

public class Ppa {

	public static void main(String[] args) {

		int num = 10, den = 0;
		double res = 0;

		try {
			res = num / den;
			System.out.printf("La division es: %.2f", res);

		} catch (RuntimeException e) {
			System.err.println("<Ha reventao maquina>");
		}

	}

}
