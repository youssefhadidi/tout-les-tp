package rental;

public class UnknownVehicleException extends RuntimeException {

	public UnknownVehicleException() {
	}

	public UnknownVehicleException(String msg) {
		super(msg);
	}
}
