package footballTeam.validators;

public class InvalidException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public InvalidException(String message) {
		super(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
