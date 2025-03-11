 import java.util.Scanner;
    public class switch3 {
        public static void main(String[] args) {
            System.out.println("press 4(month in no. form 1,10,11,12)\n");// jan,oct,nov,dec//winter
            System.out.println("press 2(month in no. form 3,4,5,6)\n");// mar,apr,may,june //summer
            System.out.println("press 3(month in no. form 7,8,9)\n");// july,aug ,sep //raimfall
            System.out.println("press 1 (month in no. form 2)\n");// feb //Spring

            int mono;
            System.out.println("Enter your choice💁‍♂ here friend...");
            Scanner sc = new Scanner(System.in);
            mono = sc.nextInt();

            switch (mono) {
                default:
                    System.out.print("Friend!!!😊I think🤔 you enter any other choice😄...");
                    System.out.println("no problem error makes an human perfect😁..lets check once more");
                    break;
                case 1:
                    System.out.println("it's spring season!!!🍂🍃😌😮‍💨");
                    break;
                case 2:
                    System.out.println("It's summer season...cheers🥂😉🥭🥭");
                    break;
                case 3:
                    System.out.println("It's rainy season!!!let's play water😋😀togater..😉🤧😁🌧☂");
                    break;
                case 4:
                    System.out.println("It's winter season🍵❄🧊⛸☃🤧😅");
            }
            sc.close();
        }
    }

