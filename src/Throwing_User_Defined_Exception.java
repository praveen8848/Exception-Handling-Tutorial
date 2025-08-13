public class Throwing_User_Defined_Exception {
    public static void main(String[] args) {
        try {
            throw new UserDefined("This is user-defined exception.");
        }
        catch (UserDefined e) {
            System.out.println("Caught the exception.");
            System.out.println("Possible exception : " + e);
        }
        System.out.println("Rest of the code.");
    }
}
class UserDefined extends Exception{
    public UserDefined(String str){
        super(str);
    }
}
