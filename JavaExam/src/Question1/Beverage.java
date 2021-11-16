package Question1;

public abstract class Beverage {
    String description = "Unknown Beverage Description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
