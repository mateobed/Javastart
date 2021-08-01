package pl.Exceptions.CustomExceptions;

class NoElementFoundException extends Exception {
    public NoElementFoundException(String message) {
        super(message);
    }
}