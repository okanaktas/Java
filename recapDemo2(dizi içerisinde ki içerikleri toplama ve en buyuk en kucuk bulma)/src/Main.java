public class Main {

    public static void main(String[] args) {
        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        for (double list : myList) {
            if (max < list) {
                max = list;
            }

            System.out.println("Dizideki icerik: " + list);
            total = total + list;

        }
        System.out.println("Sayilar toplami: " + total);
        System.out.println("Sayilarin en buyugu: " + max);
    }
}
