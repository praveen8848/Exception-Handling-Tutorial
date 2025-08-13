public class Exception_3 {
    public static void main(String[] args) {
        try {
            int data = 12/0;
        }
        catch (Exception e){
            System.out.println(" Possible Exception : " + e);
        }
        System.out.println("Rest of the code.");
    }
}
