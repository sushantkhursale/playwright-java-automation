package utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {

    private String fileName = "UserData.xlsx";
    private String sheetName = "HomePageOptions";


    @DataProvider(name="options")
    public String[] getUsernames() throws IOException {

        String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\"+fileName;
        ExcelUtility xlUtility = new ExcelUtility();
        int noOfRows = xlUtility.getRowCount(filePath,sheetName);
        String[] usernamesArray = new String[noOfRows];

        for(int i=1; i<=noOfRows;i++){
            usernamesArray[i-1]=xlUtility.getCellData(filePath,sheetName,i,0);
        }

        return usernamesArray;

    }
}

