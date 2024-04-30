package br.com.nicolas.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Usuario não localizado com a id "+id);
	}
}
