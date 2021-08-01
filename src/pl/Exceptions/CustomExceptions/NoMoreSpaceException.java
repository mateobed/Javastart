package pl.Exceptions.CustomExceptions;

class NoMoreSpaceException extends Exception {
    public NoMoreSpaceException(String message) {
        super(message);
    }
}