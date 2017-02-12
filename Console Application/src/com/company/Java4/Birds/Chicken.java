package com.company.Java4.Birds;

/**
 * Created by Документи on 12.02.2017.
 */
public class Chicken extends NonFlyingBird {

    final public static String HABITAT = "The entire population lives in the world at people";

    public Chicken() {
        super(HABITAT);
    }

    @Override
    boolean swim() {
        return false;
    }
}
