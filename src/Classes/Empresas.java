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
public class Empresas {
    
    public static void main(String[] args) {
        createEnterprise();
    }
    
    public static void createEnterprise(){
        Workbook book = new XSSFWorkbook();
        Sheet sheet = (Sheet) book.createSheet("Empresas");
        
        sheet.createRow(0);
        
        sheet.getRow(0).createCell(0).setCellValue("Razon Social");
        sheet.getRow(0).createCell(1).setCellValue("Usuario");
        sheet.getRow(0).createCell(2).setCellValue("NIT");
        sheet.getRow(0).createCell(3).setCellValue("Contraseña");
        sheet.getRow(0).createCell(4).setCellValue("E-Mail");
        sheet.getRow(0).createCell(5).setCellValue("Id");

        try {
            FileOutputStream fileout = new FileOutputStream("Enterprises.xlsx");
            book.write(fileout);
            fileout.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void addEnterprise(String nombre, String usuario, String nit, String password, String mail) throws IOException{
        String ruta = "Enterprises.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum()+1;
        
        for (int i = 1; i <= nFilas; i++) {
            if (sheet.getRow(i) == null) {
                sheet.createRow(i);
                sheet.getRow(i).createCell(0).setCellValue(nombre);
                sheet.getRow(i).createCell(1).setCellValue(usuario);
                sheet.getRow(i).createCell(2).setCellValue(nit);
                sheet.getRow(i).createCell(3).setCellValue(password);
                sheet.getRow(i).createCell(4).setCellValue(mail);
                sheet.getRow(i).createCell(5).setCellValue(i);
                break;
            }
            
            if (i == nFilas) {
                sheet.createRow(i);
                sheet.getRow(nFilas).createCell(0).setCellValue(nombre);
                sheet.getRow(nFilas).createCell(1).setCellValue(usuario);
                sheet.getRow(nFilas).createCell(2).setCellValue(nit);
                sheet.getRow(nFilas).createCell(3).setCellValue(password);
                sheet.getRow(nFilas).createCell(4).setCellValue(mail);
                sheet.getRow(nFilas).createCell(5).setCellValue(i);
            }
        }
        
        
        FileOutputStream output = new FileOutputStream(ruta);
        wb.write(output);
        output.close();
    }
    
    public static void EditEnterprise(String nombre, String user, String nit, String password, String mail, int id) throws IOException{
        String ruta = "Enterprises.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum();
        
        for (int i = 1; i <=nFilas; i++) {
            Row fila = sheet.getRow(i);
            
            if (fila != null) {
                if(id==(int)fila.getCell(5).getNumericCellValue()){

                    fila.getCell(0).setCellValue(nombre);
                    fila.getCell(1).setCellValue(user);
                    fila.getCell(2).setCellValue(nit);
                    fila.getCell(3).setCellValue(password);
                    fila.getCell(4).setCellValue(mail);
                    break;
                }
            }    
        }
        
        FileOutputStream output = new FileOutputStream(ruta);
        wb.write(output);
        output.close();
    }
    
    public static String getId(String user, String pass) throws IOException{
        String confirmUser = "";
        String confirmPass = "";
        String ruta = "Enterprises.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum();
        for (int i = 1; i <= nFilas; i++) {
            
            if (sheet.getRow(i)!=null) {
                
                switch (sheet.getRow(i).getCell(1).getCellTypeEnum().toString()){
                    case "NUMERIC":
                        confirmUser = String.valueOf( (int) sheet.getRow(i).getCell(1).getNumericCellValue());
                        break;
                    
                    case "STRING":
                        confirmUser = sheet.getRow(i).getCell(1).getStringCellValue();
                        break;
                }
                
                switch (sheet.getRow(i).getCell(2).getCellTypeEnum().toString()){
                    case "NUMERIC":
                        confirmPass = String.valueOf((int) sheet.getRow(i).getCell(3).getNumericCellValue());
                        break;
                    
                    case "STRING":
                        confirmPass = sheet.getRow(i).getCell(3).getStringCellValue();
                        break;
                }
                
                if(user.equals(confirmUser) && pass.equals(confirmPass)){
                    String id = String.valueOf(sheet.getRow(i).getCell(5).getNumericCellValue());;
                    return id;
                }
            }
            
        }
        return "No existente";
    }
    
    public static boolean enterpriseExist(String user) throws IOException{
        String ruta = "Enterprises.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFila = sheet.getLastRowNum();
        for (int i = 1; i <= nFila; i++) {
            if (sheet.getRow(i)!=null) {

                String userExist = sheet.getRow(i).getCell(1).getStringCellValue();

                if(user.equals(userExist)){
                    return false;
                }
            }    
        }
        return true;
    }
    
    public static String[] ReadEnterprise(int i){
        String almacen[] = new String[2];
        String ruta = "Enterprises.xlsx";
        int acum=0;
        try {
            FileInputStream file = new FileInputStream(new File(ruta));
            
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            for(int j=0; j<almacen.length+1; j++){
                
                if (sheet.getRow(i)!=null) {
                    
                    if(j==0||j==2){
                        Cell celda = sheet.getRow(i).getCell(j);
                        
                        switch (celda.getCellTypeEnum().toString()){
                            case "NUMERIC":
                                almacen[acum]=String.valueOf((int)celda.getNumericCellValue());
                                break;
                            
                            case "STRING":
                                almacen[acum]=celda.getStringCellValue();
                                break;
                        }
                        acum++;
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
    
    public static String[] ObtenerDato(int id){
         String ruta = "Enterprises.xlsx";
         String[] datos = new String[5];
        
        try {
            FileInputStream file = new FileInputStream(new File(ruta));
            
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
           
            for(int i=1; i<=sheet.getLastRowNum();i++){
                if(sheet.getRow(i) != null){
              
                    if(id == (int)sheet.getRow(i).getCell(5).getNumericCellValue()){

                        for(int j=0; j<datos.length; j++){
                            
                            switch (sheet.getRow(i).getCell(j).getCellTypeEnum().toString()){
                                case "NUMERIC":
                                    datos[j]=String.valueOf(sheet.getRow(i).getCell(j).getNumericCellValue());
                                    break;

                                case "STRING":
                                    datos[j]=sheet.getRow(i).getCell(j).getStringCellValue();
                                    break;
                            }        
                        }
                        break;
                    }
                }    
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return datos;
    }
    
    public static int nFilas() throws IOException {
        String ruta = "Enterprises.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum();
        return nFilas;
    }
    
    public static int filaSeleccionada(String nombre, String nit) throws IOException{
        int filaExcel = 0;
        String ruta = "Enterprises.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFila = sheet.getLastRowNum();
        
        for (int i = 1; i <= nFila; i++) {
            if (sheet.getRow(i) != null) {
                if(nombre.equals(sheet.getRow(i).getCell(0).getStringCellValue()) && nit.equals(sheet.getRow(i).getCell(2).getStringCellValue())){
                    filaExcel = i;
                }
            }
                
        }
        return filaExcel;
    }
    
    public static String[] extraerTodosLosDatos(int i){
        String almacen[] = new String[6];
        String ruta = "Enterprises.xlsx";
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
    
        public static void DeleteUser(int fila){
        String ruta = "Enterprises.xlsx";
        
        try {
            FileInputStream file = new FileInputStream(new File(ruta));
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            
            sheet.removeRow(sheet.getRow(fila));
            
            FileOutputStream fileout = new FileOutputStream("Enterprises.xlsx");
            wb.write(fileout);
            fileout.close();    
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
