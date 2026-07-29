package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Multiplication の execute メソッドを呼び出す
		Multiplication.execute(scanner);

		scanner.close();
	}

}