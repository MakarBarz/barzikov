package com.company.Java4.Birds;

/**
 * Created by Документи on 12.02.2017.
 */
public class BirdHouse {
    public static void main(String[] args) {
        Bird[] birds = new Bird[5];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();
        birds[4] = new Chicken();

        for (int i = 0; i < birds.length; i++) {
            String s;
            s = birds[i].CHARACTERISTIC1 + ", " + birds[i].CHARACTERISTIC2 + ", flying: " + birds[i].fly();
            if (birds[i] instanceof FlyingBird) s += ", life at people: " + ((FlyingBird) birds[i]).liveNearHuman();
            if (birds[i] instanceof NonFlyingBird) s += ", ability to swim: " + ((NonFlyingBird) birds[i]).swim();
            s += ", species: " + birds[i].getClass().getSimpleName() + ". " + birds[i].HABITAT;
            System.out.println(s);
        }
    }
}
