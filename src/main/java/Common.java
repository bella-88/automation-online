import java.math.BigDecimal;
import java.util.Arrays;

public class Common {
  public BigDecimal giaithua(Integer number) {
    if (number < 0) {
      throw new NumberFormatException("Invalid number");
    }
    if (number == 0) {
      return BigDecimal.ZERO;
    }
    BigDecimal result = BigDecimal.ONE;
    for (int i = 1; i <= number; i++) {
      result = result.multiply(BigDecimal.valueOf(i));
    }
    return result;
  }

  public void giaiPTBac2(float a, float b, float c) {
    if (a == 0) {
      if (b == 0) {
        System.out.println("Phương trình vô nghiệm!");
      } else {
        System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
      }
      return;
    }
    float delta = b * b - 4 * a * c;
    System.out.println("Delta la:" + delta);
    float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
    float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
    if (delta < 0) {
      System.out.println("Phương trình vô nghiệm!");
    } else if (delta == 0) {
      System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
    } else {
      System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
    }
  }

  public void timChuoi(String chuoi, String tu) {

    String[] listStr = chuoi.split(" ");
    for (String str : listStr
    ) {
      if (str.contains(tu)) {
        System.out.println("Tu co chua " + tu + " la: " + str);
      }
    }
  }

  public boolean checkLength(String str) {
    boolean check = true;
    if (str.length() > 20) {
      check = false;
    }
    return check;
  }

  public boolean checkContainString(String str, String chuoiCon) {
    boolean check = true;
    if (!str.contains(chuoiCon)) {
      check = false;
    }
    return check;
  }

  public boolean checkStartKyTu(String str, String kyTu) {
    boolean check = true;
    if (!str.startsWith(kyTu, 0)) {
      check = false;
    }
    return check;
  }

  public boolean checkEndKyTu(String str, String chuoiCon) {
    boolean check = true;
    if (!str.endsWith(chuoiCon)) {
      check = false;
    }
    return check;
  }

  public boolean checkDinhDangChuoi(String chuoi) {
    String[] list = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    int i = 1;
    boolean check = true;
    while (i < chuoi.length()) {
      for (String number : list
      ) {
        if (!number.contains(String.valueOf(chuoi.charAt(i)))) {
          check = false;
        }
      }
//      System.out.println("Phan tu thu " + i + " trong chuoi " + chuoi + " la: " + chuoi.charAt(i));
      i++;
    }
    return check;
  }
}
