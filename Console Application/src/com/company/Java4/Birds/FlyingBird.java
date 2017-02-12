package com.company.Java4.Birds;

/**
 * Created by Документи on 12.02.2017.
 */
abstract public class FlyingBird extends Bird {

    public FlyingBird(String habitat) {
        super(habitat);
    }

    abstract boolean liveNearHuman();

    @Override
    public boolean fly(){
        return true;
    }
}
