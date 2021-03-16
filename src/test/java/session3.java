import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
    File file = new File("C:/Users/Admin/Downloads/bai-tap-4.html");
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document doc = builder.parse(file);
    doc.getDocumentElement().normalize();
    System.out.println("Root element: "+doc.getDocumentElement().getNodeName());
    NodeList nodeList = doc.getElementsByTagName("");

  }
}