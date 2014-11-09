package surse;

/**
 * Created by Mihai on 10/28/2014.
 * <p/>
 * this exception is very complexed created, it is only for example ... for another complexity Cexception extented
 */


public class UseCustomException extends Exception {

    MyCustomizedException newExc = new MyCustomizedException("This is a custom exception");

    public UseCustomException() throws MyCustomizedException {


        System.out.println("And this time we have a customized exception ! \n");
        throw newExc;

    }
}
