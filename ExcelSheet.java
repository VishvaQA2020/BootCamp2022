import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExcelSheet {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet(" Student Data ");
        XSSFRow row;
        Map<String, Object[]>StudentData = new TreeMap<String, Object[]>();
        StudentData.put("1",new Object[]{"Roll no","Name","Year"});
        StudentData.put("2",new Object[]{"1","Armaan","1st Year"});
        StudentData.put("3",new Object[]{"2","Prabesh","1st Year"});
        StudentData.put("4",new Object[]{"3","Aryall","1st Year"});
        StudentData.put("5",new Object[]{"4","Bikash","1st Year"});
        StudentData.put("6",new Object[]{"5","Pranav","1st Year"});
        StudentData.put("7",new Object[]{"6","Kosh","1st Year"});
        StudentData.put("8",new Object[]{"7","Dipak","1st Year"});
        StudentData.put("9",new Object[]{"8","Aswin","1st Year"});
        StudentData.put("10",new Object[]{"9","Ram","1st Year"});
        StudentData.put("11",new Object[]{"10","Hari","1st Year"});
        StudentData.put("12",new Object[]{"11","Krishna","1st Year"});
        StudentData.put("13",new Object[]{"12","Vishal","1st Year"});
        StudentData.put("14",new Object[]{"13","Aavash","1st Year"});
        StudentData.put("15",new Object[]{"14","Dipesh","1st Year"});
        StudentData.put("16",new Object[]{"15","Badri","1st Year"});
        StudentData.put("17",new Object[]{"16","Sandeep","1st Year"});
        StudentData.put("18",new Object[]{"17","Pawan","1st Year"});
        StudentData.put("19",new Object[]{"18","Raju","1st Year"});
        StudentData.put("20",new Object[]{"19","Yeh","1st Year"});
        StudentData.put("21",new Object[]{"20","Babu","1st Year"});
        StudentData.put("22",new Object[]{"21","Rao","1st Year"});
        StudentData.put("23",new Object[]{"22","ka","1st Year"});
        StudentData.put("24",new Object[]{"23","Style","1st Year"});
        StudentData.put("25",new Object[]{"24","hein","1st Year"});
        StudentData.put("26",new Object[]{"25","La","1st Year"});
        StudentData.put("27",new Object[]{"26","Baatli","1st Year"});
        StudentData.put("28",new Object[]{"27","laa","1st Year"});
        StudentData.put("29",new Object[]{"28","Be","1st Year"});
        StudentData.put("30",new Object[]{"29","HeraFeri","1st Year"});
        StudentData.put("31",new Object[]{"30","Don","1st Year"});
        StudentData.put("32",new Object[]{"31","Ko","1st Year"});
        StudentData.put("33",new Object[]{"32","Pakadna","1st Year"});
        StudentData.put("34",new Object[]{"33","Mushkil","1st Year"});
        StudentData.put("35",new Object[]{"34","Hi","1st Year"});
        StudentData.put("36",new Object[]{"35","nahi","1st Year"});
        StudentData.put("37",new Object[]{"36","na","1st Year"});
        StudentData.put("38",new Object[]{"37","mumkin","1st Year"});
        StudentData.put("39",new Object[]{"38","hein","1st Year"});


        Set<String>keyid = StudentData.keySet();
        int rowid=0;
        for(String key : keyid){
            row = spreadsheet.createRow(rowid++);
            Object[]objectArr = StudentData.get(key);
            int cellid = 0;
            for (Object obj : objectArr){
                Cell cell  =row.createCell(cellid++);
                cell.setCellValue((String)obj );
                FileOutputStream out = new FileOutputStream(new File("C:\\BootCamp\\Projects\\Clone\\Users.xlsx"));
                workbook.write(out);
                out.close();

            }

        }




    }
}
