 //WAP to print Fibonacci series up to n terms
import java.util.Scanner;
public class FibonacciSeries{
  public static void main(String args[]){
    FibSeries f=new FibSeries();
    f.fibSeries();
  }
}
class FibSeries{
  public void fibSeries(){
    Scanner s=new Scanner(System.in);
    int n,n1=0,n2=1;
    int count=0;
    System.out.println("enter a number");
    n=s.nextInt();
     System.out.println("Fibonacci series of "+n+ "is");
    while(count<=n){
       System.out.println(n1+ "");
      int next_term=n1+n2;
       n1=n2;
      n2=next_term;
      count++;
      }
  }
}