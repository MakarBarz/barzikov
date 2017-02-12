package com.company.Java4.Birds;

/**
 * Created by Документи on 12.02.2017.
 */
public class Swallow extends FlyingBird {

    final public static String HABITAT = "The most population lives in Eurasia, Africa and America";

    public Swallow() {
        super(HABITAT);
    }

    @Override
    boolean liveNearHuman() {
        return true;
    }
}
