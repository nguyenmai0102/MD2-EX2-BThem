package baitapthem1;

import java.util.Scanner;

public class baitapthem6 {
    public static void main(String[] args) {

// in ra cac so uoc cua so cua n va tinh tong
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n");
        n = scanner.nextInt();
        System.out.printf("cac uoc so cua %d la: \n", n);
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                //i la uoc cua n
                System.out.printf("%d\t", i);
                sum =sum+ i;
            }
            System.out.printf("\n tong cac uoc cua %d la : %d\n", n, sum);
            break;
        }
    }
}

