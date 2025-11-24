/*
Binary XOR (^):
Rules:
1^1=0
1^0=1
0^1=1
0^0=0
Example:
5^3
5=101
3=011
    -----
    110=6
*/

import java.util.*;
public class Binary_XOR {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        int result=a^b;
        System.out.println("The result of "+a+" ^ "+b+" is: "+result);
        sc.close();
    }
    
}
