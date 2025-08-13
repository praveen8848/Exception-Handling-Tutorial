public class Nested_Try_Block {
    public static void main(String[] args) {
        int[] ans = new int[5];
        try {
            int x = 5/0;
            try {
                ans[3] = x;
                try {
                    ans[6] = 4;
                }
                catch (Exception e){
                    System.out.println("Possible Exception 1: "+ e);
                }
            }
            catch (Exception e){
                System.out.println();
                System.out.println(" Possible Exception 2: " + e);
            }
        }
        catch (Exception e){
            System.out.println();
            System.out.println("Possible Exception 3: " + e);
        }
        System.out.println();
        System.out.println("Case of Multiple try Catch block.");

    }
}
