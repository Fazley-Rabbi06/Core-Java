package OOP;

public class TestBicycle {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle(1,2,3);
        bicycle1.displayState();
        Bicycle bicycle2 = new Bicycle();
        bicycle2.displayState();
        bicycle2.speedUp(100);
        bicycle2.displayState();
        bicycle2.speedDown(100);
        bicycle2.displayState();
        bicycle1.speedDown(500);
        bicycle1.displayState();
        bicycle1.speed = 0;
        bicycle1.speedDown(600);
        bicycle1.displayState();

    }

}
