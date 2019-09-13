import java.util.Random; import java.util.Arrays;
public static void main(String[]args){
  int numbers = 20;
  int[]a = randomArray(numbers);
  System.out.print(Arrays.toString(a));
}
public static int[]randomArray(intSize){
  Random random = newRandom();
  int[]a = newInt[size];
  
  for(int i=0; i<a.length; i++){
     a[i]=random.nextInt(20);
     }
     return a;
  }
  public static int inRange(int[]a, int low, int high){
    int count = 0;
    for(int i = 0; i < a.length; i++){
      if(a[i] >= low && a[i] < high){
       count++;  
      }
    }
    return count;
  }
  public static void main(String[]args){
   int[]stores = randomArray(90);
   int a = inRange(scores, 0.5);
   System.out.print(a);
  }
}
}
}