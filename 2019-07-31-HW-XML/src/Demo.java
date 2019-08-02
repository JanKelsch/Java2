import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		File file = new File("persons.xml");
		getListOfPersons(file);
	}
	
	public static void getListOfPersons(File file) throws Exception, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(file);
		document.getDocumentElement().normalize();

		Element root = document.getDocumentElement();
		System.out.println('\t' + root.getNodeName());
		NodeList nList = document.getElementsByTagName("person");

		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node node = nList.item(temp);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				System.out.println("Name: " + eElement.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("Gender: " + eElement.getElementsByTagName("gender").item(0).getTextContent());
				System.out.println("Address: " + eElement.getElementsByTagName("address").item(0).getTextContent());
			}
		}
	}
}
