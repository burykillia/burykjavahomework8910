import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fNum = (int) (Math.random() * 10);
        int cTry = 0;
        System.out.println("Вгадайте число від 0 до 10");
        while (true) {
            System.out.println("Введіть число:");
            int inNum = in.nextInt();
            if (inNum == fNum) {
                cTry++;
                System.out.println("Ви вгадали, загадане число " + inNum);
                System.out.println("Кількість спроб: " + cTry);
                break;
            } else if (inNum > fNum) {
                cTry++;
                System.out.println("Загадане число менше, спробуйте ще раз");
            } else {
                cTry++;
                System.out.println("Загадане число більше, спробуйте ще раз");
            }
        }
        in.close();
    }
}
