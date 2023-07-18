package QuartoDesafio;

import java.util.Scanner;

public class QuartoDesafio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());

    StringBuilder results = new StringBuilder();

    for (int i = 0; i < n; i++) {
        String line = scanner.nextLine();
        results.append(decipher(line)).append("\n");
    }

    System.out.println(results.toString());

    scanner.close();
}

static String decipher(String input) {
    int length = input.length();
    
    String firstHalf = input.substring(0, length / 2);
    String secondHalf = input.substring(length / 2, length);

    return new StringBuilder(firstHalf).reverse().toString() + 
           new StringBuilder(secondHalf).reverse().toString();
}
}
