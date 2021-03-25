import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class session5 extends Common {
  @Test
  public void kiemTraMaSoSV() {
    String maSV = "B948629123";
    System.out.println("========Chuoi can kiem tra======== " + maSV);
    if (checkStartKyTu(maSV, "B") && checkDinhDangChuoi(maSV)) {
      System.out.println("La chuoi hop le: ");
    } else {
      System.out.println("La chuoi khong hop le: ");
    }
  }


  public void tinhTongSoChan() {
    int n = 20;
    List<Integer> listNumber = new ArrayList<Integer>();
    for (int i = 0; i <= 20; i++) {
      if (i % 2 == 0) {
        listNumber.add(i);
      }
    }
    int tong = 0;
    for (int i = 0; i < listNumber.size(); i++) {
      System.out.println("List so chan la: " + listNumber.get(i));
      tong = tong + listNumber.get(i);
    }
    System.out.println("Tong cac so tu 0 den " + n + " la: " + tong);
  }

  public void timFibonaci() {
    int n = 3;//Fi = 1+2+3 = 6
  }

  @Test
  public void kiemTraChuoi() {
    String str = "BSau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.2";
//    System.out.println("check Length: "+ checkLength(str));
//    System.out.println("check Contain String: "+ checkContainString(str," "));
//    System.out.println("check Start Ky Tu: "+ checkStartKyTu(str,"B"));
//    System.out.println("check End Ky Tu: "+ checkEndKyTu(str,"2"));
    System.out.println("==========Chuoi can kiem tra la=========");
    System.out.println("" + str);
    if (checkLength(str) && checkContainString(str, " ") && checkStartKyTu(str, "B") && checkEndKyTu(str, "2")) {
      System.out.println("Chuoi phu hop yeu cau - Duyet");
    } else {
      System.out.println("Chuoi khong phu hop yeu cau - Khong Duyet");
    }
  }
}
