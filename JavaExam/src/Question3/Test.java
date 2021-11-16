package Question3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Test {
    String country;
    String city;
    String location;
    String description;

    public TouristSpot() {
    }

    public TouristSpot(String country, String city, String location, String description) {
        this.country = country;
        this.city = city;
        this.location = location;
        this.description = description;
    }

    @Override
    public String toString() {
        return "TouristSpot{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


public class Main {

    static Map<String, List<TouristSpotDetail>> touristSpotList = new HashMap<String, List<TouristSpotDetail>>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creation of tourist Spot
        System.out.println("Enter Country Name: ");
        String country = sc.nextLine();

        System.out.println("Enter City Name: ");
        String city = sc.nextLine();

        String touristSpot = country + "_" + city;

        System.out.println("Enter Location Name: ");
        String location = sc.nextLine();

        System.out.println("Enter Description Name: ");
        String description = sc.nextLine();

        TouristSpotDetail touristSpotDetail = new TouristSpotDetail(country, city, location, description);

        List<TouristSpotDetail> oldSpots = touristSpotList.get(touristSpot);
        if( oldSpots == null ) oldSpots = new ArrayList();

        oldSpots.add(touristSpotDetail);
        touristSpotList.put(touristSpot, oldSpots);

        for (var entry : touristSpotList.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }

        // Query part
        System.out.println("Enter Query Country Name: ");
        String countryName = sc.nextLine();

        System.out.println("Enter Query City Name: ");
        String cityName = sc.nextLine();

        String query_touristSpot = countryName + "_" + cityName;

        List<TouristSpotDetail> allSpot = touristSpotList.get(query_touristSpot);

        for( TouristSpotDetail spot : allSpot ) {
            System.out.print(spot);
        }

    }}