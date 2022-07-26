import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total, i, n = 0;
        int maxValue = 1, minValue = 1;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz?: ");
        total = inp.nextInt();
        for (i = 1; i <= total; i++) {
            System.out.println(i + ". Sayiyi giriniz: ");
            n = inp.nextInt();

            if (total <= 1) {
                System.out.println("Birden fazla sayı ekleyin.");
            } else {
                if (n > maxValue) {
                    maxValue = n;
                } else if (n < minValue) {
                    minValue = n;
                }
            }

        }
        System.out.println("En Buyuk Sayi : " + maxValue);
        System.out.print("En Kucuk Sayi : " + minValue);

    }
}