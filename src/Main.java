import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A : ");
        int A = scanner.nextByte();
        System.out.println("Enter B : ");
        int B = scanner.nextInt();
        int output = findCheckBit(A, B);
        System.out.println("Output : " + output);
    }

    private static int findCheckBit(int a, int b) {
        if ((a & (1 << b)) == 0){
            return 0;
        }
        else {
            return 1;
        }
    }
}