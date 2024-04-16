package buoi1.homework;

// Câu 1: Viết chương trình tính chỉ số BMI
//Công thức tính: cân nặng/ (chiều cao * chiều cao)
//Với chiều cao đo bằng met và cân nặng là kg
//Thực hiện:
//Viết phương thức tính BMI có kiểu trả về là void
//Viết phương thức tính BMI có kiểu trả về là double
//Viết phương thức tính BMI có kiểu trả về là double và có truyền tham số
//So sánh sử dụng phương thức nào là tốt nhất

///////////////////// phương thức tính BMI có kiểu trả về là void////////////////////////////////////////////

public class VoidBMI {

        public static void main(String[] args) {
            double weight = 48.0; // cân nặng (kg)
            double height = 1.56; // chiều cao (m)

            double bmi = weight / (height*height);

            System.out.println("Chỉ số khối cơ thể (BMI) là: " + bmi);
        }
    }

// So sánh sử dụng phương thức nào là tốt nhất:
//pt 1: sẽ sử dụng các giá trị đã được khởi tạo cho đối tượng,không trả về bất kỳ giá trị nào,
// nó sẽ thực hiện các hành động được định nghĩa bên trong nó vd như tính bmi và in ra
// -> dùng khi muốn tính và in ra BMI ngay lập tức, ko tái sử dụng đc kết quả.

