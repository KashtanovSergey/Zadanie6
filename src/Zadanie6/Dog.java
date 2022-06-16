package Zadanie6;

public class Dog extends Animal {
        String swim;
    public Dog(String run, String swim) {
        this.run = run;
        this.swim = swim;
    }

    public void infoSwim(){
        System.out.println("Собака проплыла: " + swim);
    }
    public void infoRun(){
        System.out.println("Собака побежала:" + run);
    }
}
