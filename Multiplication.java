
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
public class Multiplication {
    static void multiply(int num)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(num+"x"+i+" = "+num*i);
        }
    }
    
    public static void main(String args[])
    {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         
         multiply(n);
    }
}
