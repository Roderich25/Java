import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.text.*;
import org.apache.pdfbox.contentstream.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.*;
import org.apache.fontbox.type1.DamagedFontException;

public class PdfReader {
     public static void main (String[ ] args ) throws FileNotFoundException, IOException {

     
         PDFTextStripper mypdf = new PDFTextStripper();
         mypdf.setPageStart("1");
         mypdf.setPageEnd("5");
         
         PDDocument mydoc = PDDocument.load( new File("c:\\opt\\MLE.pdf") );
         mydoc.getClass();
         
         if(!mydoc.isEncrypted()){
             String fileText = mypdf.getText(mydoc);
             String[] lines=fileText.split("\\r\\n\\r\\n");
             for(String line:lines){
                 System.out.println(line.trim());
                 
             }
             
             
         }
         mydoc.close();
         
     } 
 }
