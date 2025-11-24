public class check_even_or_odd {
    public static void check(int n){
        int bitMask = 1;
        if((n & bitMask) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
    public static void main(String[] args) {
        check(1221981);

    }
}
