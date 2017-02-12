package com.company.Java4.Birds;

/**
 * Created by Документи on 12.02.2017.
 */
public class Kiwi extends NonFlyingBird {

    final public static String HABITAT = "The entire population lives in New Zealand";

    public Kiwi() {
        super(HABITAT);
    }

    @Override
    boolean swim() {
        return false;
    }
}
