import java.util.ArrayList;
import java.util.Arrays;

public class Basics  {
  public static void main(String[] args) {
    Basics tester = new Basics();
    int[] array = {-2, 10, 3, -3};
    tester.arrayShifter(array);
  }

  //Print 1-255
  public static void byteNumbers()  {
    for(int i = 1; i <= 255; i++) {
      System.out.println(i);
    }
  }

  //Print odd numbers from 1-255
  public static void byteOddNumbers()  {
    for(int i = 1; i <= 255; i = i + 2) {
      System.out.println(i);
    }
  }

  //Sigma of 255 AKA Sum to 255
  public static int byteSumNumbers()  {
    int sum = 0;
    for(int i = 1; i <= 255; i++) {
      sum += i;
    }
    return sum;
  }

  //Iterating through an array
  public void arrayIteration(int[] array)  {
    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  //Find Max
  public void arrayMax(int[] array)  {
    int max = array[0];
    for(int i = 0; i < array.length; i++) {
      if(max < array[i]) {
        max = array[i];
      }
    }
    System.out.println(max);
  }

  public static void arrayOdd()  {
    ArrayList<Integer> oddByteArray = new ArrayList<Integer>();
    for(int i = 1; i <= 255; i = i + 2)  {
      oddByteArray.add(i);
    }
    System.out.println(oddByteArray);
  }

  public void avgArray(int[] array)  {
    double sum = 0;
    for(int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    double avg = sum / array.length;
    System.out.print(avg );
  }

  public int greaterThanY(int[] array, int y)  {
    int number = 0;
    for(int i : array) {
      if(i > y) {
        number++;
      }
    }
    return number;
  }

  public void squareArray(int[] array)  {
    for(int i = 0; i < array.length; i++) {
      array[i] *= array[i];
    }
    System.out.println(Arrays.toString(array));
  }

  public void noNegativeNumbers(int[] array)  {
    for(int i = 0; i < array.length; i++) {
      if(array[i] < 0) {
        array[i] = 0;
      }
    }
    System.out.print(Arrays.toString(array));
  }

  public void maxMinAvg(int[] array)  {
    int max = array[0];
    int min = array[0];
    double sum = 0;
    for(int i = 0; i < array.length; i++) {
      if(array[i] > max) {
        max = array[i];
      } else if(array[i] < min) {
        min = array[i];
      }
      sum += array[i];
    }
    double avg = sum / array.length;
    ArrayList<Object> mMA = new ArrayList<Object>();
    mMA.add(max);
    mMA.add(min);
    mMA.add(avg);

    System.out.print(mMA);
  }

  public void arrayShifter(int[] array)  {
    for(int i = 0; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
    array[array.length - 1] = 0;
    System.out.print(Arrays.toString(array));
  }
}