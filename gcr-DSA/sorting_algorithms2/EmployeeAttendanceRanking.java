import java.util.*;
class EmployeeAttendanceRanking{
 static class Emp{
  int id,att;
  Emp(int i,int a){id=i;att=a;}
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  Emp[] e=new Emp[n];
  int[] ids=new int[n],att=new int[n];
  for(int i=0;i<n;i++) ids[i]=sc.nextInt();
  for(int i=0;i<n;i++) att[i]=sc.nextInt();
  int k=sc.nextInt();
  for(int i=0;i<n;i++) e[i]=new Emp(ids[i],att[i]);
  Arrays.sort(e,(a,b)->a.att!=b.att?b.att-a.att:a.id-b.id);
  for(int i=0;i<k;i++) System.out.print(e[i].id+" ");
 }
}