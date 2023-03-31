/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motiviator;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Julian
 */
public class Comentarios {

    /**
     * @param args the command line arguments
     */
    
    public static void createComments(String nombre) throws IOException{
        
        String ruta = "Sites.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheetUbi = wb.getSheetAt(0);
        
        Workbook book = new XSSFWorkbook();
        Sheet sheet = (Sheet) book.createSheet("Comentarios");

        Row menu = sheet.createRow(0);
        menu.createCell(0).setCellValue("Autor");
        menu.createCell(1).setCellValue("Comentario");
        menu.createCell(2).setCellValue("Puntuacion");
        menu.createCell(3).setCellValue("Fecha");
        

        try {
            FileOutputStream fileout = new FileOutputStream("Comments\\Comentarios-" + nombre + ".xlsx");
            book.write(fileout);
            fileout.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Comentarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Comentarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void addComment(String nombre, String autor, String comentario, int puntuacion) throws IOException{
        String ruta = "Comments\\Comentarios-"+ nombre + ".xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        Date fecha = new Date();
        String fechas = fecha.getDate()+ "/" + (fecha.getMonth()+1)+ "/" + (fecha.getYear()+1900);
        
        int nFilas = sheet.getLastRowNum()+1;
        Row fila = sheet.createRow(nFilas);
        
        fila.createCell(0).setCellValue(autor);
        fila.createCell(1).setCellValue(comentario);
        fila.createCell(2).setCellValue(puntuacion);
        fila.createCell(3).setCellValue(fechas);
        
        FileOutputStream output = new FileOutputStream(ruta);
        wb.write(output);
        output.close();
    }
}
