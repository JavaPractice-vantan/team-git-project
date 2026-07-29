package app;

import java.util.Scanner;

public class Division {

	public static void execute(Scanner scanner) {

		System.out.println("割り算");

		System.out.print("1つ目の数値を入力してください: ");
		double num1 = scanner.nextDouble();

		System.out.print("2つ目の数値を入力してください: ");
		double num2 = scanner.nextDouble();

		if (num2 == 0) {
			System.out.println("0で割ることはできません。");
			return;
		}

		double result = num1 / num2;

		System.out.println("計算結果: " + result);
	}
}