import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
//Macy Culbertson
//SD Class 2
// 2026
public class ReadStudent {

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
        
        // Reading File name
        String path = br.readLine();
      
        String data = readFileAsString(path);
      
        System.out.println(data);
    }
}