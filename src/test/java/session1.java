import org.junit.Test;

import java.util.Scanner;

public class session1 {

  public void ex1() {
    System.out.println("hello world");
  }

  public void ex2() {
    Months[] months = Months.values();
     for (int i = 0; i < months.length; i++) {
      System.out.println("Month: " + months[i]);
    }
  }

  public void ex3() {
    String[] number = {"11", "2", "32", "42", "51", "62", "7", "8", "9", "10"};
    System.out.println("========In day so su dung vong For=========");
    for (int i = 0; i < number.length; i++) {
      System.out.println("Gia tri thu " + i + " la: " + number[i]);
    }
    System.out.println("========In day so su dung vong While=========");
    int i = 0;
    while (i < number.length) {
      System.out.println("Gia tri thu " + i + " la: " + number[i]);
      i++;
    }
    System.out.println("========In day so su dung vong While - Do=========");
    int j = 0;
    do {
      System.out.println("Gia tri thu " + j + " la: " + number[j]);
      j++;
    } while (j < number.length);
    System.out.println("========In day so su dung vong For Each=========");
    String[] list ={"8","32","564","1221","43"};
    for (String str:list)
          {
            System.out.println("Gia tri là: "+str );

    }

  }

  public void Ex4() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input any year: ");
//    int number = sc.nextInt();
    int number = 2004;
    System.out.println("Your number is " + number);
    boolean b1 = number % 4 == 0;
    boolean b2 = number % 100 == 0;
    boolean b3 = number % 400 == 0;
    if (b1 && b2 && b3) {
      System.out.println("Year " + number + " is valid");
    } else if (!b1 || !b3) {
      System.out.println("Year " + number + " is valid");
    }
  }
}
