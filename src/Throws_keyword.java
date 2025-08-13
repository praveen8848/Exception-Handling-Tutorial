public class Throws_keyword {
    public static void main(String[] args) {
        try {
            test t = new test();
            System.out.println("Calling exception class");
            t.p();
        }
        catch (Exception e){
            System.out.println("Exception caught. " + e);
        }
    }
}
class test{
    void m() throws Exception{
        System.out.println("Exception block.");
        throw new Exception("Exception thrown.");

    }

    void n() throws Exception{
        System.out.println(" block 2.");
        m();
    }
    void p() throws Exception{
        System.out.println("block1");
        n();
    }
}
