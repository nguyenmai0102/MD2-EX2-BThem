package baitapthem1;

import java.util.Scanner;

public class baisomot {
    // tong cac so chan la
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n");
        n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                sum = sum + i;

            }
        }

        System.out.println("tong cua cacs so chan la:" + sum);
    }
}
