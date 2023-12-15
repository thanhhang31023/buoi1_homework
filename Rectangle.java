package buoi1.homework;

// Câu 2: Tạo Class về hình tròn, hình chữ nhật và hình tam giác, thực hiện tính chu vi và diện tích cho các hình

////////////////////////Hình chữ nhật /////////////////////////////////

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chiều dài của hình chữ nhật:");
        double length = scanner.nextDouble();

        System.out.println("Nhập vào chiều rộng của hình chữ nhật:");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }
}
