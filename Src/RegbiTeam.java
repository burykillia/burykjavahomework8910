public class RegbiTeam {
    public static void main (String[] args){
        int ft [] = new int [25];
        int st [] = new int [25];
        int ftSum = 0;
        int stSum = 0;
        for (int i = 0; i < 25; i++) {
             ft[i] = (int) (Math.random() * (40-18) + 18);
             st[i] = (int) (Math.random() * (40-18) + 18);
             ftSum += ft[i];
             stSum += st[i];
        }
        System.out.print("Вік гравців першої команди: ");
        for (int i = 0; i < 25; i++) {
            System.out.print(ft[i] + " ");
        }
        System.out.println();
        System.out.print("Вік гравців другої команди: ");
        for (int i = 0; i < 25; i++) {
            System.out.print(st[i] + " ");
        }
        System.out.println();
        System.out.print("Середній вік гравців першої команди: " + (double)ftSum / (double)ft.length);
        System.out.println();
        System.out.print("Середній вік гравців другої команди: " + (double)stSum / (double)st.length);
    }
}
