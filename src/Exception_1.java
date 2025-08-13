public class Exception_1 {
    public static void main(String[] args) {
        try {
            int data = 50/0;
        }
        catch (ArithmeticException e){
            System.out.println(" It is the case of  " + e);
        }
        System.out.println("Rest of the code.");
    }
}
