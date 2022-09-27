package baitapthemso2;

import java.util.Scanner;

public class btthem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum;

        do {
            System.out.println("*************manu*********************");
            System.out.println("Nhập thông tin sinh viên");
            System.out.println("Hiển thị thông tin sinh viên");
            System.out.println("Tính tuổi sinh viên");
            System.out.println(" Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    // nhap thong tin sinh vien
                    System.out.printf("input name");
                    String name = scanner.nextLine();
                    System.out.printf(" input yearBorn");
                    String yearBorn = scanner.nextLine();
                    System.out.printf("input address");
                    String address = scanner.nextLine();
                    System.out.printf("input numberPhone");
                    String numberPhone = scanner.nextLine();
                case 2:
                    // hien thi thong tin sinh vien
//                    System.out.printf("input name");
//                    String name = scanner.nextLine();
//                    System.out.printf(" input yearBorn");
//                    String yearBorn = scanner.nextLine();
//                    System.out.printf("input address");
//                    String address = scanner.nextLine();
//                    System.out.printf("input numberPhone");
//                    String numberPhone = scanner.nextLine();

//                    System.out.printf("%d\n", "student name is", name);
//                    System.out.printf("%s\n", "student yearBorn is", yearBorn);
//                    System.out.printf("%d\n", "student address is", address);
//                    System.out.printf("%d\n", "student numberPhone is", numberPhone);
//

                case 3:
                    // tinh tuoi sinh vien

                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-4");
            }
        } while (true);

    }
}

