public class TestFizzBuzz  {
  public static void main(String[] args) {
    FizzBuzz tester = new FizzBuzz();

    System.out.println(tester.fizzBuzz(9));
    System.out.println(tester.fizzBuzz(10));
    System.out.println(tester.fizzBuzz(15));

    System.out.println(tester.fizzBuzz(10, "hunka", "hunka hunka", "hunka hunka hunka"));
  }
}