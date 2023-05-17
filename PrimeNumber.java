//write a java program to print all prime numbers from 1 to n where n is an integer 
import java.util.Scanner;
public class PrimeNumber{
  public static void main(String args[]){
    Prime p=new Prime();
    p.isPrime();
  }
} 
 class Prime{
   public int isPrime(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    n=sc.nextInt();
    System.out.println("prime numbers between 1 to " +n+" are:");
    for(int i=2;i<=n;i++){
         int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0){
          count=count+1;
        }}
      if(count==2)
        System.out.println(i+ "");
    }    
  }
}
