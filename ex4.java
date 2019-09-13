

public class ex4{
    
    public static void main(String[]args){
        
        
        ex2 random = new ex2();
        int[] values = random.rangeCount(15);
        
         
         for (int value : values){
             System.out.println(value);
        }
    }
}
        