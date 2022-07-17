package test1;

import java.util.Scanner;

public class Question05 {
	public static void main(String args[]) {

		//Scanner生成
		Scanner scanner = new Scanner(System.in);

		System.out.println("整数100を入力された値で割り算します");
		System.out.println("割り算する整数を入力してください");

		try {

			//整数の入力
			String str = scanner.nextLine();
			//String型変数strをint型に変換
			int input = Integer.parseInt(str);

			int ans = 0;
			//100を入力された整数で割る
			ans = 100 / input;

			System.out.println("割り算結果は" + ans + "です");

			//整数以外の値が入力された場合
		} catch (NumberFormatException e) {

			System.out.println("整数以外の値が入力されました");

			//入力された整数が0の場合
		} catch (ArithmeticException ae) {

			System.out.println("0では割り算できません");

		}
		System.out.println("終了");
		//scannerクローズ
		scanner.close();
	}
}