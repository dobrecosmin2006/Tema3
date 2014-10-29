package Main;

import surse.MyCustomizedException;

/**
 * Created by Mihai on 10/28/2014.
 * <p/>
 * clasa Main . aici voi rula programul prin folosirea
 * catorva metode
 */


public class UseCustomException extends Exception {

    MyCustomizedException newExc = new MyCustomizedException("This is a custom exception");

    public UseCustomException() throws MyCustomizedException {


        System.out.println("And this time we have a customized exception ! \n");
        throw newExc;

    }
}
