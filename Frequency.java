import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        String fileName = "letter_frequency.csv";
        int[] letterCounts = new int[26];
        int totalLetters = 0;

        
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toLowerCase();
                
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (ch >= 'a' && ch <= 'z') {
                        letterCounts[ch - 'a']++;
                        totalLetters++;
                    }
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return;
        }

       
        System.out.println("Letter\tFrequency\tPercentage");
        System.out.println("________________________________");
        
        float totalPercentage = 0;
        int totalFreq = 0;

        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            int frequency = letterCounts[i];
            
            
            float percentage = 0;
            if (totalLetters > 0) {
                percentage = ((float) frequency / totalLetters) * 100;
            }
            
            System.out.printf("%c\t%d\t\t%.2f%%\n", letter, frequency, percentage);
            
            totalFreq += frequency;
            totalPercentage += percentage;
        }

        System.out.println("____________________________________");
      
        System.out.printf("Total\t%d\t\t%.2f%%\n", totalFreq, totalPercentage);
    }
}

