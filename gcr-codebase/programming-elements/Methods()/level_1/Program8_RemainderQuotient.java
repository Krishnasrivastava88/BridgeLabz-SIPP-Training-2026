import java.util.Scanner;
public class Program8_RemainderQuotient {
    static int[] findRemainderAndQuotient(int n,int d){
        return new int[]{n%d,n/d};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] r=findRemainderAndQuotient(sc.nextInt(),sc.nextInt());
        System.out.println("Remainder="+r[0]+" Quotient="+r[1]);
    }
}