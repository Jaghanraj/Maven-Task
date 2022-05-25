package Automation.maven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonWritter {

	 
	JSONObject jsonObject;
	@SuppressWarnings("unchecked")
	public void writeJsonFile() throws IOException, ParseException 
	{
	
		Scanner input = new Scanner(System.in);
		
		  jsonObject = new JSONObject();
		
		try {
		System.out.println("Enter employee Id :");
		jsonObject.put("EmployeeId",input.nextLine() );	
		}catch(InputMismatchException ime) {
			System.out.println("Enter only integer values");
		}
		
		try {
		System.out.println("Enter employee name :");
		jsonObject.put("EmployeeName", input.next());
		}catch(InputMismatchException ime) {
			ime.printStackTrace();
		}
		
		try {
		System.out.println("Enter employee designation :"); 		
		jsonObject.put("EmployeeRole", input.next());
		}catch(InputMismatchException ime) {
			ime.printStackTrace();
		}
		
//		System.out.println("Enter the file Name:");
//		String filename = input.next();
		String getUserDirectory = System.getProperty("user.dir");
		String path = getUserDirectory +File.separator+"Json"+File.separator+"jaghan.json";
		System.out.println(path);
    	input.close();
	
	
		FileWriter ofileWriter = new FileWriter("path",false);
		ofileWriter.write(jsonObject.toJSONString());
		ofileWriter.close();
		System.out.println("File has been created");
	}
	
	public List<String> readJsonFile() throws IOException, ParseException, org.json.simple.parser.ParseException
	{		
		JSONParser jsonParcer = new JSONParser();
		String userWorkingDirectory = System.getProperty("user.dir");
	    String path = userWorkingDirectory + File.separator+"Json"+File.separator+"jaghan.json" ;
		FileReader fileReader = new FileReader(path);
	    Object parsedObject= jsonParcer.parse(fileReader);
		JSONObject empObject =(JSONObject) parsedObject;
		
		String empId =(String) empObject.get("EmployeeId");
		String empName =(String) empObject.get("EmployeeName");
		String empRole =(String) empObject.get("EmployeeRole");
		
		System.out.println("Employee Id :" +empId);
		System.out.println("Employee Name :" +empName);
		System.out.println("Employee Role :" +empRole);
		List<String> list = new ArrayList<String>();
		list.add(empId);
		list.add(empName);
		list.add(empRole);
		 
		return list;
	}
	
	 
	public void writeExcel(List<String> list) throws IOException
    {
//		Scanner scan = new Scanner(System.in);
//		    System.out.println("Name Your XcellFile:");
//	        String filename = scan.next();
//	        //List<String> list = null;
//		    String userWorkingDirectory = System.getProperty("user.dir");
//	        String path = userWorkingDirectory + File.separator + filename ;
//	        System.out.println(path);
//	        scan.close();
		String userWorkingDirectory = System.getProperty("user.dir");
	    String path = userWorkingDirectory + File.separator ;
        FileOutputStream out = new FileOutputStream(path+"jaghan.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Employee Data");      
          
        XSSFRow row;
        Map <String,List<String>> map = new LinkedHashMap<String,List<String>>();
        map.put("1", list);
        
        Set<String> keyid = map.keySet();
        int rowid = 0;
  
        for (String key : keyid) {
  
            row = sheet.createRow(rowid++);
            List<String> objectArr = map.get(key);
            int cellid = 0;
  
            for (Object obj : objectArr) {
                XSSFCell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
            }
            workbook.write(out);
            workbook.close();
            
        }
                          
    }
		
		
				
	}


