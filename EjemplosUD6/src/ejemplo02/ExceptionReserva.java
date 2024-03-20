package ejemplo02;

public class ExceptionReserva extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionReserva() {
	}

	public ExceptionReserva(String string) {
		super(string);
	}
}
