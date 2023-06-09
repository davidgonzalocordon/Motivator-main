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
import java.nio.file.Files;
import java.nio.file.Path;
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
        
        for (int i = 1; i <= nFilas; i++) {
            if (sheet.getRow(i) == null) {
                sheet.createRow(i);
                sheet.getRow(i).createCell(0).setCellValue(nombre);
                sheet.getRow(i).createCell(1).setCellValue(localizacion);
                sheet.getRow(i).createCell(2).setCellValue(tipo);
                sheet.getRow(i).createCell(3).setCellValue(horario);
                sheet.getRow(i).createCell(4).setCellValue(puntuacion);
                sheet.getRow(i).createCell(5).setCellValue(mapa);
                sheet.getRow(i).createCell(6).setCellValue(telefono);
                sheet.getRow(i).createCell(7).setCellValue(descripcion);
                break;
            }
            
            if(i == nFilas){ 
                sheet.createRow(i);
                sheet.getRow(i).createCell(0).setCellValue(nombre);
                sheet.getRow(i).createCell(1).setCellValue(localizacion);
                sheet.getRow(i).createCell(2).setCellValue(tipo);
                sheet.getRow(i).createCell(3).setCellValue(horario);
                sheet.getRow(i).createCell(4).setCellValue(puntuacion);
                sheet.getRow(i).createCell(5).setCellValue(mapa);
                sheet.getRow(i).createCell(6).setCellValue(telefono);
                sheet.getRow(i).createCell(7).setCellValue(descripcion);
            }
        }
        
        File folder = new File("Img\\"+nombre);
        folder.mkdir();
        File img = new File("src\\IMG\\noimagen.jpg");
        Path rutaOrigen = Path.of(img.getAbsolutePath());
        Path rutaDestino = Path.of(folder.getAbsolutePath()+"\\noimagen.jpg");
        byte[] imageBytes = Files.readAllBytes(rutaOrigen);
        Files.write(rutaDestino,imageBytes);
        
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
            if( fila != null){
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
        }
        
        FileOutputStream output = new FileOutputStream(ruta);
        wb.write(output);
        output.close();
    }
    
    public static int countImg(String nombre){
        File carpeta = new File("Img\\"+nombre); 
        File[] lista = carpeta.listFiles();
        return lista.length-1;
    }
    
    public static void link(String link) throws IOException, URISyntaxException{

        Desktop enlace = Desktop.getDesktop();
        enlace.browse(new URI(link));
        
    }
    
    public static boolean linkExist(String link) throws IOException{
        String ruta = "Sites.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFila = sheet.getLastRowNum();
        
        for (int i = 1; i <= nFila; i++) {
            if (sheet.getRow(i) != null) {
                String linkExist = sheet.getRow(i).getCell(5).getStringCellValue();
            
                if(link.equals(linkExist)){
                    return false;
                }
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
                    
                    if (sheet.getRow(i) != null) {
                        Cell celda = sheet.getRow(i).getCell(j);
                    
                        switch (celda.getCellTypeEnum().toString()){
                            case "NUMERIC":
                                almacen[j]=String.valueOf((float)celda.getNumericCellValue());
                                break;

                            case "STRING":
                                almacen[j]=celda.getStringCellValue();
                                break;
                        }
                        
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
    
    public static int filaSeleccionada(String nombre, String direccion, String tipo) throws IOException{
        int filaExcel = 0;
        String ruta = "Sites.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFila = sheet.getLastRowNum();
        
        for (int i = 1; i <= nFila; i++) {
            if (sheet.getRow(i) != null) {
                if(nombre.equals(sheet.getRow(i).getCell(0).getStringCellValue()) && direccion.equals(sheet.getRow(i).getCell(1).getStringCellValue()) && tipo.equals(sheet.getRow(i).getCell(2).getStringCellValue())){
                    filaExcel = i;
                }
            }    
        }
        return filaExcel;
    }
    
    public static String[] obtenerSite(int i){
        String almacen[] = new String[8];
        String ruta = "Sites.xlsx";
        
        try {
            FileInputStream file = new FileInputStream(new File(ruta));
            
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
             
                
                for(int j=0; j<almacen.length; j++){
                    Cell celda = sheet.getRow(i).getCell(j);
                    
                    switch (celda.getCellTypeEnum().toString()){
                        case "NUMERIC":
                            almacen[j]=String.valueOf((float)celda.getNumericCellValue());
                            
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
    
    public static void deleteSite(int fila){
        String ruta = "Sites.xlsx";
        
        try {
            FileInputStream file = new FileInputStream(new File(ruta));
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            
            File comentarios = new File("Comments\\Comentarios-" + sheet.getRow(fila).getCell(0).getStringCellValue() +".xlsx");
            comentarios.delete();
            
            File img = new File("IMG\\" + sheet.getRow(fila).getCell(0).getStringCellValue());
            File[] lista = img.listFiles();
            
            for (int i = 0; i < lista.length; i++) {
                lista[i].delete();
            }
            
            img.delete();
            
            sheet.removeRow(sheet.getRow(fila));
            
            FileOutputStream fileout = new FileOutputStream("Sites.xlsx");
            wb.write(fileout);
            fileout.close();    
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
