
/*
Binary 1's compliment (~):
Rules:
~1=0
~0=1
Example:
5~
5=101
    -----
    010=2
 */






import java.util.*;
class Binary_1s_compliment {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int result = ~a;
        System.out.println("The 1's compliment of " + a + " is: " + result);
        sc.close();
        

    }
}
