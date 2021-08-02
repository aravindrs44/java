public class ProjectTest {
    public static void main(String[] args) {
        Project aravind = new Project("Aravind");
        Project ross = new Project("Ross", "Put respect on his name. His name is papi!", 46231789.00);
        Project hunka = new Project();

        System.out.println(aravind.elevatorPitch());
        System.out.println(ross.elevatorPitch());
        System.out.println(hunka.elevatorPitch());
    }
}