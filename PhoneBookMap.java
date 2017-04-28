
import java.util.HashMap;
import java.util.Map;
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
public class PhoneBookMap {
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map map= new HashMap();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(map.containsKey(s))
            {
                System.out.println(s+"="+map.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
        
    }
    
}
