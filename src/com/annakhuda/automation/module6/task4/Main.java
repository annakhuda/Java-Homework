package com.annakhuda.automation.module6.task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        placeOrders();
    }

    public static void placeOrders() {
        List<String> orders = new ArrayList<String>();
        orders.add("Order 1");
        orders.add("Order 2");
        orders.add("Order 3");
        orders.add("Order 4");
        orders.add("Order 5");
        orders.add("Order 1");
        Set<String> hashSetWithOrders = new HashSet<String>();
        Set<String> treeSetWithOrders = new TreeSet<String>();
        for (String order : orders) {
            hashSetWithOrders.add(order);
            treeSetWithOrders.add(order);
        }

        System.out.println("\nHashSet with orders: ");
        for (String order : hashSetWithOrders) {
            System.out.println(order);
        }

        System.out.println("\nTreeSet with orders: ");
        for (String order : treeSetWithOrders) {
            System.out.println(order);
        }
    }
}
