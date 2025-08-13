public class Finally_class {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block,,,,,,");
            int data = 35/0;
        }
        catch (NullPointerException e){
            System.out.println("Inside Catch Block,");
            System.out.println("Possible Exception: " + e);
        }
        finally {
            testcase();
            System.out.println("Inside a finally block.");
            System.out.println("Finally block is always executed.");
            testcase();
        }
//        It won't be executed because exception is not handled and program won't reach here.
        testcase();
    }
    public static void testcase(){
        try{
            int data = 44/0;
        }
        catch (Exception e){
            System.out.println("Posssible exception: ......" + e);
        }
        finally {
            System.out.println("finally block.");
        }
    }
}
