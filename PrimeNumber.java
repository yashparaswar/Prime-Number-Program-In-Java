import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[])
    {
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Check Whether Given Number Is Prime Or Not");
        int n = sc.nextInt();
        if(n==0||n==1){  
            System.out.println(n+" is not prime number");      
           }
           else if(n==2)
           {
               System.out.println(n+" Is Prime");
           }
           else{
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                
                    System.out.println(n+" is Not Prime");
                    flag =1;
                    break;

                
            }
           
        }
        if(flag==0)
        {
            System.out.println(n+" Is a prime");
        }
    }
    }
}
