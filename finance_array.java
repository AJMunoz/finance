import java.util.*;
public class finance_array
{
   public static void main(String[] args) {
       Random rd = new Random();
       int k= 0;
       int i = 0;
       int g = 0;
       int[] a = new int[10];
       //Creates Random FL Budget Values
       for (i = 0; i < 10; i++) {
           a[i] = rd.nextInt((110 - 75) + 1) + 75;
        }
       i = 0;
       //Creates the size for the alphaOne array
       while(i < a.length) {
           if(a[i] > 100) {
               g++;
            }
            i++;
       }
       int[] alphaOne = new int[g];
       i = 0;
       //Assigns the values from a that are > 100 to alphaOne
       while(i < a.length) {
           if(a[i] > 100) {
               alphaOne[k] = a[i];
               k++;
            }
            i++;
        }     
       i = 0;
       Arrays.sort(a); //Bubble Sorts a to get the minimum values at the beginning
       int[] alphaTwo = new int[alphaOne.length];
       //Creates list of lowest numbers
       for(int t = 0; t<alphaOne.length;t++) {
           alphaTwo[t] = a[t];
       }
       //Flips lowest numbers to get the optimal 
       for (i = 0; i < alphaTwo.length / 2; i++) {
           int temp = alphaTwo[i];
           alphaTwo[i] = alphaTwo[alphaTwo.length - 1 - i];
           alphaTwo[alphaTwo.length - 1 - i] = temp;
       }
       //Balances Funds
       for (int t= 0; t < alphaOne.length; t++) {
            int thetaOne = alphaOne[t] - 100;
            alphaOne[t] = alphaOne[t] - thetaOne;
            alphaTwo[t] = alphaTwo[t] + thetaOne;
       }
       int[] finalResult = new int[alphaOne.length + alphaTwo.length]; //Final Result Array
       System.arraycopy(alphaOne, 0, finalResult, 0, alphaOne.length);
       System.arraycopy(alphaTwo, 0, finalResult, alphaOne.length, alphaTwo.length);
       printArray(finalResult);
    }
    public static void printArray(int[] a) {
        int i = 0;
        while(i < a.length) {
            System.out.println(a[i]);
            i++;
        }
    }
}
