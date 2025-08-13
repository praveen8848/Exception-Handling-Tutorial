import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

// throw keyword for checked exception.

public class throw_checked_Ex {
    public static void main(String[] args) {
        try {
            checked();
        }
        catch (IOException e){
            System.out.println("Possible exception: " + e);
        }

    }
    public static void checked() throws  IOException {
        throw new IOException("File not found");
    }
}
