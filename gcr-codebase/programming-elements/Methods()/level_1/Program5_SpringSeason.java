import java.util.Scanner;
public class Program5_SpringSeason {
    static boolean isSpring(int m,int d){
        return (m==3 && d>=20)||(m>3 && m<6)||(m==6 && d<=20);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(), d=sc.nextInt();
        System.out.println(isSpring(m,d)?"Its a Spring Season":"Not a Spring Season");
    }
}