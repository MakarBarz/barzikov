package com.company.Java4.Birds;

/**
 * Created by Документи on 12.02.2017.
 */
abstract public class Bird {
    final protected String CHARACTERISTIC1 = "Feathers";
    final protected String CHARACTERISTIC2 = "LayEGGS";
    final protected String HABITAT;

    protected Bird(String habitat) {
        HABITAT = habitat;
    }

    abstract boolean fly();
}
