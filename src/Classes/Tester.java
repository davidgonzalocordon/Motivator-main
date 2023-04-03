/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        ReadSite();
        
        
    }
    public static void ReadSite(){
        
        String ruta = "Sites.xlsx";
        
        try {
            FileInputStream file = new FileInputStream(new File(ruta));
            
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            
            int numfilas = sheet.getLastRowNum();
            
            for(int i=1; i<=numfilas; i++){
                Row fila = sheet.getRow(i);
                int numcolum = fila.getLastCellNum();
                
                
                for(int j=0; j<numcolum; j++){
                    Cell celda = fila.getCell(j);
                    
                    
                    switch (celda.getCellTypeEnum().toString()){
                        case "NUMERIC":
                            
                            System.out.println(celda.getNumericCellValue()+" ");
                            break;
                            
                        case "STRING":
                            System.out.println(celda.getStringCellValue()+" ");
                            break;
                            
                    }
                    
                }
                System.out.println("");
            }
             
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    
    }
}
