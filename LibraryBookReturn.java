
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
public class LibraryBookReturn {
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int actdate= sc.nextInt();
        int actmonth=sc.nextInt();
        int actyear=sc.nextInt();
        
        int duedate=sc.nextInt();
        int duemonth=sc.nextInt();
        int dueyear=sc.nextInt();
        
        int fine;
        if(actyear<dueyear)
        {
            fine=0;
        }
        else if(actyear==dueyear)
        {
            if(actmonth<=duemonth)
            {
                if(actdate<=duedate)
                {
                  fine=0;
                }
                else
                {
                    fine=15*(actdate-duedate);
                }
                
            }
            else
            {
                fine=500*(actmonth-duemonth);
            }
        }
        else
        {
            fine=10000;
        }
        System.out.println(fine);
    }
}
