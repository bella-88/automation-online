import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class session2 {
  private static Scanner scanner = new Scanner(System.in);

@Test
  public void ex1() {
    double f = 1;
    BigDecimal giai_thua = new BigDecimal(Double.toHexString(f));
    System.out.println("In giai thua");
    for (int i = 2; i < 200; i++) {
      giai_thua = giai_thua.multiply(BigDecimal.valueOf(i));
    }
  System.out.println("Giai thua cua 200 la: "+ giai_thua);
  }


  public void giaiPTBac2(float a, float b, float c) {
    // kiểm tra các hệ số
    if (a == 0) {
      if (b == 0) {
        System.out.println("Phương trình vô nghiệm!");
      } else {
        System.out.println("Phương trình có một nghiệm: "
          + "x = " + (-c / b));
      }
      return;
    }
    float delta = b * b - 4 * a * c;
    float x1;
    float x2;
    if (delta > 0) {
      x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
      x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
      System.out.println("Phương trình có 2 nghiệm là: "
        + "x1 = " + x1 + " và x2 = " + x2);
    } else if (delta == 0) {
      x1 = (-b / (2 * a));
      System.out.println("Phương trình có nghiệm kép: "
        + "x1 = x2 = " + x1);
    } else {
      System.out.println("Phương trình vô nghiệm!");
    }
  }

  public void ex2() {
    System.out.println("===GIAI PHUONG TRINH BAC 2=====");
    System.out.print("Nhập hệ số bậc 2, a = ");
    float a = session2.scanner.nextFloat();
    System.out.print("Nhập hệ số bậc 1, b = ");
    float b = session2.scanner.nextFloat();
    System.out.print("Nhập hằng số tự do, c = ");
    float c = scanner.nextFloat();
    giaiPTBac2(a, b, c);
  }

  public void ex3() {
    String text ="We guarantee we won't be beat on price. If you find a cheaper deal on another website after you book with us, we will refund the difference! We offer various payment methods to make a booking with us. Choose from Credit and Debit Cards and the leading Cryptocurrencies.";
    String[] listStr = text.split(" ");

      for (String str: listStr
         ) {
        if (str.contains("an")){
          System.out.println("Tu co chua 'an' la: "+str);
        }

    }
    System.out.println("Please input any year: ");
  }

}

