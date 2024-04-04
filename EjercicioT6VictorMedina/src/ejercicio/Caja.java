package ejercicio;

public class Caja {

	private double totalRecaudado;

	public Caja(double totalRecaudado) {
		super();
		this.totalRecaudado = totalRecaudado;
	}

	public double getTotalRecaudado() {
		return totalRecaudado;
	}

	public void setTotalRecaudado(double totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}

	@Override
	public String toString() {
		return "Caja [totalRecaudado=" + totalRecaudado + "]";
	}

	public boolean comprobarRecaudado(double recaudado) throws ExceptionRecaudado {

		if (recaudado != totalRecaudado) {
			throw new ExceptionRecaudado();
		} else {
			return true;
		}
	}

	public boolean comprobarOperaciones(int operaciones) throws ExceptionOperaciones {

		if (operaciones < 0) {
			throw new ExceptionOperaciones();
		} else {
			return true;
		}
	}

	public boolean comprobarCodigo(String codigo) throws ExceptionCodigo {

		String expresion = "[A-Z a-z][0-9]{4}";

		if (codigo.matches(expresion)) {
			return true;
		} else {
			throw new ExceptionCodigo();
		}
	}

}