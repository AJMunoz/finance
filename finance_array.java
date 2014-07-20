import java.util.*;
public class finance_array
{
   public static void main(String[] args) {
       Random rd = new Random();
       int i = 0;
       int g = 0;
       int[] a = new int[10];
       //Creates Random FL Budget Values
       for (i = 0; i < 10; i++) {
           a[i] = rd.nextInt((150 - 75) + 1) + 75;
        }
        i = 0;
        //Creates the size for the largeValues array
       while(i < a.length) {
           if(a[i] > 100) {
               g++;
            }
            i++;
       }
       int[] largeValues = new int[g];
       i = 0;
       int k = 0;
       //Assigns the values from a that are > 100 to largeValues
       while(i < a.length) {
           if(a[i] > 100) {
               largeValues[k] = a[i];
               k++;
            }
            i++;
        }
       printArray(a);
       System.out.println();
       System.out.println();
       printArray(largeValues);
       System.out.println();
       System.out.println();
       
       
    }
    public static void printArray(int[] a) {
        int i = 0;
        while(i < a.length) {
            System.out.println(a[i]);
            i++;
        }
    }
}
