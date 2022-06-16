package Zadanie6;

public class Cat extends Animal{
    public Cat(String run){
        this.run = run;
    }
    public void infoRun(){
        System.out.println("Кот пробежал: " + run);
    }
}
