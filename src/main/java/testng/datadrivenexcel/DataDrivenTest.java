package testng.datadrivenexcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by gfox on 13/06/2016.
 */
public class DataDrivenTest {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("/Users/gfox/IdeaProjects/Java_Mock_Exams/src/main/java/testng/datadrivenexcel/Workbook1.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet =wb.getSheet("script");
        XSSFRow row =sheet.getRow(2);
        System.out.println(row.getCell(0).getBooleanCellValue());
        //this will set the value locally
        row.getCell(0).setCellValue("Hello");

        //row.getCell(0).getCellType() == Cell.CELL_TYPE_BOOLEAN;
        System.out.println(row.getCell(0).getStringCellValue());


        //This is to write to the workbook
        FileOutputStream filwOut = new FileOutputStream("/Users/gfox/IdeaProjects/Java_Mock_Exams/src/main/java/testng/datadrivenexcel/Workbook1.xlsx");
        wb.write(filwOut);
        System.out.println("Done");



    }
}
