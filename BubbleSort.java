
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
public class BubbleSort {

    static void bubbleSort(int[] a, int n) {
        int k;
        int numberOfSwaps = 0;
        int len= n-1;
        //for (int i = 0; i < n; i++) {
          while(len>=0)         
          {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    //swap(a[j], a[j + 1]);
                    k=a[j];
                    a[j]=a[j+1];
                    a[j+1]=k;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
            len--;
        }
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        bubbleSort(a, n);
    }

}
