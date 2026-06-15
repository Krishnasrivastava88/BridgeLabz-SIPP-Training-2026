import java.util.Scanner;
public class Program9_Chocolates {
    static int[] findRemainderAndQuotient(int n,int d){
        return new int[]{n%d,n/d};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] r=findRemainderAndQuotient(sc.nextInt(),sc.nextInt());
        System.out.println("Each Child Gets="+r[1]);
        System.out.println("Remaining Chocolates="+r[0]);
    }
}