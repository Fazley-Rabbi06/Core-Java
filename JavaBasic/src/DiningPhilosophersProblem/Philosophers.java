package DiningPhilosophersProblem;

public class Philosophers implements Runnable {
    String name;
    Fork leftFork;
    Fork rightFork;
    public Philosophers(String name, Fork leftFork, Fork rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }
    public void think(){
        log("Thinking");
    }
    public void eat(){
        log("Picked up right fork - eating");
    }
    public void log(String message){
        System.out.println(name+" "+Thread.currentThread().hashCode()+": "+message);
//        System.out.printf("%s %d : %s",name,Thread.currentThread().hashCode(),message);
    }
    public void thinkingEating(){
        think();
        synchronized (leftFork){
            log("Picked up left fork");
            synchronized (rightFork){
                eat();
                try {
                    Thread.sleep(Long.parseLong("2000"));
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
            log("Put down right fork");
        }
        log("Put down left fork. Back to thinking");
    }
    @Override
    public void run() {
        while (true){
            thinkingEating();
        }
        }
}

