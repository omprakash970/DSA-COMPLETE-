public class Get_the_ith_bit {
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) != 0 ){
            return 1; 
        }else{
            return 0;
        }

    }
    public static void main(String[] args) {
        System.out.println(getIthBit(5, 1)); // Example usage
    }
    
}
