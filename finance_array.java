import java.util.*;
public class finance_array
{
   public static void main(String[] args) {
       int numberOfValues = 9;
       int[] a = {12,58,65,74,105,47,96,87,104};
       int i = 0;
       int g = 0;
       while (i < a.length) {
           if(a[i] > 100) {
               g++;
            }
            i++;
       }
       i = 0;
       int[] largeValues = new int[g];
       while (i < largeValues.length) {
           if(a[i] > 100) {
               largeValues[i] = a[i];
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
