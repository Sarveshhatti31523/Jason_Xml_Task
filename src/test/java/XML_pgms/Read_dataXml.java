package XML_pgms;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Read_dataXml {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//Fetching document
		Document doc = builder.parse(new File(".\\src\\test\\java\\XML_pgms\\XML_task.xml"));
		
		
		NodeList collegue_list = doc.getElementsByTagName("collegue");
		for (int i = 0; i < collegue_list.getLength(); i++) {

			Node collegue = collegue_list.item(i);
			Element collegue_Element = (Element) collegue;
			System.out.println("Collegue name=" + collegue_Element.getAttribute("name"));
			
			//getting childnodes from the parent node
			NodeList Collegue_details = collegue.getChildNodes();

			for (int j = 0; j < Collegue_details.getLength(); j++) {
				
				Node details = Collegue_details.item(j);
				if (details.getNodeType() == Node.ELEMENT_NODE) {
					Element details_Element = (Element) details;
					System.out.println(" " + details_Element.getTagName() + ":- " + details_Element.getAttribute("value"));

				}
			}
			System.out.println();
		}

	}

}
