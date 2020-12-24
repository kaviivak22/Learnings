package com.tarus.threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
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


        Iterator<String> cityIterator = cityList.iterator();
        while (cityIterator.hasNext()) {
            String city = cityIterator.next();
            if (city.equalsIgnoreCase("Mumbai")) {
                //cityList.remove(city);//Structurally modifying ArrayList while iterating
                cityIterator.remove();//Modifying ArrayList using iterator's remove method

            }
            System.out.println("City name -" + city);
        }
        System.out.println("After removing the elements in the list");

        // iterating after removal
        for (String name : cityList) {
            System.out.println("City Name - " + name);
        }
        //Removing duplicate elements in an ArrayList

        System.out.println("How to Remove Duplicate Elements From an ArrayList in Java?");
        List<String> newCityList = new ArrayList<>();
        for (String cityName : cityList) {
            if (!newCityList.contains(cityName)) {
                newCityList.add(cityName);
            }
        }
        for (String name : newCityList) {
            System.out.println("City Name - " + name);
        }
    }
}
