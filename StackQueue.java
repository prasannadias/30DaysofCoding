
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */
public class StackQueue {
     Stack st = new Stack();
     Queue q = new LinkedList();

     void pushCharacter(char ch)
    {
       st.push(ch);
    }
    char popCharacter()
    {
       return (char)st.pop();
    }
    void enqueueCharacter(char ch)
    {
       q.add(ch);
    }
    char dequeueCharacter()
    {
        return (char)q.remove();
    }
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       StackQueue sq= new StackQueue();
       String s=sc.next();
       int counter=0;
       for(int i=0;i<s.length();i++)
       {
           sq.pushCharacter(s.charAt(i));
           sq.enqueueCharacter(s.charAt(i));
       }
       for(int i=0;i<s.length();i++)
       {
           if(sq.popCharacter()==sq.dequeueCharacter())
           {
               counter++;
              
           }
           else
           {
               System.out.println("String "+s+" is not a palindrome");
               return;
           }
       }
       if(counter==s.length())
           System.out.println("String "+s+" is a palindrome");
    }
    
}
