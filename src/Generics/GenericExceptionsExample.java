package Generics;

import java.util.logging.Level;
import java.util.logging.Logger;

class GenericException extends Exception {

    public <T> GenericException(T message) {
        super(message.toString());
    }
}
public class GenericExceptionsExample {
    static Logger logger = Logger.getLogger(GenericExceptionsExample.class.getName());
    public static void main(String[] args) {
        try{
            logger.log(Level.WARNING, "This is a generic exception example");
            throw new GenericException("This is a generic exception");
        }catch (GenericException e) {
            System.out.println("Cause: " + e.getMessage());
        }
    }
}
