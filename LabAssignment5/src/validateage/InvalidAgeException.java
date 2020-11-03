package validateage;

public class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		super("You entered an invalid age ");
	}
}
