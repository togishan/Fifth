import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        double l1, l2;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Lutfen kilonuzu kilogram cinsinden girin :");
        l1 = input.nextDouble();

        System.out.print("\nLutfen boyunuzu metre cinsinden girin : ");
        l2 = input2.nextDouble();

        System.out.print("\nVucut Kitle Indeksiniz :" + l1 /(l2*l2));
    }
}