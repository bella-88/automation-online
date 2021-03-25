import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class session2  extends Common{
  private static Scanner scanner = new Scanner(System.in);


  public void btGiaiThua() {
    int i = 180;
    System.out.println("Giai thua cua " + i + "  la: " + giaithua(i));
  }


  public void btGiaiPt() {
    System.out.println("===GIAI PHUONG TRINH BAC 2=====");
    float a = 5;
    float b = 9;
    float c = 2;
   giaiPTBac2(a, b, c);
  }

  @Test
  public void timChuoi() {
    String str = "";
    String tu = "";
      timChuoi(str,tu);
  }

}

