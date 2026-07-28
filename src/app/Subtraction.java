package app;

import java.util.Scanner;

public class Subtraction {

	public static void execute(Scanner scanner) {

		System.out.println("=== 引き算 ===");

		System.out.println("1つ目の数値を入力してください：");
		double number1 = scanner.nextDouble();

		System.out.println("2つ目の数値を入力してください：");
		double number2 = scanner.nextDouble();

		double result = number1 - number2;

		System.out.println("計算結果：" + result);
	}

}
