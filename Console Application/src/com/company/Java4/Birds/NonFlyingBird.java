package com.company.Java4.Birds;

/**
 * Created by Документи on 12.02.2017.
 */
abstract public class NonFlyingBird extends Bird {

    public NonFlyingBird(String habitat) {
        super(habitat);
    }

    abstract boolean swim();

    @Override
    public boolean fly(){
        return false;
    }
}
