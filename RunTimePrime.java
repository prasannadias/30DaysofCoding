
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */



public class RunTimePrime {
    
    public static void main(String args[])
    {
        
       
        
      /*  Scanner input = new Scanner(System.in);
        
        int cases = input.nextInt();
        for(int j=0;j<=cases;j++)
        {
            int flag = 0;
            int number = input.nextInt();
        
        for (int i=2;i<(int)Math.sqrt(number)+1;i++)
        {
            if (number%i==0)
            {
                flag =1;
                System.out.println("Not prime");
                break;
            }
            
        }
       
        if(flag ==0 && number!=1)
        {
             System.out.println("Prime");
        }
        if(number==1)
        {
            System.out.println("Not Prime");
           
        }
        }
       */ 
        
        Scanner input = new Scanner(System.in);
        
        int cases = input.nextInt();
        for(int j=0;j<=cases;j++)
        {
             int number = input.nextInt();
             if(isPrime(number)==false)
             {
                 System.out.println("Not prime");
             }
             else
             {
                 System.out.println("Prime");
             }
        }
    }
    public static boolean isPrime(int number) 
    { 
    int sqrt = (int) Math.sqrt(number) + 1;
    if(number==1)
    {
        return false;
    }
    for (int i = 2; i < sqrt; i++)
    { 
        if (number % i == 0) 
    { 
    // number is perfectly divisible - no prime 
        return false;
    }
    } 
    return true;
    }


    
}

