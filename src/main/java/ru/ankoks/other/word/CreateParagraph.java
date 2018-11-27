package ru.ankoks.other.word;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import ru.ankoks.other.parse.Parser;

import java.io.*;
import java.util.List;

/**
 * User: ankoks
 * Date: 23.11.2018
 */
public class CreateParagraph {
    public static void main(String[] args) throws IOException {
//        saveWord(readWord());
        readDocFile2();
//        convertToPdf();
    }

    private static void convertToPdf() throws IOException {
        String inputFile = "output.docx";
        String outputFile = "output.pdf";
        System.out.println("inputFile:" + inputFile + ",outputFile:" + outputFile);
        FileInputStream in = new FileInputStream(inputFile);
        XWPFDocument document = new XWPFDocument(in);
        File outFile = new File(outputFile);
        OutputStream out = new FileOutputStream(outFile);
//        PdfOptions options = null;
//        PdfConverter.getInstance().convert(document, out, options);
    }

    private static void readDocFile2() {
        String templateName = "templates/KP_type_1.docx";
        InputStream resourceAsStream = Parser.class.getClassLoader().getResourceAsStream(templateName);

        try {
            XWPFDocument document = new XWPFDocument(resourceAsStream);

            List<XWPFParagraph> paragraphs = document.getParagraphs();

            System.out.println("Total of paragraph " + paragraphs.size());
            String[] searchList = {
                    "[Name]",
                    "[PartnerPositionSign]"};
            String[] replacementList = {
                    "123",
                    "321"};

            for (XWPFParagraph p : paragraphs) {
//                System.out.println(p.getText());

//                System.out.println(StringUtils.replaceEach(p.getText(), searchList, replacementList));

                List<XWPFRun> runs = p.getRuns();
                if (runs != null) {
                    for (XWPFRun r : runs) {
                        String text = r.getText(0);
//                        r.setText(StringUtils.replaceEach(text, searchList, replacementList), 0);
//                        if (text != null && text.contains("needle")) {
//                            text = text.replace("needle", "haystack");
//                        }
                    }
                }
            }
            document.write(new FileOutputStream("output.docx"));
            resourceAsStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void readDocFile(String fileName) {

        try {
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());

            XWPFDocument document = new XWPFDocument(fis);

            List<XWPFParagraph> paragraphs = document.getParagraphs();

            System.out.println("Total of paragraph " + paragraphs.size());
            for (XWPFParagraph para : paragraphs) {
                System.out.println(para.getText());
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void createWord() throws IOException {
        //Blank Document
        XWPFDocument document = new XWPFDocument();

        //Write the Document in file system
        FileOutputStream out = new FileOutputStream(new File("createparagraph.docx"));

        //create Paragraph
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText("At tutorialspoint.com, we strive hard to " +
                "provide quality tutorials for self-learning " +
                "purpose in the domains of Academics, Information " +
                "Technology, Management and Computer Programming Languages.");

        document.write(out);
        out.close();
        System.out.println("createparagraph.docx written successfully");
    }

    private static void saveWord(String wordText) throws IOException {
        //Blank Document
        XWPFDocument document = new XWPFDocument();

        //Write the Document in file system
        FileOutputStream out = new FileOutputStream(new File("result.docx"));

        //create Paragraph
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();

        String replace = wordText.replace("[var]", String.valueOf(123));

        run.setText(replace);

        document.write(out);
        out.close();
        System.out.println("result.docx written successfully");
    }

    private static String readWord() {
        try {
            FileInputStream fis = new FileInputStream("example.docx");
            XWPFDocument xdoc = new XWPFDocument(OPCPackage.open(fis));
            XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
            System.out.println(extractor.getText());

            String replace = extractor.getText().replace("[var]", String.valueOf(123));

            System.out.println(replace);

            return extractor.getText();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
