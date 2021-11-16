package JavaFeatures08;

public class Trainee implements Trainer,Trainer01{
    @Override
    public void topic() {
        System.out.println("Java training is on going for trainee");
    }

    @Override
    public String name(String s) {
        return Trainer.super.name(s);
    }
}
