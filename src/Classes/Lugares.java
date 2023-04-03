/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Classes;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
public class Lugares {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        
        
        
    }
    
    public static void createSite(){
        Workbook book = new XSSFWorkbook();
        Sheet sheet = (Sheet) book.createSheet("Ubicacion");

        Row menu = sheet.createRow(0);
        menu.createCell(0).setCellValue("Nombre");
        menu.createCell(1).setCellValue("Localizacion");
        menu.createCell(2).setCellValue("Tipo");
        menu.createCell(3).setCellValue("Horarios");
        menu.createCell(4).setCellValue("Puntuacion Media");
        menu.createCell(5).setCellValue("Mapa");
        menu.createCell(6).setCellValue("Telefono");
        menu.createCell(7).setCellValue("Descripcion");

        try {
            FileOutputStream fileout = new FileOutputStream("Sites.xlsx");
            book.write(fileout);
            fileout.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void addSite(String nombre, String localizacion, String tipo, String horario, double puntuacion, String mapa, String telefono, String descripcion) throws IOException{
        String ruta = "Sites.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum()+1;
        Row fila = sheet.createRow(nFilas);
        
        fila.createCell(0).setCellValue(nombre);
        fila.createCell(1).setCellValue(localizacion);
        fila.createCell(2).setCellValue(tipo);
        fila.createCell(3).setCellValue(horario);
        fila.createCell(4).setCellValue(puntuacion);
        fila.createCell(5).setCellValue(mapa);
        fila.createCell(6).setCellValue(telefono);
        fila.createCell(7).setCellValue(descripcion);
        
        File folder = new File("Img\\"+nombre);
        folder.mkdir();
        
        Comentarios.createComments(nombre);
        
        FileOutputStream output = new FileOutputStream(ruta);
        wb.write(output);
        output.close();
    }
    
    public static void editSite(String nombre, String newName, String localizacion, String tipo, String horario, double puntuacion, String mapa, String telefono, String descripcion) throws IOException{
        String ruta = "Sites.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum();
        
        for (int i = 1; i < nFilas; i++) {
            Row fila = sheet.getRow(i);
            
            if(fila.getCell(0).getStringCellValue().equals(nombre)){
                
                fila.getCell(0).setCellValue(newName);
                fila.getCell(1).setCellValue(localizacion);
                fila.getCell(2).setCellValue(tipo);
                fila.getCell(3).setCellValue(horario);
                fila.getCell(4).setCellValue(puntuacion);
                fila.getCell(5).setCellValue(mapa);
                fila.getCell(6).setCellValue(telefono);
                fila.getCell(7).setCellValue(descripcion);
                break;
            }
        }
        
        FileOutputStream output = new FileOutputStream(ruta);
        wb.write(output);
        output.close();
    }
    
    public static int countImg(String nombre){
        File carpeta = new File("Img\\"+nombre); 
        File[] lista = carpeta.listFiles();
        return lista.length;
    }
    
    public static void link(String nombre) throws IOException, URISyntaxException{
    
        boolean ok = false;
        
        String ruta = "Sites.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        Desktop enlace = Desktop.getDesktop();
        int nFilas = sheet.getLastRowNum();
        
        for (int i = 1; i < nFilas; i++) {
            Row fila = sheet.getRow(i);
            Cell celda = fila.getCell(0);
            
            if(celda.getStringCellValue().equals(nombre)){
                Cell celdaLink = fila.getCell(5);
                enlace.browse(new URI(celdaLink.getStringCellValue()));
                ok = true;
                break;
            }
        }
            
        if (!ok){
            System.out.println("Sitio no encontrado");
        }
    }
    
    public static boolean linkExist(String link) throws IOException{
        String ruta = "Sites.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFila = sheet.getLastRowNum();
        
        for (int i = 1; i <= nFila; i++) {
            String linkExist = sheet.getRow(i).getCell(5).getStringCellValue();
            
            if(link.equals(linkExist)){
                return false;
            }
        }
        return true;
    }

    
    public static String[] ReadSite(int i){
        String almacen[] = new String[5];
        String ruta = "Sites.xlsx";
        
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
    
    public static int nfilas() throws IOException{
        String ruta = "Sites.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum();
       
    return nFilas;
    }
    
}
