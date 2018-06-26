import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader2
 {

    public static void main(String[] args)
    {

        String csvFile = "C://Users//user//Desktop//book1.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        Map book1, author;
                    book1 =new HashMap<String, String[]>();
            author =new HashMap<String, String[]>();


        try
        {
            Scanner in=new Scanner(System.in);
            String BN;
            System.out.println(" Enter the book you want to search");
            BN=in.next() + in.nextLine();
            
            FileReader fr = new FileReader(csvFile);

            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] book1line = line.split(cvsSplitBy);

                 System.out.println("Books [code= " + book1line[0] + " , name=" + book1line[2] + "]");
                
                 book1.put(book1line[0], book1line);
                //book1.put(BN, book1line);
                author.put(book1line[1], book1line);

            }
            String user = BN;
            System.out.println("BN=" + BN);
            // String[] lineget = (String[])book1.get(BN);
            String[] lineget = (String[])book1.get("dork diaries");
           // System.out.println(lineget[0] + "," + lineget[1] + "," + lineget[2]);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
         
        
        }


    }
}
        
