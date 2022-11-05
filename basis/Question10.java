package test1;

import java.util.Scanner;

public class Question10 {
	public static void main(String args[]) {

		//Scanner生成
		try (Scanner scanner = new Scanner(System.in);) {

			//メッセージ出力
			System.out.println("整数を入力してください");

			//入力された数をint型変数inputに格納
			int input = Integer.parseInt(scanner.nextLine());

			//debug
			//System.out.println(input);

			//2倍するprintCalculateDoubleメソッドの呼び出し
			printCalculateDouble(input);
			//2乗するprintCalculateSquareメソッドの呼び出し
			printCalculateSquare(input);

			//	System.out.println(ans1);
			//	System.out.println(ans2);

		} catch (NumberFormatException e) {
			//整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");

		}

	}

	//20行目から呼び出されたメソッド(引数なし)
	public static void printCalculateDouble(int input) {

		int ans1 = input * 2;
		//引数を2倍した結果を出力する
		System.out.println("入力された" + " " + input + " " + "を2倍した値は" + " " + ans1 + " " + "です");

	}

	//22行目から呼び出されたメソッド(引数なし)
	public static void printCalculateSquare(int input) {

		int ans2 = input * input;
		//引数を2乗した結果を出力する
		System.out.println("入力された" + " " + input + " " + "を2乗した値は" + " " + ans2 + " " + "です");

	}
}
