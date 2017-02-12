package com.company.Java4.Birds;

/**
 * Created by Документи on 12.02.2017.
 */
public class Penguin extends NonFlyingBird {

    final public static String HABITAT = "The most population lives in Antarctica and Subantarctica";

    public Penguin() {
        super(HABITAT);
    }

    @Override
    boolean swim() {
        return true;
    }
}
