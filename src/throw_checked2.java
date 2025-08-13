import java.io.IOException;

public class throw_checked2 {
    public static void main(String[] args) {
        checkfile();
    }
    public static void checkfile(){
        try {
            throw new IOException("File cannot be openned.");
        }
        catch (IOException e){
            System.out.println(" Possible exception: " +e);
        }
    }
}
