public class Multi_Catch_block_1 {
    public static void main(String[] args) {
        int[] ans = new int[10];
        try {
//            It is gonna act on the first Exception ignores the second one.
            ans[2] = 5/0;
            ans[12] = 55;
        }
        catch (ArithmeticException e){
            System.out.println("Possible Exception: " + e1);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Index out of Bound Exception." + e);
        }
        System.out.println();
        System.out.println("Multi catch block case.");
    }
}
