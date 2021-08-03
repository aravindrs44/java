public class Wizard extends Human{
    public Wizard() {
        this.intelligence = 8;
        this.health = 50;
    }

    public void heal(Human target) {
        target.setHealth(target.getHealth() + this.intelligence);
        System.out.println("Popping a batt");
    }

    public void fireball (Human target) {
        target.setHealth(target.getHealth() - (this.intelligence * 3));
        System.out.println("Get flamed!");
    }
}