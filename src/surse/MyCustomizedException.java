package surse;

/**
 * Created by Mihai on 10/29/2014.
 * another class extended for exception but i don't use it
 *
 */
public class MyCustomizedException extends Exception {

    public MyCustomizedException(String message) {
        super(message);
    }

    public MyCustomizedException(String message, Throwable throwable) {
        super(message, throwable);
    }

}

