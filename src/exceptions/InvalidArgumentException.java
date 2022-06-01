package exceptions;

public class InvalidArgumentException extends Exception
{
	/**
	 * Initializes the newly created InvalidArgumentException
	 */
	public InvalidArgumentException() {
		super();
	}

	/**
	 * Initializes the newly created InvalidArgumentException
	 * 
	 * @param message specific error message
	 */
	public InvalidArgumentException(String message) {
		super(message);
	}
}
