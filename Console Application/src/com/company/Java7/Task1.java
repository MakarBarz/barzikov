package com.company.Java7;

import java.util.*;

/**
 * Created by Документи on 19.02.2017.
 */
public class Task1 {

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            myCollection.add(random.nextInt(40));
        }
        System.out.println("Random array: " + Arrays.toString(myCollection.toArray()));

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) newCollection.add(i);
        }
        System.out.println("Positions with elements more than 5: " + Arrays.toString(newCollection.toArray()));

        myCollection = new LinkedList<Integer>(myCollection);
        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i > 20) iterator.remove();
        }
        System.out.println("Collection without elements, which are greater then 20: " + Arrays.toString(myCollection.toArray()));

        for (int i = 0; i < 9 - myCollection.size(); i++) {
            myCollection.add(0);
        }
        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }

        myCollection.sort(new IntComparator());
        System.out.println("Collection after sorting: " + Arrays.toString(myCollection.toArray()));


    }


}
class IntComparator implements java.util.Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }

}
