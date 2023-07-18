package PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {
  private static final List<Integer> evenArray = new ArrayList<>();
  private static final List<Integer> oddArray = new ArrayList<>();
  
  public static void main(String[] args){
    System.out.println("ENTRADA:");
    inputValues();
    sortArrays();
    System.out.println("SAIDA:");
    outputValues();
  }

  private static void inputValues() {
    int numberOfLines;
    int entryNumber;
    Scanner sc = new Scanner(System.in);
    
    do {
      numberOfLines = sc.nextInt();  
    } while (numberOfLines < 1 || numberOfLines > 10);

    for(int line = 0; line < numberOfLines; line++) {
      entryNumber = sc.nextInt();
      if (isEven(entryNumber)) {
        evenArray.add(entryNumber);
      } else {
        oddArray.add(entryNumber);
      }
    }

    sc.close();
  }

  private static boolean isEven(int number) {
    return number % 2 == 0;
  }

  private static void sortArrays() {
    evenArray.sort(Comparator.naturalOrder());
    oddArray.sort(Comparator.reverseOrder());
  }

  private static void outputValues() {
    for (int evenNumber : evenArray) {
      System.out.println(evenNumber);
    }

    for (int oddNumber : oddArray) {
      System.out.println(oddNumber);
    }
  }
}
