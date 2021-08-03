public class Samurai extends Human{
    protected static int samuraiPopulation = 0;
    public Samurai() {
        this.health = 200;
        this.samuraiPopulation++;
    }

    public void deathBlow(Human target) {
        target.setHealth(0);
        this.setHealth(this.getHealth()/2);
        System.out.println("The samurai bows out of respect");
    }

    public void meditate() {
        this.setHealth(200);
        System.out.println("The samurai meditates on the battlefield");
    }

    public void howMany() {
        System.out.println(samuraiPopulation);
    }
}