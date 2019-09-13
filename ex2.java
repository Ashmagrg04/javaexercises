import java.util.Random;
import java.util.Arrays;
public class ex2{
    public static void main(String[]args){
        //int numValues = 5;(
        int[] scores = rangeCount(20);
        int a =inRange(scores,0,5);
        System.out.println(a);
        
  
     }
    
     public static int[] rangeCount(int size){
         Random random = new Random();
         int []a =new int [size];
         for (int i=0;i<a.length;i++){
             a[i]=random.nextInt(size);
    }
    return a;
   }
    public static int inRange (int[]a,int low  ,int high){
        int count =0;
        for(int i=0;i<a.length;i++){
            if (a[i]>=low && a[i]<high){
                count++;
            }
            
        }
        return count;
        }
}