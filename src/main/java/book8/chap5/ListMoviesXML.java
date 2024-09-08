package book8.chap5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.text.NumberFormat;

/**
 * @author thamsanqa 2024
 **/
public class ListMoviesXML {

    private static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        Document doc = getDocument("C:\\Users\\user1\\Documents\\CodeCollegeZA\\BootCamp_2023\\Java_All_In_One\\cousrework\\src\\main.java.book8\\chap5\\movies.xml");
        if (doc != null) {
            Element root = doc.getDocumentElement();
            NodeList movieNodes = root.getElementsByTagName("Movie");
            for (int i = 0; i < movieNodes.getLength(); i++) {
                Element movieElement = (Element) movieNodes.item(i);
                Movie m = getMovie(movieElement);
                String msg = Integer.toString(m.year);
                msg += ": " + m.title;
                msg += " (" + cf.format(m.price) + ")";
                System.out.println(msg);
            }
        }
    }

    private static Document getDocument(String name) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            factory.setValidating(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(new InputSource(name));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static Movie getMovie(Element e) {
        // get the year attribute
        String yearString = e.getAttribute("year");
        int year = Integer.parseInt(yearString);
        // get the Title element
        String title = getTextValue(e, "Title");
        // get the Price element
        String pString = getTextValue(e, "Price");
        double price = Double.parseDouble(pString);
        return new Movie(title, year, price);
    }

    private static String getTextValue(Element parent, String tagName) {
        NodeList nodeList = parent.getElementsByTagName(tagName);
        if (nodeList != null && nodeList.getLength() > 0) {
            Node node = nodeList.item(0);
            if (node != null) {
                return node.getTextContent();
            }
        }
        return "";
    }

    private static class Movie {
        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}
