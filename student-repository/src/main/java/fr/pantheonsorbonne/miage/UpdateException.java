package fr.pantheonsorbonne.miage;

public class UpdateException extends Exception {

	private static final long serialVersionUID = 1L;

	public UpdateException(String errorMessage) {
        super(errorMessage);
    }
}
