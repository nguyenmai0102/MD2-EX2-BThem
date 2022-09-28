package baitapthem1;

import java.util.Scanner;

public class baithem3 {
    // so nguyen to
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println( number+ "is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                check = false;
                break;
            }
           i++;
        }
        if (check)
            System.out.println("this is a prime");
         else
            System.out.println("this is not prime");


      }


        }

    }
