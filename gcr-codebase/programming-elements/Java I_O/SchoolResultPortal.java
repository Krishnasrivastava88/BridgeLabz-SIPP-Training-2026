
import java.io.*;
public class SchoolResultPortal {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt", true));
            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
        }catch(FileNotFoundException e){
            System.out.println("Input file not found.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
