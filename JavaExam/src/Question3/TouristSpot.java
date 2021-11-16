package Question3;

class TouristSpot {
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

    public String toString() {
        return "TouristSpot{country='" + this.country + "', city='" + this.city + "', location='" + this.location + "', description='" + this.description + "'}";
    }
}
