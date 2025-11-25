


public class Set_the_ith_bit {
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0; 
        }
        return 1; 
    }
    public static void main(String[] args){
        System.out.println(setIthBit(5, 1)); // Example usage
    }
    
}
