
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
public class binaryNumber {

    static String toBinary(int n) {
        int rem;
        StringBuffer res = new StringBuffer();
        while (n > 0) {
            rem = n % 2;
            res = res.append(rem);
            n = n / 2;
        }
        return res.reverse().toString();
    }

    static int consecutiveOnes(String bin) {
        StringBuffer str = new StringBuffer(bin);
        int counter = 0;
        int maxValue = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            maxValue = 0;
            if (str.charAt(i) == '1') {

                while (str.charAt(i) == '1') {
                    maxValue = maxValue + 1;
                    if (counter < maxValue) {
                        counter = maxValue;
                    }
                    i++;
                    if (i == len) {
                        return counter;
                    }
                }

            }

        }
        return counter;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(consecutiveOnes(toBinary(n)));

    }
}
