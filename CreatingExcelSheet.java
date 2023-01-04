import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.*;

public class CreatingExcelSheet {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("sheet1");
        String Location = "C:\\BootCamp\\Projects\\Clone\\Users.xlsx";
        FileOutputStream outputfile = new FileOutputStream(Location);
        workbook.write(outputfile);
        outputfile.close();
        System.out.println("Users.xlsx is written successfully");


    }

    }

