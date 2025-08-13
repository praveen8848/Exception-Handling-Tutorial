public class Exception_2 {
    public static void main(String[] args) {
        int  i = 50;
        int j = 0;
        int data;
        try {
             data = i/j;
        }
        catch (Exception e){
            System.out.println("Possible Exception in program. " + e);
        }
        finally {
            System.out.println(i + 4);
        }
        System.out.println("Rest of the code.");
    }
}
