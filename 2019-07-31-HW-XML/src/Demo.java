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
        List<Person> persons = new ArrayList<>();
        NodeList personNodes = doc.getElementsByTagName("person");
        for (int i = 0; i < personNodes.getLength(); i++) {
            Node personNode = personNodes.item(i);
            if (personNode.getNodeType() == Node.ELEMENT_NODE) {
                Element personElement = (Element) personNode;
                String name = personElement.getElementsByTagName("name").item(0).getTextContent();
                String gender = personElement.getElementsByTagName("gender").item(0).getTextContent();
                String street = personElement.getElementsByTagName("street").item(0).getTextContent();
                int houseNumber = Integer.parseInt(personElement.getElementsByTagName("house_number").item(0).getTextContent());
                Address address = new Address(street, houseNumber);
                Person person = new Person(name, gender, address);
                persons.add(person);
            }
        }
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}