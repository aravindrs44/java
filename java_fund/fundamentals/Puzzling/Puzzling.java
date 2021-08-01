import java.util.Arrays;

public class Puzzling {
  public static void main(String[] args) {
    Puzzling tester = new Puzzling();
    String[] randomArr = {qjmyfpnl, lsvyssgi, jmxlzbyr, xairaoyp, tgtjfcwe, eopxbori, chlxmjpr, gbwlurdz};
    tester.shuffleArray(randomArr);
  }

  public static void getTenRolls() {
    int[] randomNums;
    randomNums = new int[10];
    // Random rand = new Random();
    for(int i = 0; i < randomNums.length; i++) {
      randomNums[i] = (int)(Math.floor(Math.random() * 20) + 1);
    }
    System.out.print(Arrays.toString(randomNums));
  }

  public static void getRandomLetter() {
    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    int num = (int)(Math.floor(Math.random() * 26));
    System.out.print(alphabet[num]);
  }

  public static String generatePassword() {
    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String password = "";
    for(int i = 1; i <= 8; i++) {
      int num = (int)(Math.floor(Math.random() * 26));
      String chara = alphabet[num];
      password += chara;
    }
    return password;
  }

  public void getNewPasswordSet(int length) {
    String[] randomWords;
    randomWords = new String[length];
    for(int i = 0; i < length; i++) {
      randomWords[i] = generatePassword();
    }
    System.out.print(Arrays.toString(randomWords));
  }

  public void shuffleArray(int[] array) {
    for(int i = 0; i < array.length; i++) {
      int num = (int)(Math.floor(Math.random() * array.length));
      array[i] = array[num];
    }
  }
  System.out.print(Arrays.toString(array));
}