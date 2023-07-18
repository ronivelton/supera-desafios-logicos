package TerceiroDesafio;

import java.util.HashSet;
import java.util.Scanner;

public class TerceiroDesafio {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] arrayLengthAndK = scanner.nextLine().split(" ");

    int k  = Integer.parseInt(arrayLengthAndK[1]);
    int n = Integer.parseInt(arrayLengthAndK[0]);

    String[] arrayString = scanner.nextLine().split(" ");
    int[] array = new int[n];

    for (int i = 0; i < arrayString.length; i++) {
      array[i] = Integer.parseInt(arrayString[i]);
  }
    
    System.out.println("Número de pares: " + countPairs(array, n, k));

    scanner.close();
  }

  static int countPairs(int arr[], int n, int k) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
  
        // Adiciona todos os elementos no conjunto
        for (int i = 0; i < n; i++)
            set.add(arr[i]);
  
        // Para cada elemento no array, verifica se existe um outro elemento no conjunto que, 
        // quando subtraído do elemento atual, é igual ao valor alvo
        for (int i = 0; i < n; i++)
            if (set.contains(arr[i] - k)) 
                count++;
  
        return count;
    }
}

