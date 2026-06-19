
import java.io.*;
import java.util.*;
public class EmailDomainCounter{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("emails.txt"));
        HashMap<String,Integer> map=new HashMap<>();
        String s;
        while((s=br.readLine())!=null){
            String domain=s.substring(s.indexOf("@")+1);
            map.put(domain,map.getOrDefault(domain,0)+1);
        }
        br.close();
        System.out.println(map);
    }
}
