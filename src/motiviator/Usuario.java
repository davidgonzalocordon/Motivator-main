/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motiviator;

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
    
    public static void main(String[] args) throws IOException {
        createUsers();
        addUser("Juan" , "JuanUsu", "Contra", "correo@gmail", 1);
    }
    
    public static void createUsers(){
        Workbook book = new XSSFWorkbook();
        Sheet sheet = (Sheet) book.createSheet("Usuarios");

        Row menu = sheet.createRow(0);
        menu.createCell(0).setCellValue("Nombre Completo");
        menu.createCell(1).setCellValue("Usuario");
        menu.createCell(2).setCellValue("Contraseña");
        menu.createCell(3).setCellValue("E-Mail");
        menu.createCell(4).setCellValue("Nivel");

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
    
    public static void addUser(String nombre, String usuario, String password, String mail, int level) throws IOException{
        String ruta = "Users.xlsx";
        FileInputStream file = new FileInputStream(new File(ruta));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int nFilas = sheet.getLastRowNum()+1;
        Row fila = sheet.createRow(nFilas);
        
        fila.createCell(0).setCellValue(nombre);
        fila.createCell(1).setCellValue(usuario);
        fila.createCell(2).setCellValue(password);
        fila.createCell(3).setCellValue(mail);
        fila.createCell(4).setCellValue(level);
        
        FileOutputStream output = new FileOutputStream(ruta);
        wb.write(output);
        output.close();
    }
    
    public static void leer() throws IOException {
        try {
            FileInputStream file = new FileInputStream(new File("Users.xlsx"));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);

            int numFilas = sheet.getLastRowNum();

            for (int a = 0; a <= numFilas; a++) {
                Row fila = sheet.getRow(a);
                int numCols = fila.getLastCellNum();

                for (int b = 0; b < numCols; b++) {
                    Cell celda = fila.getCell(b);

                    switch (celda.getCellTypeEnum().toString()) {
                        case "NUMERIC":
                            System.out.print(celda.getNumericCellValue() + " ");
                            break;

                        case "STRING":
                            System.out.print(celda.getStringCellValue() + " ");
                            break;

                        case "FORMULA":
                            System.out.print(celda.getCellFormula() + " ");
                            break;
                    }

                }

                System.out.println("");

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
