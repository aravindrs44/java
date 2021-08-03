
public class Bat extends Mammal {
    public int energyLevel;

    public Bat() {
        this.energyLevel = 300;
    }

    public void fly() {
        energyLevel -= 50;
        System.out.println("Fadoo Fadoo Fadoo!");
    }

    public void eatHumans() {
        energyLevel += 25;
        System.out.println("Stop I'm a vegetari-CRONCH");
    }

    public void attackTown() {
        energyLevel -= 100;
        System.out.println("AAAAAAHHHHHHHHHHHHHHHH");
    }
}