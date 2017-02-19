package com.company.Java7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Документи on 19.02.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        for (int i = 0; i < 7; i++) {
            employeeMap.put(i, "Name" + i);
        }
        for (Map.Entry<Integer, String> map : employeeMap.entrySet()) {
            System.out.println("ID: " + map.getKey() + ", name: " + map.getValue());
        }

        System.out.println("Enter ID:");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) System.out.println("Name of the ID is: " + employeeMap.get(id));
        else System.out.println("There is not this ID");
        System.out.println("Enter name:");
        String name = scanner.next();
        if (employeeMap.containsValue(name)) {
            Iterator<Map.Entry<Integer, String>> iterator = employeeMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, String> entry = iterator.next();
                if (entry.getValue().equals(name)) {
                    System.out.println("ID of this name is: " + entry.getKey());
                    break;
                }
            }
        }
        else System.out.println("There is not this name");


    }
}
