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
public class Usuario {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createUsers();
    }
    
    public static void createUsers(){
        Workbook book = new XSSFWorkbook();
        Sheet sheet = (Sheet) book.createSheet("Usuarios");
        
        sheet.createRow(0);
        
        sheet.getRow(0).createCell(0).setCellValue("Nombre Completo");
        sheet.getRow(0).createCell(1).setCellValue("Usuario");
        sheet.getRow(0).createCell(2).setCellValue("Contraseña");
        sheet.getRow(0).createCell(3).setCellValue("E-Mail");
        sheet.getRow(0).createCell(4).setCellValue("Nivel");
        sheet.getRow(0).createCell(5).setCellValue("Id");

        try {
            FileOutputStream fileout = new FileOutputStream("Users.xlsx");
            book.write(fileout);
            fileout.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void addUser(String nombre, String usuario, String password, String mail) throws IOException{
        String ruta = "Users.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum()+1;
        sheet.createRow(nFilas);
        
        sheet.getRow(nFilas).createCell(0).setCellValue(nombre);
        sheet.getRow(nFilas).createCell(1).setCellValue(usuario);
        sheet.getRow(nFilas).createCell(2).setCellValue(password);
        sheet.getRow(nFilas).createCell(3).setCellValue(mail);
        sheet.getRow(nFilas).createCell(4).setCellValue(1);
        sheet.getRow(nFilas).createCell(5).setCellValue(nFilas);
        
        FileOutputStream output = new FileOutputStream(ruta);
        wb.write(output);
        output.close();
    }
    
    
    public static void EditUser(String nombre, String mail, String password, String user, int id, int lvl) throws IOException{
        String ruta = "Users.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum();
        
        for (int i = 1; i <=nFilas; i++) {
            Row fila = sheet.getRow(i);
            
            if(id==(int)fila.getCell(5).getNumericCellValue()){
                
                fila.getCell(0).setCellValue(nombre);
                fila.getCell(1).setCellValue(user);
                fila.getCell(2).setCellValue(password);
                fila.getCell(3).setCellValue(mail);
                fila.getCell(4).setCellValue(lvl);
                break;
            }
        }
        
        FileOutputStream output = new FileOutputStream(ruta);
        wb.write(output);
        output.close();
    }
    
    
    public static String getId(String user, String pass) throws IOException{
        String ruta = "Users.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum();
        for (int i = 1; i <= nFilas; i++) {
            String confirmUser = sheet.getRow(i).getCell(1).getStringCellValue();
            String confirmPass = sheet.getRow(i).getCell(2).getStringCellValue();
            
            if(user.equals(confirmUser) && pass.equals(confirmPass)){
                String id = String.valueOf(sheet.getRow(i).getCell(5).getNumericCellValue());;
                return id;
            }
        }
        return "No existente";
    }
    
    public static int getLevel(String id) throws IOException{
        
        String ruta = "Users.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum();
        
        for (int i = 1; i <= nFilas; i++) {
            String confirmId = String.valueOf(sheet.getRow(i).getCell(5).getNumericCellValue());
            
            if (id.equals(confirmId)){
               
                int level = (int) sheet.getRow(i).getCell(4).getNumericCellValue();
                return level;
            }
        }
        return 5;
    }

    public static boolean userExist(String user) throws IOException{
        String ruta = "Users.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFila = sheet.getLastRowNum();
        for (int i = 1; i <= nFila; i++) {
            String userExist = sheet.getRow(i).getCell(1).getStringCellValue();
            
            if(user.equals(userExist)){
                return false;
            }
        }
        return true;
    }
    
    
 public static String[] ReadUser(int i){
        String almacen[] = new String[4];
        String ruta = "Users.xlsx";
        int acum=0;
        try {
            FileInputStream file = new FileInputStream(new File(ruta));
            
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
             
                
                for(int j=0; j<almacen.length+1; j++){
                    
                    
                  if(j!=2){  
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
              
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return almacen;
    } 
             
        

    
        
    public static String[] ObtenerDato(int id){
         String ruta = "Users.xlsx";
         String[] datos = new String[4];
        
        try {
            FileInputStream file = new FileInputStream(new File(ruta));
            
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
           
            for(int i=1; i<=sheet.getLastRowNum();i++){
              
                if(id == (int)sheet.getRow(i).getCell(5).getNumericCellValue()){
                  
                    for(int j=0; j<datos.length; j++){
                        datos[j]=sheet.getRow(i).getCell(j).getStringCellValue();
                       
                    }
                    break;
                }
            
            }
            
            
            
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return datos;
        

        
    }

        public static int nfilasUser() throws IOException {
            String ruta = "Users.xlsx";
            FileInputStream file = new FileInputStream(new File(ruta));
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);

            int nFilas = sheet.getLastRowNum();

            return nFilas;
        }    
}
