import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Demo {
    public static void main(String[] args) throws Exception {

        File file = new File("persons.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);

        readDataXML(doc);
    }

    private static void readDataXML(Document doc) {
        NodeList personNodes = doc.getElementsByTagName("person");
        for (int i = 0; i < personNodes.getLength(); i++) {
            Node personNode = personNodes.item(i);
            if (personNode.getNodeType() == Node.ELEMENT_NODE) {
                Element personElement = (Element) personNode;
                String personName = personElement.getElementsByTagName("name").item(0).getTextContent();
                String personGender = personElement.getElementsByTagName("gender").item(0).getTextContent();
                String personAddress = personElement.getElementsByTagName("address").item(0).getTextContent();

                System.out.println("Name = " + personName);
                System.out.println("Gender = " + personGender);
                System.out.println("Address = " + personAddress);
            }
        }
    }
}