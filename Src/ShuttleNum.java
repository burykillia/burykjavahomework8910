public class ShuttleNum {
    public static void main(String[] args){

        int shuttle [] = new int[100];
        int tmp;
        int tmp2;
        for (int i = 0; i < shuttle.length; i++) {
            shuttle[i] = (int) (Math.random()*200);
        }
        for (int i = 0; i < shuttle.length; i++) {
            System.out.println("Шатл з номером: " + shuttle[i]);
        }
        System.out.println();
        for (int i = 0; i < shuttle.length; i++) {
            tmp = shuttle[i];
            while (tmp != 0){
                tmp2 = tmp % 10;
                tmp /= 10;
                if(tmp2 == 4 || tmp2 == 9){
                    shuttle[i] = 111;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < shuttle.length; i++) {
            System.out.println("Шатл з номером: " + shuttle[i]);
        }


    }
}
