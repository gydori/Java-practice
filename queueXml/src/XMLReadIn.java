import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class XMLReadIn {
    public static void main(String[] args) {
        try {
            DocumentBuilder docBuilder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();
            InputSource in = new InputSource(new FileInputStream("prac.xml"));
            Document doc = docBuilder.parse(in);
            Element student = doc.getDocumentElement();
            NodeList personNodeList = student.getElementsByTagName("student");
            List<Element> personList = new ArrayList<Element>();
            for (int i = 0; i < personNodeList.getLength(); ++i) {
                personList.add((Element) personNodeList.item(i));
            }
            var x = personList.stream()
                    .map(e -> {
                        return new Student(
                                e.getElementsByTagName("firstname").item(0).getTextContent(),
                                e.getElementsByTagName("lastname").item(0).getTextContent(),
                                e.getElementsByTagName("nickname").item(0).getTextContent(),
                                Integer.parseInt(e.getElementsByTagName("marks").item(0).getTextContent())
                        );
                    });

            x.forEach(o -> System.out.println(o));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
