/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package come.dominos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author virad
 */
public class FileUtil {

    public static Registration readForm() throws FileNotFoundException, IOException {

        Registration registration = null;
        FileInputStream inputStream = new FileInputStream(new File("c:\\data\\domino.xlsx"));

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet join = workbook.getSheetAt(0);
        Row r = join.getRow(0);
        Cell c = r.getCell(1); //username value
        String name = c.getStringCellValue();
        System.out.println("name = " + name);

        r = join.getRow(1);
        c = r.getCell(1); //username value
        String lname = c.getStringCellValue();
        System.out.println("Last Name  = " + lname);
        
         r = join.getRow(2);
        c = r.getCell(1); //username value
        String email = c.getStringCellValue();
        System.out.println("email = " + email);
        
         r = join.getRow(3);
        c = r.getCell(1); //username value
        String confemail = c.getStringCellValue();
        System.out.println("confirm email = " + confemail);
        
        r = join.getRow(4);
        c = r.getCell(1); //username value
        String phon = c.getStringCellValue();
        System.out.println("phone = " + phon);
        
           r = join.getRow(5);
        c = r.getCell(1); //username value
        String pass = c.getStringCellValue();
        System.out.println("password = " + pass);
        
           r = join.getRow(6);
        c = r.getCell(1); //username value
        String confPass = c.getStringCellValue();
        System.out.println("conf Pasword = " + confPass);
        
        registration = new Registration(name, lname, email, confemail, phon, pass, confPass);
        return registration;

    }

}
