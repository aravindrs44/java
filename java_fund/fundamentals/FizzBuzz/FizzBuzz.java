public class FizzBuzz  {
  public String fizzBuzz(int number)  {
    if(number % 5 == 0 && number % 3 == 0)  {
      return "FizzBuzz";
    } else if(number % 5 == 0)  {
      return "Buzz";
    } else if(number % 3 == 0)  {
      return "Fizz";
    } else {
      String hunka = String.valueOf(number);
      return hunka;
    }
  }

  public String fizzBuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word)  {
    if(number % 5 == 0 && number % 3 == 0)  {
      return multOf15Word;
    } else if(number % 5 == 0)  {
      return multOf5Word;
    } else if(number % 3 == 0)  {
      return multOf3Word;
    } else {
      String hunka = String.valueOf(number);
      return hunka;
    }
  }
}