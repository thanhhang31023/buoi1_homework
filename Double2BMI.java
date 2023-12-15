package buoi1.homework;
// Câu 1: Viết chương trình tính chỉ số BMI
//Công thức tính: cân nặng/ (chiều cao * chiều cao)
//Với chiều cao đo bằng met và cân nặng là kg
//Thực hiện:
//Viết phương thức tính BMI có kiểu trả về là void
//Viết phương thức tính BMI có kiểu trả về là double
//Viết phương thức tính BMI có kiểu trả về là double và có truyền tham số
//So sánh sử dụng phương thức nào là tốt nhất

/////////////////////// Viết phương thức tính BMI có kiểu trả về là double và có truyền tham số////////////////
import java.util.Scanner;
public class Double2BMI {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập vào cân nặng (kg):");
            double weight = scanner.nextDouble();

            System.out.println("Nhập vào chiều cao (m):");
            double height = scanner.nextDouble();

            double bmi = calculateBMI(weight, height);

            System.out.println("Chỉ số khối cơ thể (BMI) là: " + bmi);
        }

        public static double calculateBMI(double weight, double height) {
            return weight / Math.pow(height, 2);
        }
    }

// pt 3: sẽ tính toán dựa trên các giá trị được truyền vào,  trả về kq dữ liệu là double, có thể tái sử dụng đc kết quả.
//->  dùng khi muốn người dùng nhập vào cân nặng và chiều cao.

// vì vậy, sử dụng pt nào là tốt nhất sẽ phụ thuộc vào tình huống sử dụng.

