package baitapthem1;

import java.util.Scanner;

public class baisohai {
    public static void main(String[] args) {
        int m;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so m ");
        m = scanner.nextInt();
        for (int i = 0; i<=m; i++){
            if (i % 2 !=0){
                System.out.println(i);
                total = total+i;

            }
        }
        System.out.println("tong cua cac so le la:" + total);
    }
}
