
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
public class Difference {
    private int[] elements;
    public int maximumDifference;
    
    Difference(int[] values)
    {
        elements=values;
    }
    
    void computeDifference ()
    {
        int diff=0;
        for(int j=0;j<elements.length;j++)
        {
            for(int i=j+1;i<elements.length;i++)
        {
            diff=Math.abs(elements[j]-elements[i]);
            if(diff>maximumDifference)
            {
                maximumDifference=diff;
            }
        }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
    
}
