package SegundoDesafio;

import java.util.Scanner;

public class SegundoDesafio {
  private static final double[] bills = {100, 50, 20, 10, 5, 2};
  private static final double[] coins = {1, 0.5, 0.25, 0.1, 0.05, 0.01};
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double value = scanner.nextDouble();
    System.out.println("NOTAS:");
    for (double bill : bills) {
      System.out.println(String.format("%d      nota(s)     de      R$ %.2f", (int) (value/bill), bill));
      value %= bill;
    }

    System.out.println("MOEDAS:");
    for (double coin : coins) {
      System.out.println(String.format("%d      moeda(s)     de      R$ %.2f", (int) (value/coin), coin));
      value %= coin;
    }
    scanner.close();
  }
}
