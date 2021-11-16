package DiningPhilosophersProblem;

public class TestDemo {
    public static void main(String[] args) {
        Fork[] forks = new Fork[5];
        Philosophers[] philosophers = new Philosophers[5];
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork();
        }
        for (int i = 0; i < philosophers.length; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i+1) % forks.length];
            if(i == philosophers.length-1){
                philosophers[i] = new Philosophers("Philosopher "+(i+1),rightFork,rightFork);
            }
            else {
                philosophers[i] = new Philosophers("Philosopher "+(i+1),leftFork,rightFork);
            }
            Thread thread =new Thread(philosophers[i]);
            thread.start();
            //For circular dependency there will create deadlock.
            //To handle this situation we have breakdown this circular dependency
        }
    }
}
