package ejercicio;

public class Caja {

	private double totalRecaudado;
	private int operacionesTotales;
	private String codigoTrabajador;

	public Caja(double totalRecaudado, int operacionesTotales, String codigoTrabajador) {
		super();
		this.totalRecaudado = totalRecaudado;
		this.operacionesTotales = operacionesTotales;
		this.codigoTrabajador = codigoTrabajador;
	}

	public double getTotalRecaudado() {
		return totalRecaudado;
	}

	public void setTotalRecaudado(double totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}

	public int getOperacionesTotales() {
		return operacionesTotales;
	}

	public void setOperacionesTotales(int operacionesTotales) {
		this.operacionesTotales = operacionesTotales;
	}

	public String getCodigoTrabajador() {
		return codigoTrabajador;
	}

	public void setCodigoTrabajador(String codigoTrabajador) {
		this.codigoTrabajador = codigoTrabajador;
	}

	@Override
	public String toString() {
		return "Caja [totalRecaudado=" + totalRecaudado + ", operacionesTotales=" + operacionesTotales
				+ ", codigoTrabajador=" + codigoTrabajador + "]";
	}

	public void comprobarRecaudado(double recaudado) throws ExceptionRecaudado {

		if (recaudado != totalRecaudado) {
			throw new ExceptionRecaudado();
		}
	}

	public void comprobarOperaciones(int operaciones) throws ExceptionOperaciones {

		if (operaciones != operacionesTotales) {
			throw new ExceptionOperaciones();
		}
	}

	public void comprobarCodigo(String codigo) throws ExceptionCodigo {

		if (!codigo.equals(codigoTrabajador)) {
			throw new ExceptionCodigo();
		}
	}

}