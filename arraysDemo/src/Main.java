public class Main {

    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Banu";
        ogrenciler[1] = "Yasemin";
        ogrenciler[2] = "Hande";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("---------------------------------");

        //ustteki for dongusunun sektorde kullanım sekli

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
