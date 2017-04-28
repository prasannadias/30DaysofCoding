/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */
import com.sun.javafx.collections.IntegerArraySyncer;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BitwiseOperations {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int res=0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            
            for(int i=1;i<n;i++)
                for(int j=i+1;j<=n;j++)
            {
               if((i&j)<k && res < (i&j))
                   res=(i&j);
            
            }
            System.out.println(res);
            res=0;
        }
    }
    
    
    
}
