package buoi1.homework;
// Câu 2: Tạo Class về hình tròn, hình chữ nhật và hình tam giác, thực hiện tính chu vi và diện tích cho các hình

////////////////////////Hình tam giác /////////////////////////////////////////

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chiều dài cạnh thứ nhất của hình tam giác:");
        double side1 = scanner.nextDouble();

        System.out.println("Nhập vào chiều dài cạnh thứ hai của hình tam giác:");
        double side2 = scanner.nextDouble();

        System.out.println("Nhập vào chiều dài cạnh thứ ba của hình tam giác:");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;
        double semiPerimeter = perimeter / 2; // tính nửa chu vi
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

        System.out.println("Chu vi của hình tam giác là: " + perimeter);
        System.out.println("Diện tích của hình tam giác là: " + area);
    }
}