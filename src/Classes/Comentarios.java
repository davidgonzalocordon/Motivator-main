/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActual = dateFormat.format(calendar.getTime());
        
        int nFilas = sheet.getLastRowNum()+1;
        Row fila = sheet.createRow(nFilas);
        
        fila.createCell(0).setCellValue(autor);
        fila.createCell(1).setCellValue(comentario);
        fila.createCell(2).setCellValue(puntuacion);
        fila.createCell(3).setCellValue(fechaActual);
        
        FileOutputStream output = new FileOutputStream(ruta);
        wb.write(output);
        output.close();
    }
    
    public static String[] readComment(int i, String name){
        String almacen[] = new String[4];
        String ruta = "Comments\\Comentarios-"+name+".xlsx";
        
        try {
            FileInputStream file = new FileInputStream(new File(ruta));
            
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
             
                
                for(int j=0; j<almacen.length; j++){
                    Cell celda = sheet.getRow(i).getCell(j);
                    
                    switch (celda.getCellTypeEnum().toString()){
                        case "NUMERIC":
                            
                            
                            almacen[j]=String.valueOf((int)celda.getNumericCellValue());
                            break;
                            
                        case "STRING":
                            almacen[j]=celda.getStringCellValue();
                            
                            break;
                        
                }
                
            }
              
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return almacen;
    }
    
    public static int nfilas(String name) throws IOException{
        String ruta = "Comments\\Comentarios-"+name+".xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum();
       
        return nFilas;
    }
    
    public static void puntuacion(String name) throws IOException{
        String ruta = "Comments\\Comentarios-"+name+".xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum();
        int suma=0;
        
        for(int i=1;i<=nFilas;i++){
            Cell celda = sheet.getRow(i).getCell(2);
            suma += celda.getNumericCellValue();
        }
        float puntuacion = (float) (Math.round(suma / (float) nFilas * 10.0) / 10.0);
        
        String ruta2 = "Sites.xlsx";
        FileInputStream file2 = new FileInputStream(new File(ruta2));
        XSSFWorkbook wb2 = new XSSFWorkbook(file2);
        XSSFSheet sheet2 = wb2.getSheetAt(0);
        
        int nFilas2 = sheet2.getLastRowNum();
        
        for(int i=1;i<=nFilas2;i++){
            Row fila2 = sheet2.getRow(i);
            if(fila2.getCell(0).getStringCellValue().equals(name)){
                fila2.getCell(4).setCellValue(puntuacion);
                break;
            }
        }
        
        FileOutputStream output = new FileOutputStream(ruta2);
        wb2.write(output);
        output.close();
    }
}
