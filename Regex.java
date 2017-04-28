/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Regex {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myRegexString = "[a-z]+@gmail.com";
        
        Pattern p=Pattern.compile(myRegexString);
        int N = in.nextInt();
        
        List<String> arr= new ArrayList<>();
       
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = p.matcher(emailID);
            
            
            if(m.find())
            {
                arr.add(firstName);
                
            }
        }
        Collections.sort(arr);
        for(String s:arr)
        {
            System.out.println(s);
        }
    }
}
