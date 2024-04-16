package buoi1.homework;

// Câu 1: Viết chương trình tính chỉ số BMI
//Công thức tính: cân nặng/ (chiều cao * chiều cao)
//Với chiều cao đo bằng met và cân nặng là kg
//Thực hiện:
//Viết phương thức tính BMI có kiểu trả về là void
//Viết phương thức tính BMI có kiểu trả về là double
//Viết phương thức tính BMI có kiểu trả về là double và có truyền tham số
//So sánh sử dụng phương thức nào là tốt nhất

////////////////////////////phương thức tính BMI có kiểu trả về là double//////////////////////////////////////

public class DoubleBMI {


        public static void main(String[] args) {
            double weight = 50.0; // cân nặng (kg)
            double height = 1.63; // chiều cao (m)

            double bmi = calculateBMI(weight, height);

            System.out.println("Chỉ số khối cơ thể (BMI) là: " + bmi);
        }

        public static double calculateBMI(double weight, double height) {
            return weight / (height*height);
        }
    }

// pt 2:  sẽ sử dụng các giá trị đã được khởi tạo cho đối tượng, trả về kq dữ liệu là double, có thể tái sử dụng đc kết quả.
//-> dùng khi muốn sử dụng giá trị BMI sau này.
