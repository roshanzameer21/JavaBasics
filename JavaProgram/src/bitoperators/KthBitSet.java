package bitoperators;

public class KthBitSet {
    public static void main(String[] args){
        int n = 13;
        int k = 3;

        /*//Method one by using left shift operators
            n = 0 0 0 0 . . . . . 1 0 1 (32-bit representation of five )
            k = 0 0 0 0 . . . . . 0 1 1 (32- bit representation of three)

            now, take 0 0 0 0 . . . 1 (32- bit representation of one) and perform
                left shift to (k - 1)

            i.e., 0 0 0 0 0 . . 0 0 1 (32- bit representation of one)
                  0 0 0 0 0 . . 1 0 0 (32- bit representation of one left shifted by k-1 bits)

            now, n = 0 0 0 0 . . . . . 1 0 1 (32-bit representation of five )
        1 << (k-1) = 0 0 0 0 0 . . . . 1 0 0
            --------------------------------------
            & opeeration give 0 0 0 0 . . . . 1 0 0 (only Kth bit is 1 which means it's a set bit in n)
*/

        if((n&(1<<(k-1))) != 0)
            System.out.println("Kth bit is set");
        else
            System.out.println("Kth bit is not set");

        //Method by using right shift
        if(((n>>(k-1))&1) == 1)
            System.out.println("Kth bit is set");
        else
            System.out.println("Kth bit is not set");
    }
}
