package ejemplo02;

import java.time.LocalDate;

public class GestionReserva {

	private LocalDate fecha;

	public GestionReserva(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "GestionReserva [fecha=" + fecha + "]";
	}

	public void hacerReserva(LocalDate fechaReserva) throws ExceptionReserva {
		if (fechaReserva.isBefore(LocalDate.now())) {
			throw new ExceptionReserva("No se puede reservar una fecha pasada");
		} else
			System.out.println("Reservado con exito");
	}

}
