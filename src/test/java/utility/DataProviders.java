package utility;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {
    @DataProvider(name = "dp")
    public String[][] getData() throws IOException {
        String path="/home/policyx/testngtest/src/tast data/Opencart_LoginData.xlsx";//taking xl file from testData
        ExcelUtilityfile excelsheet=new ExcelUtilityfile(path);
        int totalrow=excelsheet.getRowCount("Sheet1");
        int totalcell=excelsheet.getCellCount("Sheet1",1);
       String data[][]=new String[totalrow][totalcell];
        for(int i=1;i<totalrow;i++){
            for(int j=0;j<totalcell;j++){
                data[i-1][j]=excelsheet.getCellData("Sheet1",i,j);
            }
        }
       return data;
    }
}
