import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class PDFMainApp {

    public static void main(String[] args) {

        Document document = new Document();
        //ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            //PdfWriter.getInstance(document, byteArrayOutputStream);
            File file = new File("data.pdf");
            PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open();

            BaseFont bf = BaseFont.createFont(
                    "Zar/XB Zar.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(bf, 8);
            PdfPTable table1 = new PdfPTable(2);
            PdfPCell cell = new PdfPCell(new Phrase("نرخ ", font));
            PdfPCell cell1 = new PdfPCell(new Phrase(ResourceBundleFa.showErrorMessage("compound"), font));
            cell.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
            cell1.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);

            table1.addCell(cell);
            table1.addCell(cell1);
            document.add(table1);

            document.close();
        } catch (Exception e) {
            System.out.println("exception occurred :|");
        }
    }

}
