package buoi1.homework;

// Câu 2: Tạo Class về hình tròn, hình chữ nhật và hình tam giác, thực hiện tính chu vi và diện tích cho các hình

/////////////////// HÌnh tròn///////////////////////

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bán kính của hình tròn:");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Chu vi của hình tròn là: " + circumference);
        System.out.println("Diện tích của hình tròn là: " + area);
    }
}