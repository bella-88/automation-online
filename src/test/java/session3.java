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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class session3 {
  WebDriver driver;

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
}
