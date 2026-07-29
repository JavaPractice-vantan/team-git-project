package app;

import java.util.Scanner;

public class Addition {

	public static void execute(Scanner scanner) {

		System.out.println("=== 足し算 ===");

		System.out.print("1つ目の数値を入力してください：");
		double num1 = scanner.nextDouble();

		System.out.print("2つ目の数値を入力してください：");
		double num2 = scanner.nextDouble();

		double result = num1 + num2;

		System.out.println("計算結果：" + result);
	}
}