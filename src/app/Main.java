package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("=====四則演算プログラム=====");
		System.out.println("=======メニュー一覧=======");
		System.out.println("1: 足し算プログラム");
		System.out.println("2: 引き算プログラム");
		System.out.println("3: 掛け算プログラム");
		System.out.println("4: 割り算プログラム");
		System.out.print("実行する演算を選択してください: ");

		int menuNumber = scanner.nextInt();

		if (menuNumber == 1) {

		} else if (menuNumber == 2) {

		} else if (menuNumber == 3) {

		} else if (menuNumber == 4) {

		} else {
			System.out.println("1から4の整数で入力してください。");
		}

		scanner.close();

	}
}