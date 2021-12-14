package XML_pgms;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Write_dataXml {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		// TODO Auto-generated method stub

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;

		dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.newDocument();
		
		//elements to Document
		Element rootElement = doc.createElement("Collegues");
		
		//append root element to document
		doc.appendChild(rootElement);
        
		//append child element
		rootElement.appendChild(createUserElement(doc, "4612", "sarvesh", "1999"));

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		
		//To print in proper format
	    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		DOMSource source = new DOMSource(doc);

		// write to file
		StreamResult console = new StreamResult(System.out);
		StreamResult file = new StreamResult(new File(".\\src\\test\\java\\XML_pgms\\write_XML.xml"));

		// write data
	    transformer.transform(source, console);
		transformer.transform(source, file);

	}

	private static Node createUserElement(Document doc, String id, String Name, String year) {
		// TODO Auto-generated method stub
		Element user = doc.createElement("collegue");

		// set id attribute
		user.setAttribute("QTid", id);
        
		//create firstname element
		user.appendChild(createUserElements(doc, user, "CollegueName", Name));

		// create lastName element
		user.appendChild(createUserElements(doc, user, "BirthYear", year));

		return user;
	}

	private static Node createUserElements(Document doc, Element user, String name, String value) {

		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));
		return node;
	}

}
