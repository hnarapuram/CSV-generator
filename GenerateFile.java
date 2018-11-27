


import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateFile {

    public static void main(String[] args) {
        try {
           
            FileWriter file1 = new FileWriter("C:/Users/hanumath.narapuram/MyFile1.txt", true);
            FileWriter file2 = new FileWriter("C:/Users/hanumath.narapuram/MyFile2.txt", true);
            int j=0;
            for(int i=0;i<=7000000;i++) {
            	
            	String field1 = generateRandomWords();
            	String field2 = generateRandomWords();
            	String field3 = generateRandomWords();
            	
            	
            	file1.write("A"+i+",");
            	file1.write(field1+",");
            	file1.write(field2+",");
            	file1.write(field3);
            	file1.write("\r\n");
            	
            	
            	if(i > 500 && i< 2500) { // updating existing record

            		file2.write("A"+i+",");
                	file2.write(generateRandomWords()+",");
                	file2.write(field2+",");
                	file2.write(generateRandomWords());
                	file2.write("\r\n");

            	} else if (i > 5000 && i < 6000 ) { // Adding new record
            		file2.write("A"+i+ j++ );
                	file2.write("," + generateRandomWords()+",");
                	file2.write(generateRandomWords()+",");
                	file2.write(generateRandomWords());
                	file2.write("\r\n");
            		
            	} else if (i > 10000 && i < 20000 ) {
            		
            				// delete record
                	
            	} else { // No updates
            		file2.write("A"+i+",");
                	file2.write(field1+",");
                	file2.write(field2+",");
                	file2.write(field3);
                	file2.write("\r\n");
            	}
            	
               
            }
            file1.close();
            file2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
   
    public static String generateRandomWords()
    {
        String randomStrings = null;
        Random random = new Random();
        for(int i = 0; i < 1; i++)
        {
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings = new String(word);
        }
        return randomStrings;
    }

}

	
	
	

