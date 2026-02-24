import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
// Macy Culbertson
// This file is what outlines how and where data is stored
//SD class 2026
public class StoreFrequency {

    public static String readFileAsString(String fileName)
        throws Exception
    {
        String data = "";
        data = new String(
            Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void main(String[] args) throws Exception
    {
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Path : ");
        
      
        String path = br.readLine();
      
        String data = readFileAsString(path);
      
        System.out.println(data);
        
        String str = (data);

        
String[] strArray = str.split("*"); 

for (String s : strArray) {
    System.out.println(s);
        }
    }
}


