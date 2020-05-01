package com.labinvent.cherkasov.core.exception;

public class ResourceNotFoundException extends RuntimeException {

    private static final String LIST_ERROR_MESSAGE = "%s not found";
    private static final String SINGLE_ERROR_MESSAGE = "%s not found with %s: %s";

    public ResourceNotFoundException(String resourceName) {
        super(String.format(LIST_ERROR_MESSAGE, resourceName));
    }

    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format(SINGLE_ERROR_MESSAGE, resourceName, fieldName, fieldValue));
    }

}
