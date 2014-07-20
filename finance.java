import java.util.*;
public class finance
{
   public static void main(String[] args) {
       int numberOfValues = 9;
       int[] a1 = {12,58,65,74,105,47,96,87,104};
       int i = 0;
       int alphaOne;
       int alphaTwo;
       int thetaOne;
       alphaOne = 104;
       alphaTwo = 92;
       thetaOne = alphaOne - 100; 
       if (alphaOne - alphaTwo > 0) {
           alphaOne = alphaOne - thetaOne;
          alphaTwo = alphaTwo + thetaOne;
       }
       System.out.println("Alpha-Sub One: " + alphaOne);
       System.out.println("Alpha-Sub Two: " + alphaTwo);
       System.out.println("Theta-Sub One: " + thetaOne);
    }
}
