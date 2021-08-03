public class Ninja extends Human{
    public Ninja() {
        this.stealth = 10;
    }

    public void steal(Human target) {
        target.setHealth(target.getHealth() - this.stealth);
        System.out.println("Where's your wallet?");
    }

    public void smokescreen() {
        this.setHealth(this.health -= 10);
        System.out.println("The ninja escapes!");
    }
}
