package edu.neu.mgen;

import java.util.ArrayList;
public class App 
{

    public static void main( String[] args )
    {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Austin");
        cities.add("Houstin");      
        cities.add("Oakland");
        cities.add("Paris");
        cities.add("San Francisco");
        cities.add("Seattle");

        System.out.println("Original ArrayList:"+cities);

        //Remove "Paris" from the ArrayList
        cities.remove("Paris");
        System.out.println("ArrayList after removing 'Paris' : "+ cities);

    }
}
