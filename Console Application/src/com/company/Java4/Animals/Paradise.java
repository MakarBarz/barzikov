package com.company.Java4.Animals;

/**
 * Created by Документи on 12.02.2017.
 */
public class Paradise {
    public static void main(String[] args) {
    Animal array[] = new Animal[4];
    array[0] = new Cat();
    array[1] = new Cat();
    array[2] = new Dog();
    array[3] = new Dog();

        for (int i = 0; i < array.length; i++) {
            array[i].voice();
            array[i].feed();
        }
}
}
