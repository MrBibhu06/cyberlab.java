import java.util.Scanner;

public class Looping5 {
    public static void main(String[] args) {
        int num, i;
        System.out.print("Enter the numbeer=");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        for (i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}



