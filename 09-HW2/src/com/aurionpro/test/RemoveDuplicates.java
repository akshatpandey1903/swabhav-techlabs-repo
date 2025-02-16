package com.aurionpro.test;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Pikachu", "Charizard", "Pikachu", "Blastoise", "Charizard", "Venusaur"));

        LinkedHashSet<String> uniqueElements = new LinkedHashSet<>(list);
        ArrayList<String> result = new ArrayList<>(uniqueElements);

        System.out.println("Original List: " + list);
        System.out.println("List after removing duplicates: " + result);
    }
}

