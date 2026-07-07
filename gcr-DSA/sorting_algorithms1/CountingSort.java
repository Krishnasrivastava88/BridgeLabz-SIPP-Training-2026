import java.util.*;
public class CountingSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] c=new int[21];
        for(int i=0;i<n;i++)c[sc.nextInt()]++;
        for(int i=1;i<=20;i++)while(c[i]-->0)System.out.print(i+" ");
    }
}
