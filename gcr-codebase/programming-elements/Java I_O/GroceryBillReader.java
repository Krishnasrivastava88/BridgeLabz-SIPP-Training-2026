
import java.io.*;
public class GroceryBillReader {
    public static void main(String[] args) {
        int lines = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader("bill.txt"));
            String s;
            while((s = br.readLine()) != null){
                System.out.println(s);
                lines++;
            }
            br.close();
            System.out.println("Total Lines = " + lines);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
