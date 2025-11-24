/*
left shift operator (<<):
rules:
1)When we left shift a number by n positions, it is equivalent to multiplying the number by 2^n.
2)Each left shift operation effectively adds a 0 to the right end of the binary representation of the number.
Example:
5<<1
5=101
    -----
   1010=10
5<<2
5=101
    -----
  10100=20
5<<3
5=101
    -----
 101000=40
2<<3
2=10
    -----
    10000=16

*/
import java.util.*; 
public class left_shit {
    public static void main(String[] args) {
         System.out.println(5 << 3);
    
    }   
}
