package utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {

    private String fileName = "UserData.xlsx";
    private String sheetName = "Sheet1";
//    public DataProviders(String fileName, String sheetName){
//        this.fileName = fileName;
//        this.sheetName = sheetName;
//    }

    @DataProvider(name="Data")
    public String[][] getDataFromExcel() throws IOException {
        String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\"+fileName;
        ExcelUtility xlUtility = new ExcelUtility();
        int noOfRows = xlUtility.getRowCount(filePath,sheetName);
        int noOfColumns = xlUtility.getCellCount(filePath,sheetName,0);

        String[][] excelDataArray = new String[noOfRows][noOfColumns];

        for(int i=1;i<=noOfRows;i++){
            for(int j=0;j<noOfColumns;j++){
                excelDataArray[i-1][j] = xlUtility.getCellData(filePath,sheetName,i,j);
            }

        }
        return excelDataArray;
    }


    @DataProvider(name="Usernames")
    public String[] getUsernames() throws IOException {

        String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\"+fileName;
        ExcelUtility xlUtility = new ExcelUtility();
        int noOfRows = xlUtility.getRowCount(filePath,sheetName);
        String[] usernamesArray = new String[noOfRows];

        for(int i=1; i<=noOfRows;i++){
            usernamesArray[i-1]=xlUtility.getCellData(filePath,sheetName,i,1);
        }

        return usernamesArray;

    }
}

