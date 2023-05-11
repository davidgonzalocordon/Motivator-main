/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author sebas
 */
public class PlanesTuristicos {
    
        public static void createPlan(String nombre){
        Workbook book = new XSSFWorkbook();
        Sheet sheet = (Sheet) book.createSheet("Planes");
        
        sheet.createRow(0);
        
        sheet.getRow(0).createCell(0).setCellValue("Nombre");
        sheet.getRow(0).createCell(1).setCellValue("Descripcion");
        sheet.getRow(0).createCell(2).setCellValue("Precio");
        sheet.getRow(0).createCell(3).setCellValue("ID");

        try {
            FileOutputStream fileout = new FileOutputStream("Plans\\Planes-"+nombre+".xlsx");
            book.write(fileout);
            fileout.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public static void addPlan(String nombre, String name, String descripcion, String precio) throws IOException{
        String ruta = "Plans\\Planes-"+nombre+".xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum()+1;
        
        for (int i = 1; i <= nFilas; i++) {
            if (sheet.getRow(i) == null) {
                sheet.createRow(i);
                sheet.getRow(i).createCell(0).setCellValue(name);
                sheet.getRow(i).createCell(1).setCellValue(descripcion);
                sheet.getRow(i).createCell(2).setCellValue(precio);
                sheet.getRow(i).createCell(3).setCellValue(i);
                break;
            }
            
            if (i == nFilas) {
                sheet.createRow(i);
                sheet.getRow(nFilas).createCell(0).setCellValue(name);
                sheet.getRow(nFilas).createCell(1).setCellValue(descripcion);
                sheet.getRow(nFilas).createCell(2).setCellValue(precio);
                sheet.getRow(nFilas).createCell(3).setCellValue(i);
            }
        }
        

        
        FileOutputStream output = new FileOutputStream(ruta);
        wb.write(output);
        output.close();
    }
    
    public static String[] readPlan(int i, String name){
        String almacen[] = new String[3];
        String ruta = "Plans\\Planes-"+name+".xlsx";
        
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
        String ruta = "Plans\\Planes-"+name+".xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum();
       
        return nFilas;
    }
    
}
