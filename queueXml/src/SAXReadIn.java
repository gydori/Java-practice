import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class SAXReadIn {
    private static final class PeopleHandler extends DefaultHandler {
        final List<Student> people = new ArrayList<>();
        boolean startFirstName = false;
        boolean startLastName = false;
        boolean startNickName = false;
        boolean startMarks = false;
        String firstN;
        String lastN;
        String nickN;
        String marks;

        public static void main(String[] args) {
            try {
                SAXParser parser = SAXParserFactory.newDefaultInstance().newSAXParser();
                InputSource in = new InputSource(new FileInputStream("prac.xml"));
                var handler = new PeopleHandler();
                parser.parse(in, handler);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("firstname")) {
                startFirstName = true;
            }
            if (qName.equals("lastname")) {
                startLastName = true;
            }
            if (qName.equals("nickname")) {
                startNickName = true;
            }
            if (qName.equals("marks")) {
                startMarks = true;
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if (startFirstName) {
                firstN = new String(ch, start, length);
                startFirstName = true;
            }
            if (startLastName) {
                lastN = new String()
            }
        }
    }
}
