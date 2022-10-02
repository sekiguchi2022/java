package test1;

import java.util.Arrays;
import java.util.Scanner;

public class Question09 {

	public static void main(String args[]) {

		//Scanner生成
		Scanner scanner = new Scanner(System.in);

		//メッセージ出力
		System.out.println("5つの整数を入力してください");

		int input = 0;

		//入力された整数を変換後int型変数に格納
		input = Integer.parseInt(scanner.nextLine());

		//入力された整数をint型配列arrayに格納
		int[] array = new int[input];

		//①入力された5つの整数分ループ
		for (int i = 0; i < 5; i++) {

			//入力された整数に従い個数に1加算
			System.out.print((i + 1) + "個目:");

			array[i] = Integer.parseInt(scanner.nextLine());

		}
		//②昇順ソートするためのループ
		for (int i = 0; array[i] < 5; i++) {
			//配列の中の要素を昇順にソート
			Arrays.sort(array);

		}
		//メッセージ出力
		System.out.println("昇順ソート結果は" + array + "です");

		//③配列の中の要素を取り出す
		for (int x : array) {

			// 配列の中身を表示
			System.out.print(x);

		}

	}

}
