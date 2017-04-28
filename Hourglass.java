
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
public class Hourglass {
    static void hourglassSum(int[][] a)
    {
        int sumCurr=0;
        int sumMax=a[0][0]+a[0][1]+a[0][2]+a[1][1]+a[2][0]+a[2][1]+a[2][2];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
            {
                if(i+2<a.length && j+2<a[0].length)
                {
                sumCurr=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                }
                else
                {
                    break;
                }
                if(sumCurr>sumMax)
                    sumMax=sumCurr;
            }
        System.out.println(sumMax);
    }
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        hourglassSum(arr);
    }
    
}
