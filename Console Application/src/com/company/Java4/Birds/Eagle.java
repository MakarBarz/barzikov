package com.company.Java4.Birds;

/**
 * Created by Документи on 12.02.2017.
 */
public class Eagle extends FlyingBird {

    final public static String HABITAT = "The most population lives in Eurasia and Africa";

    public Eagle() {
        super(HABITAT);
    }

    @Override
    boolean liveNearHuman() {
        return false;
    }
}
