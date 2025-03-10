import java.util.Scanner;

public class conditional3 {
        public static void main(String[] args) {
            int ch;
            System.out.println("enter a character:");
            Scanner obj=new Scanner(System.in);
            ch=obj.nextInt();
            if(ch=='A'&& ch=='z'){
                System.out.println("upper Alphabets");
            }
            else if(ch>='a' && ch<='z'){
                System.out.println("lower alphabets");
            }
            else if(ch>='0' && ch<='9'){
                        System.out.println("numbers");
            }
            else{
                System.out.println("symbol");
            }
    }

}
