package OOP;

class Bicycle {
    int  cadence = 0;
    int speed = 0;
    int gear =1 ;

    void changeCadence(int c){
        cadence = c;
    }
    void changeGear(int g){
        gear = g;
    }
    void speedUp(int speed){
        this.speed = this.speed + speed;
    }
    int speedDown(int speed){
        if (this.speed == 0)
            return speed;
        else
            this.speed = this.speed - speed;
        return speed;
    }
    public Bicycle(int c, int s,int g) {
        cadence = c;
        speed = s;
        gear = g;
    }
    public Bicycle(){
    }
    void displayState(){
        System.out.println("Cadence : "+cadence+"\nSpeed : "+speed+"\nGear : "+gear+"\n");
    }
    }

