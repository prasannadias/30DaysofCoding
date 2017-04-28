
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
public class stringIndices {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str[]=new String[num];
        String s1="",s2="";
        
        for (int i=0;i<num;i++)
        {
            str[i]=sc.next();
        }
        
        for(int i=0;i<num;i++)
        {
            int strlen= str[i].length();
            s1="";s2="";
            for(int j=0;j<strlen;j++)
            {
                if(j%2==0)
                {
                   s1=s1+str[i].charAt(j); 
                }
                else
                {
                    s2=s2+str[i].charAt(j);
                }
            }
            System.out.print(s1+" "+s2);
            System.out.println();
        }
    }
    
}
