import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        System.out.println("_Travel Management_");
        journey();
        source();
        hotel();
        duration();
    }
    public static void journey() {
        int ch;
        System.out.println("Enter the place ur choice\t1,\t2,\t3\nEnter😊:");
        Scanner obj = new Scanner(System.in);
        ch = obj.nextInt();
        switch (ch) {
            case 1:
                System.out.println("1.Berhampur to Puri");
                break;
            case 2:
                System.out.println("2.Berhampur to BBSR");
                break;
            case 3:
                System.out.println("3.Berhampur to Kerala");
        }
    }

    public static void source() {
        int so;
        int g;
        System.out.println("Enter your Source AS ur Choice \t1,\t2,\t3 \nENTER🖱️:");
        Scanner obj = new Scanner(System.in);
        so = obj.nextInt();
        switch (so) {
            case 1:
                System.out.println("CAR🚗");
                break;
            case 2:
                System.out.println("TRAIN🚄");
                break;
            case 3:
                System.out.println("PLANE✈️");
                break;
        }
        System.out.println("Enter the source you have choice:");
        g = obj.nextInt();
        if (g == 1) {
            System.out.println("RENT FOR CAR=2000");
        } else if (g == 2) {
            System.out.println("RENT FOR TRAIN=800");
        } else if (g == 3) {
            System.out.println("RENT FOR PLANE1=8000");
        }
    }
    public static void hotel(){
        int ho;
        int h;
        System.out.println("ENTER THE HOTEL AS UR CHOICE🏨1\t,2\t,3\t \nENTER😊:");
        Scanner obj=new Scanner(System.in);
        ho= obj.nextInt();
        switch (ho){
            case 1:
                System.out.println("7 STAR🌟");
                break;
            case 2:
                System.out.println("5 STAR⭐");
                break;
            case 3:
                System.out.println("LUXRIOUS STAR💫");
                break;
        }
        System.out.println("Enter the HOTEL you have choice:");
        h= obj.nextInt();
        if (h == 1) {
            System.out.println("RENT FOR 7 STAR🌟=2000");
        } else if (h == 2) {
            System.out.println("RENT FOR 5 STAR⭐=800");
        } else if (h == 3) {
            System.out.println("RENT FOR LUXRIOUS STAR💫1=8000");
        }
    }
    public static void duration(){
        int du;
        int d;
        System.out.println("ENTER A DURATION A UR WISH🌟1\t,2\t,3\t \nENTER😊");
        Scanner obj=new Scanner(System.in);
        du= obj.nextInt();
        switch (du){
            case 1:
                System.out.println("6 MONTH😊");
                break;
            case 2:
                System.out.println("3 MONTH🙂");
                break;
            case 3:
                System.out.println("ONLY ONE DAY VACATION 🌟");
                break;
        }
        System.out.println("Enter the DURATION you have choice:");
        d= obj.nextInt();
        if (d == 1) {
            System.out.println("RENT FOR 6 MONTH DURATION🌟=6000");
        } else if (d == 2) {
            System.out.println("RENT FOR 3 MONTH DURATION⭐=3500");
        } else if (d == 3) {
            System.out.println("RENT FOR ONE DAY VACATION DURATION💫1=1800");
        }
    }
}

