package ex407;

import java.util.Arrays;
import java.util.List;

public class bai1 {

	public static void main(String[] args) {
		List<Double> numbers = Arrays.asList(1.2, 3.4, 5.6, 7.8, 9.0);

		// Sử dụng biểu thức lambda để tính tổng của các số trong danh sách
		double sum = numbers.stream().mapToDouble(Double::doubleValue).sum();

		// Tính giá trị trung bình
		double average = sum / numbers.size();

		// In ra giá trị trung bình
		System.out.println("Giá trị trung bình của danh sách là: " + average);

	}

}
