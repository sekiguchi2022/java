package test1;

import java.util.Scanner;

public class Question09 {

	public static void main(String args[]) {

///		int Max = 0;
//		int Min = 0;

		//Scanner生成
		Scanner scanner = new Scanner(System.in);

		//メッセージ出力
		System.out.println("5つの整数を入力してください");

		//入力された整数をint型配列arrayに格納
		int[] array = new int[5];

		//入力された5つの整数分ループ
		for (int i = 0; i < 5; i++) {

			//入力された整数に従い個数に1加算
			System.out.print((i + 1) + "個目:");

			//入力された整数を変換後int型変数に格納
			int input = Integer.parseInt(scanner.nextLine());

			array[i] = input;

		}
		//配列の中の要素を取り出す
		//				for (int x : array) {
		//
		//					// 配列の中身を表示
		//					System.out.print(x);
		//
		//				}

		//配列の中の要素を昇順にソート
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;

				}

			}
		}
		System.out.print("昇順ソート結果は");
		//debug
		for (int x : array) {
			System.out.print(x);

		}

		System.out.println("です");

		int intMax = array[4];
		int intMin = array[0];
		System.out.println("最大値は" + intMax + "です");
		System.out.println("最小値は" + intMin + "です");

	}
}
