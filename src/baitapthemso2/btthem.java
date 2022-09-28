package baitapthemso2;

import java.util.Scanner;

public class btthem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId ="", studentName="", phone="", email="", address="";
        int year=2022;
        int age =0;

        do {
            System.out.println("*************manu*********************");
            System.out.println("Nhập thông tin sinh viên");
            System.out.println("Hiển thị thông tin sinh viên");
            System.out.println("Tính tuổi sinh viên");
            System.out.println(" Thoát");
            System.out.println(" su lua chon cua ban");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    // nhap thong tin sinh vien

                    System.out.printf("input id\n");
                    studentId = scanner.nextLine();
                    System.out.printf("input name \n");
                     studentName = scanner.nextLine();
                    System.out.printf(" input yearBorn \n");
                    year = scanner.nextInt();
                    System.out.printf("input numberPhone\n");
                    scanner.nextLine();
                    phone= scanner.nextLine();
                    System.out.printf("input email \n");
                    email = scanner.nextLine();
                    System.out.printf("input address \n");
                    address = scanner.nextLine();
                    break;
                case 2:
                    ///hien thi thong tin sinh vien


                    System.out.printf("Student Id: %s\n ", studentId);
                    System.out.printf("Student Name: %s \n", studentName);
                    System.out.printf("year born: %s\n", year);
                    System.out.printf("number phone: %s\n ", phone);
                    System.out.printf("Email: %s \n ", email);
                    System.out.printf("Address: %s  \n", address);
                    break;

                case 3:
                    // tinh tuoi sinh vien
                    age=2022 -year;
                    System.out.println("so tuoi cua sinh vien la: "+ age);
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-4");
            }
        } while (true);

    }
}

