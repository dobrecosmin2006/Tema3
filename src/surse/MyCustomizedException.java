package surse;

/**
 * Created by Mihai on 10/29/2014.
 */
public class MyCustomizedException extends Exception {

    public MyCustomizedException(String message) {
        super(message);
    }

    public MyCustomizedException(String message, Throwable throwable) {
        super(message, throwable);
    }

}

