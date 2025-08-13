import java.io.IOException;

public class Throws_keyword_type2 {

//  case 2:   Declaring exception but not handling it.
    public static void main(String[] args) throws IOException {
        M m = new M();
        System.out.println("Calling Exception block.");
        m.method();
    }
}
class M{
    void method() throws IOException{
        throw new IOException(" Random Exception.");
    }
}
