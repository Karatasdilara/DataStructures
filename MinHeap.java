
package minheap;


import java.util.Scanner;

public class MinHeap {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Kullanıcıdan sayıları alıyoruz
    System.out.println("Lütfen sayıları girin (virgülle ayrılmış bir biçimde):");
    String input = scanner.nextLine();

    // Sayıları virgülle ayırıp diziye atıyoruz
    String[] numbersStr = input.split(",");
    int[] numbers = new int[numbersStr.length];
    for (int i = 0; i < numbersStr.length; i++) {
      numbers[i] = Integer.parseInt(numbersStr[i]);
    }

    // Dizinin min heap olup olmadığını kontrol ediyoruz
    boolean isMinHeap = true;
    for (int i = 1; i < numbers.length; i++) {
      int parentIndex = (i - 1) / 3;
      if (numbers[parentIndex] > numbers[i]) {
        isMinHeap = false;
        break;
      }
    }
    if (isMinHeap) {
      System.out.println("Evet min heaptir");
    } else {
      System.out.println("Hayır min heap değildir");
    }

    // Diziyi üçlü min heap hale getiryoruz
    for (int i = 1; i < numbers.length; i++) {
      int childIndex = i;
      while (childIndex > 0) {
        int parentIndex = (childIndex - 1) / 3;
        if (numbers[parentIndex] > numbers[childIndex]) {
          int temp = numbers[parentIndex];
          numbers[parentIndex] = numbers[childIndex];
          numbers[childIndex] = temp;
        }
        childIndex = parentIndex;
      }
    }

    // Heap halini ekrana yazdırıyoruz
    System.out.println("Heap halinde:");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
  }
}

 
