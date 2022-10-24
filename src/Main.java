import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException {
        BookMetadataExporter exporter = new XMLBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.export(System.out);

        BookMetadataExporter exporter1 = new JSONBookMetadataExporter();
        exporter1.add(TestData.sailboatBook);
        exporter1.add(TestData.GoFBook);
        exporter1.export(System.out);

        BookMetadataExporter exporter2 = new CSVBookMetadataExporter();
        exporter2.add(TestData.sailboatBook);
        exporter2.add(TestData.GoFBook);
        exporter2.export(System.out);
    }
}
