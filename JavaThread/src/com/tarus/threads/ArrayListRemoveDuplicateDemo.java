package com.tarus.threads;

import java.util.*;

/*
 * How to Remove Duplicate Elements From an ArrayList in Java?
 * 1. Using other collection
 * 2. Using HashSet
 * 3. Using LinkedHashSet
 * 4. Using Java Streams
 */
public class ArrayListRemoveDuplicateDemo {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>(2);
        cityList.add("London");
        cityList.add("Paris");
        cityList.add("Bangalore");
        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Chennai");
        System.out.println("Before removing the elements in the list");
        for (String name : cityList) {
            System.out.println("City Name - " + name);
        }
        System.out.println("After removing the elements in the list");

        hashSetRemove(cityList);

        linkedHashSetRemove(cityList);

        otherCollection(cityList);
    }

    public static void otherCollection(List<String> cityList) {
        System.out.println("By using other collection/ creating new List");
        List<String> newCityList = new ArrayList<>();
        for (String cityName : cityList) {
            if (!newCityList.contains(cityName)) {
                newCityList.add(cityName);
            }
        }
        for (String name : newCityList) {
            System.out.println("New City Name - " + name);
        }

    }

    public static void hashSetRemove(List<String> cityList) {
        System.out.println("By using HashSet");
        Set<String> newCitySet = new HashSet<String>(cityList);
        cityList.clear();
        cityList.addAll(newCitySet);
        for (String name : cityList) {
            System.out.println("City Name - " + name);
        }
        //Again adding duplicates to work with other types
        addDuplicateElement(cityList);

    }

    /**
     * Using LinkedHashSet removing the duplicates elements in an array
     * @param cityList
     */
    public static void linkedHashSetRemove(List<String> cityList) {
        System.out.println("By using LinkedHashSet");
        Set<String> newCitySet = new LinkedHashSet<String>(cityList);
        cityList.clear();
        cityList.addAll(newCitySet);
        for (String name : cityList) {
            System.out.println("City Name - " + name);
        }
        //Again adding duplicates to work with other types
        addDuplicateElement(cityList);

    }

    /**
     * Adding duplicate city names to work with other types(Removal of Duplicates)
     * @param cityList
     */
    public static void addDuplicateElement(List<String> cityList) {
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Chennai");

    }
}