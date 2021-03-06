package model;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by Calin on 23.04.2017.
 */
public class ReportPDF implements Report {
    private static final String FILE_NAME = "report.pdf";
    public void generate(ArrayList<String> titles) {
        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

            //open
            document.open();

            Paragraph p = new Paragraph();
            p.add("BOOKS OUT OF STOCK");
            p.setAlignment(Element.ALIGN_CENTER);

            document.add(p);
            for (int i=0;i<titles.size();i++) {
                Paragraph p2 = new Paragraph();
                p2.add(titles.get(i)); //no alignment
                document.add(p2);
            }
            document.close();
            System.out.println("Done");

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
