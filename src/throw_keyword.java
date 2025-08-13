import java.util.Scanner;

public class throw_keyword {
    public static void main(String[] args) {
//        for unchecked exception that is exception that are not cehcked at compile time.
        System.out.print("Enter the age of a person:  \n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input<18){
            System.out.println("Using throw keyword for unchecked exception.");
            throw new ArithmeticException("Person is not eligible to vote.");
        }
        else{
            System.out.println("Do whatever youy want.");
        }
    }

}
