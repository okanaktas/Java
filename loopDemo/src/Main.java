public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Tek sayilar: " + i);
        }
        System.out.println("For dongusu bitti");


        int i = 1;

        while (i < 10) {
            System.out.println(i);
//infinite loop(eger 'i' yi arttırmazsak sonsuz dongu olur)
            i++;
        }
        System.out.println("While Dongusu bitti");
    }
}
