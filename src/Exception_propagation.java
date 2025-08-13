public class Exception_propagation {
    public static void main(String[] args) {
        EP exception = new EP();
        try {
            exception.p();
        }
        catch (Exception e){
            System.out.println("Possible Exception caught: " + e);
        }
    }

}
class EP{
    void m(){
        System.out.println("Exception block 3.");
        int d = 44/0;
    }

    void n(){
        System.out.println("Block 2");
        m();
    }

    void p(){
        System.out.println("Block 1");
        n();
    }
}
