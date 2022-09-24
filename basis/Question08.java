package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Question08 {
	public static void main(String args[]) {

		//Scanner生成
		Scanner scanner = new Scanner(System.in);

		//メッセージ出力
		System.out.println("整数の数を入力してください");

		int inputNum = Integer.parseInt(scanner.nextLine());

		ArrayList<Integer> input = new ArrayList<Integer>();

		//整数が0以下か判定
		if (inputNum <= 0) {

			//メッセージ出力
			System.out.println("整数の各値をを入力してください");

			//処理終了
			return;
		}

		//ArrayList宣言
		ArrayList<Integer> array = new ArrayList<>();

		//入力された整数の数に応じてループ
		for (int i = 0; i < inputNum; i++) {

			//入力された整数に従い個数に1を加算
			System.out.println((i + 1) + "個目");

		}

		//入力された整数をArrayListへ格納
		inputNum = Integer.parseInt(scanner.nextLine());

		//ArrayListの要素を取り出す
		input.size();

		//}

		int sum = 0;

		//メッセージ出力
		System.out.print("入力された数は");

		for (int sum : array) {
			//メッセージ出力
			System.out.println(sum + " ");

		}
	}
}
//try (Scanner scanner = new Scanner(System.in);) {

//}