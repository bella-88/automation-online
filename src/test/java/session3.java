import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

import org.w3c.dom.Document;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;


public class session3 {

  public static String readFile(String fileName) throws IOException {
    String content = new String((Files.readAllBytes(Paths.get(fileName))));
    return content;
  }

  public static List<String> readFileByLine(String fileName) throws IOException {
    List<String> lines = Files.readAllLines(Paths.get(fileName));
    return lines;
  }

  public static void writeToFile(String fileName, String content) throws IOException {
    Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
  }


  @Test
  public void readFile() {
      try {
      File file = new File( "C:/Users/Admin/Downloads/bai-tap-4.html" );
      FileInputStream fis = new FileInputStream( file.getAbsolutePath() );
      String data = IOUtils.toString(fis, StandardCharsets.UTF_8 );
      System.out.println("======Noi Dung File HTML==========");
      System.out.println(data);
         } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public void checkFile() throws ParserConfigurationException, IOException, SAXException {
    try {
      File file = new File("C:/Users/Admin/Downloads/bai-tap.xml");
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document doc = builder.parse(file);
      doc.getDocumentElement().normalize();
      System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
      NodeList nodeList = doc.getElementsByTagName("firstname");
      for (int itr = 0; itr < nodeList.getLength(); itr++) {
        Node node = nodeList.item(itr);
        System.out.println("\nNode Name :" + node.getNodeName());
        if (node.getNodeType() == Node.ELEMENT_NODE) {
          Element eElement = (Element) node;
          System.out.println("Student id: " + eElement.getElementsByTagName("id").item(0).getTextContent());
          System.out.println("First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
          System.out.println("Last Name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
          System.out.println("Subject: " + eElement.getElementsByTagName("subject").item(0).getTextContent());
          System.out.println("Marks: " + eElement.getElementsByTagName("marks").item(0).getTextContent());
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void printDateWeekOfYear() {
    LocalDate localDate = LocalDate.of(2022, 4, 20);
    int dayOfWeek = localDate.get(WeekFields.of(Locale.getDefault()).dayOfWeek());
    int weekOfYear = localDate.get(WeekFields.of(Locale.getDefault()).weekOfYear());
    switch (dayOfWeek) {
      case 1:
        System.out.println("Chu Nhat");
        break;
      case 2:
        System.out.println("Thu 2");
        break;
      case 3:
        System.out.println("Thu 3");
        break;
      case 4:
        System.out.println("Thu 4");
        break;
      case 5:
        System.out.println("Thu 5");
        break;
      case 6:
        System.out.println("Thu 6");
        break;
      case 7:
        System.out.println("Thu 7");
        break;
      default:
        System.out.println("Ngay k hop le");
    }
    System.out.println("Day la tuan thu " + weekOfYear + " cua nam");
  }
}
