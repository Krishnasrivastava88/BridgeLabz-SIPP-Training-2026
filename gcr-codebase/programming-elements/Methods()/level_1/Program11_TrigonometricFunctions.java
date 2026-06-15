import java.util.Scanner;
public class Program11_TrigonometricFunctions {
    static double[] calculateTrigonometricFunctions(double angle){
        double r=Math.toRadians(angle);
        return new double[]{Math.sin(r),Math.cos(r),Math.tan(r)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] a=calculateTrigonometricFunctions(sc.nextDouble());
        System.out.println("Sin="+a[0]);
        System.out.println("Cos="+a[1]);
        System.out.println("Tan="+a[2]);
    }
}