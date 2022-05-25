package Automation.maven;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Writestudentdata_Json_Excel {

Scanner input =new Scanner(System.in);
 
   
   @SuppressWarnings("unchecked")
public void WriteToJsonFile() throws IOException {
   
    JSONObject student1=new JSONObject();
    student1.put("RollNumber", "45");
    student1.put("Name", "Subbu");
    student1.put("Marks","449");
    student1.put("Result", "Pass");
   
    JSONObject student2=new JSONObject();
   student2.put("RollNumber", "46");
    student2.put("Name", "lakshmi");
    student2.put("Marks","459");
    student2.put("Result", "Pass");
   
   JSONObject student3=new JSONObject();
  student3.put("RollNumber", "47");
    student3.put("Name", "shiva");
    student3.put("Marks","469");
    student3.put("Result", "Pass");
   
  JSONObject student4=new JSONObject();
 student4.put("RollNumber", "48");
    student4.put("Name", "Shangari");
    student4.put("Marks","479");
    student4.put("Result", "Pass");
   
 JSONObject student5=new JSONObject();
    student5.put("RollNumber","49");
    student5.put("Name", "Jaghan");
    student5.put("Marks","489");
    student5.put("Result", "Pass");
   
    JSONArray studentlist= new JSONArray();
    studentlist.add(student1);
    studentlist.add(student2);
    studentlist.add(student3);
    studentlist.add(student4);
    studentlist.add(student5);
   
    //Scanner input = new Scanner(System.in);
  //System.out.println("Enter the file Name:");
  String filename = "test2.json";
  String getUserDirectory = System.getProperty("user.dir");
  String path = getUserDirectory + File.separator + "Json" + File.separator + filename;
  //input.close();

  FileWriter ofileWriter = new FileWriter(path, false);
  ofileWriter.write(studentlist.toJSONString());
  ofileWriter.close();
  System.out.println("File has been created");

   }
  public void readJsonFile(JSONObject student) throws IOException, ParseException {
  JSONParser jsonParcer = new JSONParser();
  String filename = "test2.json";
String getUserDirectory = System.getProperty("user.dir");
String path = getUserDirectory + File.separator + "Json" + File.separator + filename;
FileReader fileReader = new FileReader(path);
Object parsedObject = jsonParcer.parse(fileReader);
JSONArray listStudent= (JSONArray) parsedObject;
System.out.println(listStudent);

JSONObject empObject = (JSONObject) parsedObject;

System.out.println("File read successfully..");



       
   }
   
  /* public void findTheopperStudent() {
       
   }
   public void writeToXlsxFile() {
       
   }*/
}
