//TASK 3

package org.collect;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Countries {
	private TreeMap<String, ArrayList<String>> countries = new TreeMap<>();
    public void listingCountry(String countryName, ArrayList<String> state){
        countries.put(countryName, state);
    }

    public ArrayList<String> getCountry(String countryName){
        for (Map.Entry<String, ArrayList<String>>
                entry : countries.entrySet()){
            if(entry.getKey().equals(countryName)){
                return entry.getValue();
            }
        }
        return null;
    }

    public void listCountryBefore(String countryName){
        for(Map.Entry<String, ArrayList<String>> entry : countries.entrySet()){

            if(entry.getKey().equals(countryName))
                break;
            System.out.println("Country = "+ entry.getKey() + ", States = " + entry.getValue());
        }
    }

    public void listCountryAfter(String countryName){
        boolean flag = false;
        for(Map.Entry<String, ArrayList<String>> entry : countries.entrySet()){

            if(flag)
                System.out.println("Country = "+ entry.getKey() + ", States = " + entry.getValue());
            if(entry.getKey().equals(countryName))
                flag = true;
        }
    }

    public static void main(String[] args) {

        ArrayList<String> indiaStates = new ArrayList<>();
        indiaStates.add("MADHYA PRADESH");
        indiaStates.add("MAHARASHTRA");
        indiaStates.add("ANDHRA PRADESH");
        indiaStates.add("KARNATAKA");
        indiaStates.add("RAJASTHAN");
        ArrayList<String> USStates = new ArrayList<>();
        USStates.add("ALASKA");
        USStates.add("CALIFORNIA");
        USStates.add("TEXAS");
        USStates.add("FLORIDA");
        Countries countries = new Countries();
        countries.listingCountry("India", indiaStates);
        countries.listingCountry("USA", USStates);
        System.out.println(countries.getCountry("India"));
        countries.listCountryAfter("India");
    }
}


