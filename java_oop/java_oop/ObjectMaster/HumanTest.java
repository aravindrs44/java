public class HumanTest {
    public static void main(String[] args) {
        Human rosscar = new Human();
        Human rick = new Human();

        rick.attack(rosscar);

        //Object Master Part 1

        Wizard brownlightning = new Wizard();
        brownlightning.fireball(rosscar);

        Ninja sasayaki = new Ninja();
        sasayaki.smokescreen();
        sasayaki.steal(rick);
        System.out.println(sasayaki.getHealth());

        Samurai momoi = new Samurai();
        momoi.deathBlow(sasayaki);
        sasayaki.getHealth();
        momoi.meditate();
        momoi.getHealth();
    }
}