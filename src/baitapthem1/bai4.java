package baitapthem1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = Integer.parseInt(scanner.nextLine());
        int sum =0;

        for (int i = 1; i<n; i++) {
           if (n%i ==0){
               sum = sum+i;
           }
        }
        if (sum==n){
            System.out.printf("so %d la so hoan hao\n", n);

        }else {
            System.out.printf("so %d khong phai la so hoan hao\n", n);
        }



    }

}
