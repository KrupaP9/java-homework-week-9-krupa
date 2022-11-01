/*10. Write the programme that tell you which line pass through particular stations.
        Just use Zone 1 stations name.*/
package javaprogrammesweek9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaProgramme_10_LondonZone1StationsAndLines {
    public static void main(String[] args) {
        //create HashMap
        HashMap<String, List<String>> hashMap=new HashMap<String,List<String>>();
        //create multiple array lists (one for each station)
        ArrayList<String>station1BondStreet = new ArrayList<>();
        station1BondStreet.add("Central Line");
        station1BondStreet.add("Elizabeth Line");
        station1BondStreet.add("Jubilee Line");

        ArrayList<String>station2OxfordCircus = new ArrayList<>();
        station2OxfordCircus.add("Central Line");
        station2OxfordCircus.add("Bakerloo Line");
        station2OxfordCircus.add("Victoria Line");

        ArrayList<String>station3TottenhamCourtRoad = new ArrayList<>();
        station3TottenhamCourtRoad.add("Central Line");
        station3TottenhamCourtRoad.add("Elizabeth Line");

        ArrayList<String>station4Holborn = new ArrayList<>();
        station4Holborn.add("Central Line");
        station4Holborn.add("Piccadilly Line");

        ArrayList<String>station5Bank = new ArrayList<>();
        station5Bank.add("Central Line");
        station5Bank.add("Northern Line");

        ArrayList<String>station6ElephantCastle = new ArrayList<>();
        station6ElephantCastle.add("Bakerloo Line");
        station6ElephantCastle.add("Northern Line");

        ArrayList<String>station7Paddington = new ArrayList<>();
        station7Paddington.add("Bakerloo Line");
        station7Paddington.add("Elizabeth Line");

        ArrayList<String>station8LiverpoolStreet = new ArrayList<>();
        station8LiverpoolStreet.add("Central Line");
        station8LiverpoolStreet.add("Elizabeth Line");
        station8LiverpoolStreet.add("Circle Line");

        ArrayList<String>station9Waterloo = new ArrayList<>();
        station9Waterloo.add("Bakerloo Line");
        station9Waterloo.add("Jubilee Line");

        ArrayList<String>station10Embankment = new ArrayList<>();
        station10Embankment.add("Bakerloo Line");
        station10Embankment.add("Circle Line");

        ArrayList<String>station11PiccadillyCircus = new ArrayList<>();
        station11PiccadillyCircus.add("Bakerloo Line");
        station11PiccadillyCircus.add("Piccadilly Line");

        ArrayList<String>station12BakerStreet = new ArrayList<>();
        station12BakerStreet.add("Bakerloo Line");
        station12BakerStreet.add("Jubilee Line");
        station12BakerStreet.add("Circle Line");

        ArrayList<String>station13EdgewareRoad = new ArrayList<>();
        station13EdgewareRoad.add("Bakerloo Line");
        station13EdgewareRoad.add("Circle Line");

        ArrayList<String>station14Farringdon = new ArrayList<>();
        station14Farringdon.add("Elizabeth Line");
        station14Farringdon.add("Circle Line");

        ArrayList<String>station15Victoria = new ArrayList<>();
        station15Victoria.add("Victoria Line");
        station15Victoria.add("Circle Line");

        ArrayList<String>station16GreenPark = new ArrayList<>();
        station16GreenPark.add("Victoria Line");
        station16GreenPark.add("Piccadilly Line");
        station16GreenPark.add("Jubilee Line");

        ArrayList<String>station17KingsCrossStPancras = new ArrayList<>();
        station17KingsCrossStPancras.add("Victoria Line");
        station17KingsCrossStPancras.add("Piccadilly Line");
        station17KingsCrossStPancras.add("Northern Line");
        station17KingsCrossStPancras.add("Circle Line");

        ArrayList<String>station18Westminster = new ArrayList<>();
        station18Westminster.add("Jubilee Line");
        station18Westminster.add("Circle Line");

        ArrayList<String>station19LondonBridge = new ArrayList<>();
        station19LondonBridge.add("Jubilee Line");
        station19LondonBridge.add("Northern Line");

        ArrayList<String>station20Moorgate = new ArrayList<>();
        station20Moorgate.add("Northern Line");
        station20Moorgate.add("Circle Line");

        //assign each array list as a hashmap value for the station key
        hashMap.put("Bond Street",station1BondStreet);
        hashMap.put("Oxford Circus", station2OxfordCircus);
        hashMap.put("Tottenham Court Road", station3TottenhamCourtRoad);
        hashMap.put("Holborn",station4Holborn);
        hashMap.put("Bank",station5Bank);
        hashMap.put("Elephant & Castle", station6ElephantCastle);
        hashMap.put("Paddington",station7Paddington);
        hashMap.put("Liverpool Street", station8LiverpoolStreet);
        hashMap.put("Waterloo",station9Waterloo);
        hashMap.put("Embankment",station10Embankment);
        hashMap.put("Piccadilly Circus", station11PiccadillyCircus);
        hashMap.put("Baker Street",station12BakerStreet);
        hashMap.put("Edgeware Road", station13EdgewareRoad);
        hashMap.put("Farringdon",station14Farringdon);
        hashMap.put("Victoria",station15Victoria);
        hashMap.put("Green Park",station16GreenPark);
        hashMap.put("King'd Cross St. Pancras", station17KingsCrossStPancras);
        hashMap.put("Westminster",station18Westminster);
        hashMap.put("London Bridge",station19LondonBridge);
        hashMap.put("Moorgate",station20Moorgate);
        System.out.println("Rail Stations and Lines in Zone 1:\n");
        //for loop to print stations with the lines that pass through them
        for(Map.Entry<String,List<String>>entry: hashMap.entrySet()){
            String station = entry.getKey();
            List<String> lines = entry.getValue();
            System.out.println("This station is: "+station);
            System.out.println("Lines passing through "+station +" are "+lines);
        }
    }
}
