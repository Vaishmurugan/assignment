import java.util.Scanner;

public class thirdtestbench {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        int bitwiseAnd = firstNumber & secondNumber;         
        int bitwiseOr = firstNumber | secondNumber;           
        int bitwiseXor = firstNumber ^ secondNumber;         
        int firstNumberLeftShift = firstNumber << 2;          
        int secondNumberLeftShift = secondNumber << 2;       
        int firstNumberRightShift = firstNumber >> 2;         
        int secondNumberRightShift = secondNumber >> 2;       

        System.out.println("\nBitwise Operation Results");
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("First number left shifted by 2 bits: " + firstNumberLeftShift);
        System.out.println("Second number left shifted by 2 bits: " + secondNumberLeftShift);
        System.out.println("First number right shifted by 2 bits: " + firstNumberRightShift);
        System.out.println("Second number right shifted by 2 bits: " + secondNumberRightShift);

    }
}
