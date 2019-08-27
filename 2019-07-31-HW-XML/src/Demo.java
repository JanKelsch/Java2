import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws Exception {

        File file = new File("persons.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);

        readDataXML(doc);
    }

    private static void readDataXML(Document doc) {
        List<String> persons = new ArrayList<>();
        NodeList personNodes = doc.getElementsByTagName("person");
        for (int i = 0; i < personNodes.getLength(); i++) {
            Node personNode = personNodes.item(i);
            if (personNode.getNodeType() == Node.ELEMENT_NODE) {
                Element personElement = (Element) personNode;
                String personName = personElement.getElementsByTagName("name").item(0).getTextContent();
                String personGender = personElement.getElementsByTagName("gender").item(0).getTextContent();
                String personAddress = personElement.getElementsByTagName("address").item(0).getTextContent();
                persons.add(personName);
                persons.add(personGender);
                persons.add(personAddress);
            }
        }
        for (String p : persons) {
            System.out.println(p);
        }
    }
}