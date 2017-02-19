package com.company.Java7;

import java.util.*;

/**
 * Created by Документи on 19.02.2017.
 */
public class Homework {
    public static Set union(Set set1, Set set2) {
        Set set3 = new HashSet();
        set3.addAll(set1);
        set3.addAll(set2);
        return set3;
    }
    public static Set intersect(Set set1, Set set2) {
        Set set3 = new HashSet();
        set3.addAll(set1);
        set3.retainAll(set2);
        return set3;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            set1.add(random.nextInt(20));
        }
        System.out.println("Set1: " + Arrays.toString(set1.toArray()));

        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            set2.add(random.nextInt(20));
        }
        System.out.println("Set2: " + Arrays.toString(set2.toArray()));

        Set<Integer> set3 = Homework.union(set1, set2);
        Set<Integer> set4 = Homework.intersect(set1, set2);
        System.out.println("Result of union of set 1 and set2: " + Arrays.toString(set3.toArray()));
        System.out.println("Result of intersect of set 1 and set2: " + Arrays.toString(set4.toArray()));

        Map<String, String> personMap = new HashMap<>();
        String lastName, firstName = "";
        for (int i = 0; i < 9; i++) {
            Random random = new Random();
            lastName = String.valueOf(random.nextInt(100));
            firstName = String.valueOf(random.nextInt(100));
            personMap.put(lastName, firstName);
        }
        personMap.put(String.valueOf(new Random().nextInt(100)), "Orest");
        for (Map.Entry entry : personMap.entrySet()) {
            System.out.println("Last name: " + entry.getKey() + ", first name: " + entry.getValue());
        }
        System.out.println();

        Map<String, String> personMap1 = new HashMap<>();
        personMap1.putAll(personMap);
        Iterator<Map.Entry<String, String>> iterator = personMap1.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String name = entry.getValue();
            iterator.remove();
            if (personMap1.containsValue(name)) {
                System.out.println("There are at less two persons with the same firstName");;
                break;
            }
        }

        if (personMap.containsValue("Orest")){
            iterator = personMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                if (entry.getValue().equals("Orest")) {
                    iterator.remove();
                    break;
                }
            }
            for (Map.Entry entry : personMap.entrySet()) {
                System.out.println("Last name: " + entry.getKey() + ", first name: " + entry.getValue());
            }

        }
    }
}
