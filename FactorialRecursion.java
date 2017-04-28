
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
public class FactorialRecursion {
    static int Factorial(int n)
    {
        if(n==1)
            return 1;
        
        return n*Factorial(n-1);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=1;
        result=Factorial(n);
        
        System.out.println(result);
    }
    
}
